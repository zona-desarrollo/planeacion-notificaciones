/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.infra.mail;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * Clase encargada de enviar notifaciones via mail, donde tambien se toman
 * y configuran los parametros como servidor, puerto, etc.
 * 
 * @author Yukio Arroyo Gomez ko.shironeko@outlook.com
 * 
 */
public class MailSender {

    private static final Logger LOGGER = LogManager.getLogger(MailSender.class);
    private static final Properties PROPS = System.getProperties();
    
    private MailSender(){}
    
    static {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("/datos/previene/config/infra.properties")) {

            String host;
            String auth;
            String port;
            String tls;

            prop.load(input);
            host = prop.getProperty("mail.host");
            port = prop.getProperty("mail.port");
            auth = prop.getProperty("mail.auth");
            tls = prop.getProperty("mail.tls");

            PROPS.put("mail.smtp.host", host);
            PROPS.put("mail.smtp.port", port);
            PROPS.put("mail.smtp.auth", auth);
            PROPS.put("mail.smtp.starttls.enable", tls);

        } catch (IOException ex) {
            LOGGER.error(ex);
        }

    }
    
    /**
     * Envia mail con las especificaciones de remitente, destinatario,asunto y cuerpo del mensaje
     * @param from el remitente de la nofiticacion
     * @param to el destinatario de la notificacion
     * @param subject el asunto de la notificacion
     * @param body la descripcion de la notificacion como tal
     */
    public static void sendMail(String from,    
                                String to,
                                String subject,
                                String body){
        Session session = Session.getInstance(PROPS, null);        
        sendEmail(session, from, to,subject,body);

    }
 
    private static void sendEmail(Session session, String fromEmail, String toEmail, String subject, String body) {
        try {
            MimeMessage msg = new MimeMessage(session);
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            msg.setFrom(new InternetAddress(fromEmail, "NoReply-JD"));
            msg.setReplyTo(InternetAddress.parse(toEmail, false));
            msg.setSubject(subject, "UTF-8");
            msg.setText(body, "UTF-8");
            msg.setSentDate(new Date());
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            Transport.send(msg);
        } catch (UnsupportedEncodingException | MessagingException e) {
            LOGGER.error(e);
        }
    }
     
}
