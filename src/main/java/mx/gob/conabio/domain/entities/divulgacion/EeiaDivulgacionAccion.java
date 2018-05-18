/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.divulgacion;

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
@Table(name = "eeia_divulgacion_accion", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeiaDivulgacionAccion.findAll", query = "SELECT e FROM EeiaDivulgacionAccion e")
    , @NamedQuery(name = "EeiaDivulgacionAccion.findByIdAccionDivulgacion", query = "SELECT e FROM EeiaDivulgacionAccion e WHERE e.eeiaDivulgacionAccionPK.idAccionDivulgacion = :idAccionDivulgacion")
    , @NamedQuery(name = "EeiaDivulgacionAccion.findByIdObjetivoMetaAccion", query = "SELECT e FROM EeiaDivulgacionAccion e WHERE e.eeiaDivulgacionAccionPK.idObjetivoMetaAccion = :idObjetivoMetaAccion")})
public class EeiaDivulgacionAccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeiaDivulgacionAccionPK eeiaDivulgacionAccionPK;

    public EeiaDivulgacionAccion() {
    }

    public EeiaDivulgacionAccion(EeiaDivulgacionAccionPK eeiaDivulgacionAccionPK) {
        this.eeiaDivulgacionAccionPK = eeiaDivulgacionAccionPK;
    }

    public EeiaDivulgacionAccion(int idAccionDivulgacion, int idObjetivoMetaAccion,int idObjetivoMeta) {
        this.eeiaDivulgacionAccionPK = new EeiaDivulgacionAccionPK(idAccionDivulgacion, idObjetivoMetaAccion,idObjetivoMeta);
    }

    public EeiaDivulgacionAccionPK getEeiaDivulgacionAccionPK() {
        return eeiaDivulgacionAccionPK;
    }

    public void setEeiaDivulgacionAccionPK(EeiaDivulgacionAccionPK eeiaDivulgacionAccionPK) {
        this.eeiaDivulgacionAccionPK = eeiaDivulgacionAccionPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeiaDivulgacionAccionPK != null ? eeiaDivulgacionAccionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeiaDivulgacionAccion)) {
            return false;
        }
        EeiaDivulgacionAccion other = (EeiaDivulgacionAccion) object;
        if ((this.eeiaDivulgacionAccionPK == null && other.eeiaDivulgacionAccionPK != null) || (this.eeiaDivulgacionAccionPK != null && !this.eeiaDivulgacionAccionPK.equals(other.eeiaDivulgacionAccionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.divulgacion.EeiaDivulgacionAccion[ eeiaDivulgacionAccionPK=" + eeiaDivulgacionAccionPK + " ]";
    }
    
}
