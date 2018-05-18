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
public class EeitAccionLineabaseMetaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idlineabaseRef")
    private int idlineabase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "consecRef")
    private int consec;

    public EeitAccionLineabaseMetaPK() {
    }

    public EeitAccionLineabaseMetaPK(int idlineabase, int consec) {
        this.idlineabase = idlineabase;
        this.consec = consec;
    }

    public int getIdlineabase() {
        return idlineabase;
    }

    public void setIdlineabase(int idlineabase) {
        this.idlineabase = idlineabase;
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
        hash += (int) idlineabase;
        hash += (int) consec;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitAccionLineabaseMetaPK)) {
            return false;
        }
        EeitAccionLineabaseMetaPK other = (EeitAccionLineabaseMetaPK) object;
        if (this.idlineabase != other.idlineabase) {
            return false;
        }
        if (this.consec != other.consec) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.accion.EeitAccionLineabaseMetaPK[ idlineabase=" + idlineabase + ", consec=" + consec + " ]";
    }
    
}
