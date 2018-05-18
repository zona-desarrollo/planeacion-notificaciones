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

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Embeddable
public class EeitAccionLineabasePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idAccionLb")
    private int idAccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "consec")
    private int consec;

    public EeitAccionLineabasePK() {
    }

    public EeitAccionLineabasePK(int idAccion, int consec) {
        this.idAccion = idAccion;
        this.consec = consec;
    }

    public int getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(int idAccion) {
        this.idAccion = idAccion;
    }

    public int getConsec() {
        return consec;
    }

    public void setConsec(int consec) {
        this.consec = consec;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idAccion;
        hash += (int) consec;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitAccionLineabasePK)) {
            return false;
        }
        EeitAccionLineabasePK other = (EeitAccionLineabasePK) object;
        if (this.idAccion != other.idAccion) {
            return false;
        }
        if (this.consec != other.consec) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.accion.EeitAccionLineabasePK[ idAccion=" + idAccion + ", consec=" + consec + " ]";
    }
    
}
