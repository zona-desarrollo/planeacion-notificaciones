/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.actividad.seguimiento;

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
public class EeitMedicionactividadPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idActividad")
    private int idActividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Anio")
    private int anio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Trimestre")
    private int trimestre;

    public EeitMedicionactividadPK() {
    }

    public EeitMedicionactividadPK(int idActividad, int anio, int trimestre) {
        this.idActividad = idActividad;
        this.anio = anio;
        this.trimestre = trimestre;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(int trimestre) {
        this.trimestre = trimestre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idActividad;
        hash += (int) anio;
        hash += (int) trimestre;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitMedicionactividadPK)) {
            return false;
        }
        EeitMedicionactividadPK other = (EeitMedicionactividadPK) object;
        if (this.idActividad != other.idActividad) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        if (this.trimestre != other.trimestre) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.entities.domain.actividad.planeacion.EeitMedicionactividadPK[ idActividad=" + idActividad + ", anio=" + anio + ", trimestre=" + trimestre + " ]";
    }
    
}
