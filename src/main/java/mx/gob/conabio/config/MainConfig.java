/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.config;

import javax.annotation.Resource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Clase de configuracion de algunas propiedades y componentes (servicios,beans)
 * revisar si es realmente necesaria esta configuracion dada la naturaleza dual de configuracion
 * de la aplicacion, porque se realiza configuracion tanto en xml como en clases de configuracion
 * 
 * @author arroyo gomez yukio (ko.shironeko@outlook.com)
 */
@Configuration
@ComponentScan (basePackages = "mx.gob.conabio.config,"
        + "mx.gob.conabio.repositories,"
       + "mx.gob.conabio.controller.divulgacion,"
       // + "mx.gob.conabio.controller.actividad,"
        + "mx.gob.conabio.domain.entities,"
        + "mx.gob.conabio.dinacat,"
        //+ "mx.gob.conabio.security,"
        + "mx.gob.conabio.service")
public class MainConfig {
    
    @Resource
    private Environment environment;
    
}
