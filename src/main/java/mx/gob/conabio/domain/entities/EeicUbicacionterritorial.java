/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_ubicacionterritorial", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicUbicacionterritorial.findAll", query = "SELECT e FROM EeicUbicacionterritorial e")
    , @NamedQuery(name = "EeicUbicacionterritorial.findByIdUbicacionTerritorial", query = "SELECT e FROM EeicUbicacionterritorial e WHERE e.idUbicacionTerritorial = :idUbicacionTerritorial")
    })
public class EeicUbicacionterritorial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUbicacionTerritorial")
    private Integer idUbicacionTerritorial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "FechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    public EeicUbicacionterritorial() {
    }

    public EeicUbicacionterritorial(Integer idUbicacionTerritorial) {
        this.idUbicacionTerritorial = idUbicacionTerritorial;
    }

    public EeicUbicacionterritorial(Integer idUbicacionTerritorial, String descripcion, Date fechaInicio) {
        this.idUbicacionTerritorial = idUbicacionTerritorial;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdUbicacionTerritorial() {
        return idUbicacionTerritorial;
    }

    public void setIdUbicacionTerritorial(Integer idUbicacionTerritorial) {
        this.idUbicacionTerritorial = idUbicacionTerritorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUbicacionTerritorial != null ? idUbicacionTerritorial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicUbicacionterritorial)) {
            return false;
        }
        EeicUbicacionterritorial other = (EeicUbicacionterritorial) object;
        if ((this.idUbicacionTerritorial == null && other.idUbicacionTerritorial != null) || (this.idUbicacionTerritorial != null && !this.idUbicacionTerritorial.equals(other.idUbicacionTerritorial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.config.EeicUbicacionterritorial[ idUbicacionTerritorial=" + idUbicacionTerritorial + " ]";
    }
    
}
