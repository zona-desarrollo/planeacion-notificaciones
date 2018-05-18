/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.accion;

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
public class EeiaAccionAccionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idAccion")
    private int idAccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idObjetivoMetaAccion")
    private int idObjetivoMetaAccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idObjetivoMeta")
    private @Getter @Setter int idObjetivoMeta;

    public EeiaAccionAccionPK() {
    }

    public EeiaAccionAccionPK(int idAccion, int idObjetivoMetaAccionl, int idObjetivoMeta) {
        this.idAccion = idAccion;
        this.idObjetivoMetaAccion = idObjetivoMetaAccionl;
        this.idObjetivoMeta = idObjetivoMeta;
    }

    public int getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(int idAccion) {
        this.idAccion = idAccion;
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
        hash += (int) idAccion;
        hash += (int) idObjetivoMetaAccion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeiaAccionAccionPK)) {
            return false;
        }
        EeiaAccionAccionPK other = (EeiaAccionAccionPK) object;
        if (this.idAccion != other.idAccion) {
            return false;
        }
        if (this.idObjetivoMetaAccion != other.idObjetivoMetaAccion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.config.EeiaAccionAccionPK[ idAccion=" + idAccion + ", idObjetivoMetaAccion=" + idObjetivoMetaAccion + " ]";
    }
    
}
