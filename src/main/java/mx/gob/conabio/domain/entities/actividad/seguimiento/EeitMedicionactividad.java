/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.actividad.seguimiento;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_actividad_medicion", catalog = "conabio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EeitMedicionactividad.findAll", query = "SELECT e FROM EeitMedicionactividad e")
    , @NamedQuery(name = "EeitMedicionactividad.findByIdActividad", query = "SELECT e FROM EeitMedicionactividad e WHERE e.eeitMedicionactividadPK.idActividad = :idActividad")
    , @NamedQuery(name = "EeitMedicionactividad.findByAnio", query = "SELECT e FROM EeitMedicionactividad e WHERE e.eeitMedicionactividadPK.anio = :anio")})
public class EeitMedicionactividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeitMedicionactividadPK eeitMedicionactividadPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Avance")
    private int avance;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "UnidadDeMedida")
    private String unidadDeMedida;
    @Size(max = 300)
    @Column(name = "TipoRezago")
    private String tipoRezago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    public EeitMedicionactividad() {
    }

    public EeitMedicionactividad(EeitMedicionactividadPK eeitMedicionactividadPK) {
        this.eeitMedicionactividadPK = eeitMedicionactividadPK;
    }

    public EeitMedicionactividad(EeitMedicionactividadPK eeitMedicionactividadPK, int avance, String unidadDeMedida, Date fechaRegistro) {
        this.eeitMedicionactividadPK = eeitMedicionactividadPK;
        this.avance = avance;
        this.unidadDeMedida = unidadDeMedida;
        this.fechaRegistro = fechaRegistro;
    }

    public EeitMedicionactividad(int idActividad, int anio, int trimestre) {
        this.eeitMedicionactividadPK = new EeitMedicionactividadPK(idActividad, anio, trimestre);
    }

    public EeitMedicionactividadPK getEeitMedicionactividadPK() {
        return eeitMedicionactividadPK;
    }

    public void setEeitMedicionactividadPK(EeitMedicionactividadPK eeitMedicionactividadPK) {
        this.eeitMedicionactividadPK = eeitMedicionactividadPK;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public String getTipoRezago() {
        return tipoRezago;
    }

    public void setTipoRezago(String tipoRezago) {
        this.tipoRezago = tipoRezago;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeitMedicionactividadPK != null ? eeitMedicionactividadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitMedicionactividad)) {
            return false;
        }
        EeitMedicionactividad other = (EeitMedicionactividad) object;
        if ((this.eeitMedicionactividadPK == null && other.eeitMedicionactividadPK != null) || (this.eeitMedicionactividadPK != null && !this.eeitMedicionactividadPK.equals(other.eeitMedicionactividadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.entities.domain.actividad.planeacion.EeitMedicionactividad[ eeitMedicionactividadPK=" + eeitMedicionactividadPK + " ]";
    }
    
}
