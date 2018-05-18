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

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Embeddable
public class EeicInstitucionesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idInstitucion")
    private int idInstitucion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTipoInstitucion")
    private int idTipoInstitucion;

    public EeicInstitucionesPK() {
    }

    public EeicInstitucionesPK(int idInstitucion, int idTipoInstitucion) {
        this.idInstitucion = idInstitucion;
        this.idTipoInstitucion = idTipoInstitucion;
    }

    public int getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(int idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public int getIdTipoInstitucion() {
        return idTipoInstitucion;
    }

    public void setIdTipoInstitucion(int idTipoInstitucion) {
        this.idTipoInstitucion = idTipoInstitucion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idInstitucion;
        hash += (int) idTipoInstitucion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicInstitucionesPK)) {
            return false;
        }
        EeicInstitucionesPK other = (EeicInstitucionesPK) object;
        if (this.idInstitucion != other.idInstitucion) {
            return false;
        }
        if (this.idTipoInstitucion != other.idTipoInstitucion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeicInstitucionesPK[ idInstitucion=" + idInstitucion + ", idTipoInstitucion=" + idTipoInstitucion + " ]";
    }
    
}
