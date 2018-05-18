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
public class EeitActividadDetalleFinancieroBeneficiosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idActividad")
    private int idActividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idBeneficio")
    private int idBeneficio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anio")
    private @Getter @Setter int anio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Consecutivo")
    private int consecutivo;

    public EeitActividadDetalleFinancieroBeneficiosPK() {
    }

    public EeitActividadDetalleFinancieroBeneficiosPK(int idActividad, int idBeneficio, int consecutivo, int anio) {
        this.idActividad = idActividad;
        this.idBeneficio = idBeneficio;
        this.consecutivo = consecutivo;
        this.anio = anio;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public int getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(int idBeneficio) {
        this.idBeneficio = idBeneficio;
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
        //hash += (int) idBeneficio;
        hash += (int) consecutivo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitActividadDetalleFinancieroBeneficiosPK)) {
            return false;
        }
        EeitActividadDetalleFinancieroBeneficiosPK other = (EeitActividadDetalleFinancieroBeneficiosPK) object;
        if (this.idActividad != other.idActividad) {
            return false;
        }
        if (this.idBeneficio != other.idBeneficio) {
            return false;
        }
        if (this.consecutivo != other.consecutivo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.finanzas.EeitActividadDetalleFinancieroBeneficiosPK[ idActividad=" + idActividad + ", idBeneficio=" + idBeneficio + ", consecutivo=" + consecutivo + " ]";
    }
    
}
