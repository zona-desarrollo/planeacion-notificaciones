/*
 *
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.config;

import java.util.Properties;

import javax.annotation.Resource;
import org.springframework.beans.factory.InitializingBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

/**
 * 
 * Clase de configuracion de los beans que son administrados por el contenedor de Spring
 * y que se usan a lo largo de la aplicacion, se declaran paquetes que contienen beans 
 * etiquetados, tambien aqui se configuran los parametros del sistema que son declarados desde un 
 * archivo properties ,como etiquetas para interfaz de usuario asi como parametros de infraestructura
 * 
 * @author arroyo gomez yukio (ko.shironeko@outlook.com)
 */
@Component (value = "appConfig")
@Configuration
@EnableAspectJAutoProxy
@ComponentScan (basePackages = "mx.gob.conabio.controller,mx.gob.conabio.domain.entities,mx.gob.conabio.aspects")
@PropertySources({@PropertySource("file:///datos/previene/config/environment.properties"),
                  @PropertySource("file:///datos/previene/config/infra.properties")})
public class AppConfig implements InitializingBean{
	
	
    
    @Resource
    private Environment environment;
    
    public static String rutaMatSoporteBase; 
    
    @Value ("${app.matSoporteBase}")
    private String matSoporteBase;
    
    @Value ("${mail.host}")
    private String host;
    
    @Value ("${mail.password}")
    private String password;

    @Value ("${mail.port}")
    private String port;
    
    @Value ("${mail.username}")
    private String username;
    
    @Value ("${mail.auth}")
    private String auth;
    
    @Value ("${mail.startttls}")
    private String starttls;
    
    @Value ("${session.PREEXPIRATIONTIME}")
    private String preexpirationTime;
    
    @Value ("${session.TIMEBEFORELOGOUT}")
    private String timeBeforeLogout;
    
    @Value ("${session.SESSIONTIMEOUT}")
    private String sessionTimeout;
    
    @Value("${app.disclaimersBase}")
	private String disclaimersBase;
    
    
    @Bean (name = "basePathToDocuments")
    public String getBasePathToDocuments() {
    	
		return this.disclaimersBase;
    }
    
    /**
     *
     * @return
     */
    @Bean (name = "mailSender")
    public MailSender getMailSender(){
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setHost(host);
        sender.setPassword(password);
        sender.setPort(Integer.valueOf(port));
        sender.setUsername(username);
        Properties props = new Properties();
        props.put("mail.smtp.auth",auth);
        props.put("mail.smtp.starttls.enable",starttls);
        sender.setJavaMailProperties(props);
        return sender;
    }


    @Bean (name = "simpleMailMessage")
    public SimpleMailMessage getSimpleMailMessage(){
        SimpleMailMessage smm = new SimpleMailMessage();
        smm.setFrom("especiesinvasoras@conabio.gob.mx");
        smm.setSubject("Recuperación de Contraseña");
        return smm;
    }
    
    
    public String getPreexpirationTime() {
        return preexpirationTime;
    }

    public void setPreexpirationTime(String preexpirationTime) {
        this.preexpirationTime = preexpirationTime;
    }

    public String getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(String sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public String getTimeBeforeLogout() {
        return timeBeforeLogout;
    }

    public void setTimeBeforeLogout(String timeBeforeLogout) {
        this.timeBeforeLogout = timeBeforeLogout;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        rutaMatSoporteBase = this.matSoporteBase;
    }
    
    
}
