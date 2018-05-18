/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.accion;

import mx.gob.conabio.domain.entities.actividad.seguimiento.*;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */

@Entity
@Table(name = "eeit_accion", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitAccionConsulta.findAllByIdUsuario", query = "SELECT e FROM EeitAccionConsulta e WHERE e.idUsuario =:idUsuario")})
public class EeitAccionConsulta implements Serializable {

    
    @Id
    @Column(name = "idAccion")
    private Integer id;
    
    @Column(name = "idUsuario")
    private Integer idUsuario;
    
    @Column(name = "Nombre")
    private String nombre;

    public EeitAccionConsulta(){}
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
