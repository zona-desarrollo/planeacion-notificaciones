/* 
* Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.service;

import mx.gob.conabio.domain.entities.EeitActividades;
import mx.gob.conabio.domain.entities.actividad.seguimiento.EeitPlaneacionactividad;
import mx.gob.conabio.domain.entities.security.EeipUsuarios;
import mx.gob.conabio.infra.mail.MailSender;
import mx.gob.conabio.repositories.ActividadesRepository;
import mx.gob.conabio.repositories.PlaneacionRepository;
import mx.gob.conabio.repositories.security.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author koshi
 */
@Service(value="recordatoriosService")
public class RecordatoriosService {
    
   @Autowired
   private PlaneacionRepository planeacionRepository;
   
   @Autowired
   private ActividadesRepository actividadesRepository;
   
   @Autowired
   private UsuariosRepository usuariosRepository;
   
   
   
   public void generaNotificaciones(){
       
       int idActividad = 0;
       for(EeitPlaneacionactividad p: this.planeacionRepository.findAll()){
           idActividad = p.getEeitPlaneacionactividadPK().getIdActividad();
           EeitActividades act = this.actividadesRepository.findByIdActividad(idActividad);
           EeipUsuarios usuario = this.usuariosRepository.findByIdUsuario(act.getIdUsuario().getIdUsuario());
           enviaNotificacion(p, usuario);
       }
   }
   
   private void enviaNotificacion(EeitPlaneacionactividad planeacion,EeipUsuarios usuario){
        
        
        String message = "No reenviar este mensaje, es un mensaje automático enviado por el sistema PREVIENE.\n"
                    + "Notificación para la atención del seguimiento de la planeación : '\n"+
                    planeacion.getDescripcion() + "'";
        
        String to = usuario.getEmail();
        String from = "especiesinvasoras@conabio.gob.mx";
        String subject = "Seguimiento de la Planeación.";
        
        MailSender.sendMail(from, to, subject, message);        
    }
   
   
}
