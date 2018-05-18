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
@Table(name = "eeia_actividad_estado", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeiaActividadEstado.findAll", query = "SELECT e FROM EeiaActividadEstado e")
    , @NamedQuery(name = "EeiaActividadEstado.findByIdActividad", query = "SELECT e FROM EeiaActividadEstado e WHERE e.idActividad = :idActividad")
    , @NamedQuery(name = "EeiaActividadEstado.findByIdEstado", query = "SELECT e FROM EeiaActividadEstado e WHERE e.idEstado = :idEstado")})
public class EeiaActividadEstado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idActividad")
    private Integer idActividad;
    @Column(name = "idEstado")
    private Integer idEstado;

    public EeiaActividadEstado() {
    }

    public EeiaActividadEstado(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
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
        if (!(object instanceof EeiaActividadEstado)) {
            return false;
        }
        EeiaActividadEstado other = (EeiaActividadEstado) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeiaActividadEstado[ idActividad=" + idActividad + " ]";
    }
    
}
