/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.repositories.security;

import mx.gob.conabio.domain.entities.security.EeipUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/** 
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Repository
@Component(value = "usuariosRepository")
public interface UsuariosRepository extends JpaRepository<EeipUsuarios,Integer>{
    
    EeipUsuarios findByNombreUsuario(@Param("nombreUsuario") String nombreUsuario);
    EeipUsuarios findByEmail(@Param("mail") String nombreUsuario);
    EeipUsuarios findByIdRol(@Param("idRol") int idRol);
    EeipUsuarios findByIdUsuario(@Param("idUsuario") int idUsuario);
    
}
