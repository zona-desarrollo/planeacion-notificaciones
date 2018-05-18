/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.divulgacion;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com)
 */
@Embeddable
public class EeiaDivulgacionAccionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idAccionDivulgacion")
    private int idAccionDivulgacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idObjetivoMetaAccion")
    private int idObjetivoMetaAccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idObjetivoMeta")
    private int idObjetivoMeta;

    public EeiaDivulgacionAccionPK() {
    }

    public EeiaDivulgacionAccionPK(int idAccionDivulgacion, int idObjetivoMetaAccion, int idObjetivoMeta) {
        this.idAccionDivulgacion = idAccionDivulgacion;
        this.idObjetivoMetaAccion = idObjetivoMetaAccion;
        this.idObjetivoMeta = idObjetivoMeta;
    }

    public int getIdAccionDivulgacion() {
        return idAccionDivulgacion;
    }

    public void setIdAccionDivulgacion(int idAccionDivulgacion) {
        this.idAccionDivulgacion = idAccionDivulgacion;
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
        hash += (int) idAccionDivulgacion;
        hash += (int) idObjetivoMetaAccion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeiaDivulgacionAccionPK)) {
            return false;
        }
        EeiaDivulgacionAccionPK other = (EeiaDivulgacionAccionPK) object;
        if (this.idAccionDivulgacion != other.idAccionDivulgacion) {
            return false;
        }
        if (this.idObjetivoMetaAccion != other.idObjetivoMetaAccion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.divulgacion.EeiaDivulgacionAccionPK[ idAccionDivulgacion=" + idAccionDivulgacion + ", idObjetivoMetaAccion=" + idObjetivoMetaAccion + " ]";
    }
    
}
