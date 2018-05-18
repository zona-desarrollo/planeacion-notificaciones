/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.repositories.security;

import java.util.List;
import mx.gob.conabio.domain.entities.security.EeipUsuariosConsulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/** 
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Repository
@Component(value = "usuariosRepositoryConsultas")
public interface UsuariosRepositoryConsultas extends JpaRepository<EeipUsuariosConsulta,Integer>{
    
    @Override
    List<EeipUsuariosConsulta> findAll();
    
}
