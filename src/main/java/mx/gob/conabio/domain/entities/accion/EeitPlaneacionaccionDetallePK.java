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
public class EeitPlaneacionaccionDetallePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idAccion")
    private int idAccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anio")
    private int anio;

    public EeitPlaneacionaccionDetallePK() {
    }

    public EeitPlaneacionaccionDetallePK(int idAccion, int anio) {
            this.idAccion = idAccion;
        this.anio = anio;
    }

    public int getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(int idAccion) {
        this.idAccion = idAccion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idAccion;
        hash += (int) anio;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitPlaneacionaccionDetallePK)) {
            return false;
        }
        EeitPlaneacionaccionDetallePK other = (EeitPlaneacionaccionDetallePK) object;
        if (this.idAccion != other.idAccion) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.accion.seguimiento.EeitPlaneacionaccionDetallePK[ idAccion=" + idAccion + ", anio=" + anio + " ]";
    }
    
}
