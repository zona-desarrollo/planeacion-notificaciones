/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeia_actividad_anp", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeiaActividadAnp.findAll", query = "SELECT e FROM EeiaActividadAnp e")
    , @NamedQuery(name = "EeiaActividadAnp.findByIdActividad", query = "SELECT e FROM EeiaActividadAnp e WHERE e.idActividad = :idActividad")})
public class EeiaActividadAnp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idActividad")
    private Integer idActividad;
    @Column(name = "idAnp")
    private Integer idAnp;

    public EeiaActividadAnp() {
    }

    public EeiaActividadAnp(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public Integer getIdAnp() {
        return idAnp;
    }

    public void setIdAnp(Integer idAnp) {
        this.idAnp = idAnp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividad != null ? idActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeiaActividadAnp)) {
            return false;
        }
        EeiaActividadAnp other = (EeiaActividadAnp) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeiaActividadAnp[ idActividad=" + idActividad + " ]";
    }
    
}
