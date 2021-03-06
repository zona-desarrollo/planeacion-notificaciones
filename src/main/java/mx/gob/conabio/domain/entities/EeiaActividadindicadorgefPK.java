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
public class EeiaActividadindicadorgefPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idActividad")
    private int idActividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idIndicadorGEF")
    private int idIndicadorGEF;

    public EeiaActividadindicadorgefPK() {
    }

    public EeiaActividadindicadorgefPK(int idActividad, int idIndicadorGEF) {
        this.idActividad = idActividad;
        this.idIndicadorGEF = idIndicadorGEF;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public int getIdIndicadorGEF() {
        return idIndicadorGEF;
    }

    public void setIdIndicadorGEF(int idIndicadorGEF) {
        this.idIndicadorGEF = idIndicadorGEF;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idActividad;
        hash += (int) idIndicadorGEF;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeiaActividadindicadorgefPK)) {
            return false;
        }
        EeiaActividadindicadorgefPK other = (EeiaActividadindicadorgefPK) object;
        if (this.idActividad != other.idActividad) {
            return false;
        }
        if (this.idIndicadorGEF != other.idIndicadorGEF) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeiaActividadindicadorgefPK[ idActividad=" + idActividad + ", idIndicadorGEF=" + idIndicadorGEF + " ]";
    }
    
}
