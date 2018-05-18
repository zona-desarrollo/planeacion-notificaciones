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
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeia_accion_indicadorgef", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeiaAccionindicadorgef.findAll", query = "SELECT e FROM EeiaAccionindicadorgef e")
    , @NamedQuery(name = "EeiaAccionindicadorgef.findByIdAccion", query = "SELECT e FROM EeiaAccionindicadorgef e WHERE e.eeiaAccionindicadorgefPK.idAccion = :idAccion")
    , @NamedQuery(name = "EeiaAccionindicadorgef.findByIdIndicadorGEF", query = "SELECT e FROM EeiaAccionindicadorgef e WHERE e.eeiaAccionindicadorgefPK.idIndicadorGEF = :idIndicadorGEF")})
public class EeiaAccionindicadorgef implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeiaAccionindicadorgefPK eeiaAccionindicadorgefPK;

    public EeiaAccionindicadorgef() {
    }

    public EeiaAccionindicadorgef(EeiaAccionindicadorgefPK eeiaAccionindicadorgefPK) {
        this.eeiaAccionindicadorgefPK = eeiaAccionindicadorgefPK;
    }

    public EeiaAccionindicadorgef(int idAccion, int idIndicadorGEF) {
        this.eeiaAccionindicadorgefPK = new EeiaAccionindicadorgefPK(idAccion, idIndicadorGEF);
    }

    public EeiaAccionindicadorgefPK getEeiaAccionindicadorgefPK() {
        return eeiaAccionindicadorgefPK;
    }

    public void setEeiaAccionindicadorgefPK(EeiaAccionindicadorgefPK eeiaAccionindicadorgefPK) {
        this.eeiaAccionindicadorgefPK = eeiaAccionindicadorgefPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeiaAccionindicadorgefPK != null ? eeiaAccionindicadorgefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeiaAccionindicadorgef)) {
            return false;
        }
        EeiaAccionindicadorgef other = (EeiaAccionindicadorgef) object;
        if ((this.eeiaAccionindicadorgefPK == null && other.eeiaAccionindicadorgefPK != null) || (this.eeiaAccionindicadorgefPK != null && !this.eeiaAccionindicadorgefPK.equals(other.eeiaAccionindicadorgefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeiaAccionindicadorgef[ eeiaAccionindicadorgefPK=" + eeiaAccionindicadorgefPK + " ]";
    }
    
}
