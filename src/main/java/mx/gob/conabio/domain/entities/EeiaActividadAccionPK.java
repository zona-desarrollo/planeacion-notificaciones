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
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com)
 */
@Embeddable
public class EeiaActividadAccionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idActividad")
    private int idActividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idObjetivoMetaAccion")
    private int idObjetivoMetaAccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idObjetivoMeta")
    private @Getter @Setter int idObjetivoMeta;

    public EeiaActividadAccionPK() {
    }

    public EeiaActividadAccionPK(int idActividad, int idObjetivoMetaAccion,int idObjetivoMeta) {
        this.idActividad = idActividad;
        this.idObjetivoMetaAccion = idObjetivoMetaAccion;
        this.idObjetivoMeta = idObjetivoMeta;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public int getIdObjetivoMetaAccion() {
        return idObjetivoMetaAccion;
    }

    public void setIdObjetivoMetaAccion(int idObjetivoMetaAccion) {
        this.idObjetivoMetaAccion = idObjetivoMetaAccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idActividad;
        hash += (int) idObjetivoMetaAccion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeiaActividadAccionPK)) {
            return false;
        }
        EeiaActividadAccionPK other = (EeiaActividadAccionPK) object;
        if (this.idActividad != other.idActividad) {
            return false;
        }
        if (this.idObjetivoMetaAccion != other.idObjetivoMetaAccion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.config.EeiaActividadAccionPK[ idActividad=" + idActividad + ", idObjetivoMetaAccion=" + idObjetivoMetaAccion + " ]";
    }
    
}
