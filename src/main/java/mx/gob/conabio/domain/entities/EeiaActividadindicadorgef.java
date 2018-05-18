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
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeia_actividad_indicadorgef", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeiaActividadindicadorgef.findAll", query = "SELECT e FROM EeiaActividadindicadorgef e")
    , @NamedQuery(name = "EeiaActividadindicadorgef.findByIdActividad", query = "SELECT e FROM EeiaActividadindicadorgef e WHERE e.eeiaActividadindicadorgefPK.idActividad = :idActividad")
    , @NamedQuery(name = "EeiaActividadindicadorgef.findByIdIndicadorGEF", query = "SELECT e FROM EeiaActividadindicadorgef e WHERE e.eeiaActividadindicadorgefPK.idIndicadorGEF = :idIndicadorGEF")})
public class EeiaActividadindicadorgef implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeiaActividadindicadorgefPK eeiaActividadindicadorgefPK;

    public EeiaActividadindicadorgef() {
    }

    public EeiaActividadindicadorgef(EeiaActividadindicadorgefPK eeiaActividadindicadorgefPK) {
        this.eeiaActividadindicadorgefPK = eeiaActividadindicadorgefPK;
    }

    public EeiaActividadindicadorgef(int idActividad, int idIndicadorGEF) {
        this.eeiaActividadindicadorgefPK = new EeiaActividadindicadorgefPK(idActividad, idIndicadorGEF);
    }

    public EeiaActividadindicadorgefPK getEeiaActividadindicadorgefPK() {
        return eeiaActividadindicadorgefPK;
    }

    public void setEeiaActividadindicadorgefPK(EeiaActividadindicadorgefPK eeiaActividadindicadorgefPK) {
        this.eeiaActividadindicadorgefPK = eeiaActividadindicadorgefPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeiaActividadindicadorgefPK != null ? eeiaActividadindicadorgefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeiaActividadindicadorgef)) {
            return false;
        }
        EeiaActividadindicadorgef other = (EeiaActividadindicadorgef) object;
        if ((this.eeiaActividadindicadorgefPK == null && other.eeiaActividadindicadorgefPK != null) || (this.eeiaActividadindicadorgefPK != null && !this.eeiaActividadindicadorgefPK.equals(other.eeiaActividadindicadorgefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeiaActividadindicadorgef[ eeiaActividadindicadorgefPK=" + eeiaActividadindicadorgefPK + " ]";
    }
    
}
