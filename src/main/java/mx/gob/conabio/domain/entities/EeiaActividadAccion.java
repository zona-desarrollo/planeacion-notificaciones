/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeia_actividad_accion", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeiaActividadAccion.findAll", query = "SELECT e FROM EeiaActividadAccion e")})
public class EeiaActividadAccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeiaActividadAccionPK eeiaActividadAccionPK;

    public EeiaActividadAccion() {
    }

    public EeiaActividadAccion(EeiaActividadAccionPK eeiaActividadAccionPK) {
        this.eeiaActividadAccionPK = eeiaActividadAccionPK;
    }

    public EeiaActividadAccion(int idActividad, int idObjetivoMetaAccion,int idObjetivoMeta) {
        this.eeiaActividadAccionPK = new EeiaActividadAccionPK(idActividad, idObjetivoMetaAccion,idObjetivoMeta);
    }

    public EeiaActividadAccionPK getEeiaActividadAccionPK() {
        return eeiaActividadAccionPK;
    }

    public void setEeiaActividadAccionPK(EeiaActividadAccionPK eeiaActividadAccionPK) {
        this.eeiaActividadAccionPK = eeiaActividadAccionPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeiaActividadAccionPK != null ? eeiaActividadAccionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeiaActividadAccion)) {
            return false;
        }
        EeiaActividadAccion other = (EeiaActividadAccion) object;
        if ((this.eeiaActividadAccionPK == null && other.eeiaActividadAccionPK != null) || (this.eeiaActividadAccionPK != null && !this.eeiaActividadAccionPK.equals(other.eeiaActividadAccionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.config.EeiaActividadAccion[ eeiaActividadAccionPK=" + eeiaActividadAccionPK + " ]";
    }
    
}
