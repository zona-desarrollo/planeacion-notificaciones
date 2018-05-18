/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.actividad.finanzas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Embeddable
public class EeitActividadDetalleFinancieroCostosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idActividad")
    private int idActividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCosto")
    private int idCosto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anio")
    private @Getter @Setter int anio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Consecutivo")
    private int consecutivo;

    public EeitActividadDetalleFinancieroCostosPK() {
    }

    public EeitActividadDetalleFinancieroCostosPK(int idActividad, int idCosto,int anio, int consecutivo) {
        this.idActividad = idActividad;
        this.idCosto = idCosto;
        this.anio = anio;
        this.consecutivo = consecutivo;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public int getIdCosto() {
        return idCosto;
    }

    public void setIdCosto(int idCosto) {
        this.idCosto = idCosto;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idActividad;
        //hash += (int) idCosto;
        hash += (int) anio;
        hash += (int) consecutivo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitActividadDetalleFinancieroCostosPK)) {
            return false;
        }
        EeitActividadDetalleFinancieroCostosPK other = (EeitActividadDetalleFinancieroCostosPK) object;
        if (this.idActividad != other.idActividad) {
            return false;
        }
        if (this.idCosto != other.idCosto) {
            return false;
        }
        if(this.anio != other.getAnio()){
            return false;
        }
        if (this.consecutivo != other.consecutivo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.finanzas.EeitActividadDetalleFinancieroCostosPK[ "
                + "idActividad=" + idActividad + ", "
                + "idCosto=" + idCosto + ", "
                + "anio=" + anio + ", "
                + "consecutivo=" + consecutivo + " ]";
    }
    
}
