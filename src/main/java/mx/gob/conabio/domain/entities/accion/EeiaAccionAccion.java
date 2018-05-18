/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.accion;


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
@Table(name = "eeia_accion_accion", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeiaAccionAccion.findAll", query = "SELECT e FROM EeiaAccionAccion e")})
public class EeiaAccionAccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeiaAccionAccionPK eeiaAccionAccionPK;

    public EeiaAccionAccion() {
    }

    public EeiaAccionAccion(EeiaAccionAccionPK eeiaAccionAccionPK) {
        this.eeiaAccionAccionPK = eeiaAccionAccionPK;
    }

    public EeiaAccionAccion(int idAccion, int idObjetivoMetaAccion,int idObjetivoMeta) {
        this.eeiaAccionAccionPK = new EeiaAccionAccionPK(idAccion, idObjetivoMetaAccion,idObjetivoMeta);
    }

    public EeiaAccionAccionPK getEeiaAccionAccionPK() {
        return eeiaAccionAccionPK;
    }

    public void setEeiaAccionAccionPK(EeiaAccionAccionPK eeiaAccionAccionPK) {
        this.eeiaAccionAccionPK = eeiaAccionAccionPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeiaAccionAccionPK != null ? eeiaAccionAccionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeiaAccionAccion)) {
            return false;
        }
        EeiaAccionAccion other = (EeiaAccionAccion) object;
        if ((this.eeiaAccionAccionPK == null && other.eeiaAccionAccionPK != null) || (this.eeiaAccionAccionPK != null && !this.eeiaAccionAccionPK.equals(other.eeiaAccionAccionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.config.EeiaAccionAccion[ eeiaAccionAccionPK=" + eeiaAccionAccionPK + " ]";
    }
    
}
