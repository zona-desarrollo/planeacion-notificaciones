/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.catalogo.tipoactividad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import mx.gob.conabio.domain.entities.EeitActividades;
/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_tipoactividad", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicTipoactividad.findAll", query = "SELECT e FROM EeicTipoactividad e")
    , @NamedQuery(name = "EeicTipoactividad.findByIdTipoActividad", query = "SELECT e FROM EeicTipoactividad e WHERE e.idTipoActividad = :idTipoActividad")})
public class EeicTipoactividad implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoActividad")
    private List<EeitActividades> eeitActividadesList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoActividad")
    private Integer idTipoActividad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
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

    public EeicTipoactividad() {
    }

    public EeicTipoactividad(Integer idTipoActividad) {
        this.idTipoActividad = idTipoActividad;
    }

    public EeicTipoactividad(Integer idTipoActividad, String descripcion, Date fechaInicio) {
        this.idTipoActividad = idTipoActividad;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdTipoActividad() {
        return idTipoActividad;
    }

    public void setIdTipoActividad(Integer idTipoActividad) {
        this.idTipoActividad = idTipoActividad;
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
        hash += (idTipoActividad != null ? idTipoActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicTipoactividad)) {
            return false;
        }
        EeicTipoactividad other = (EeicTipoactividad) object;
        if ((this.idTipoActividad == null && other.idTipoActividad != null) || (this.idTipoActividad != null && !this.idTipoActividad.equals(other.idTipoActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeicTipoactividad[ idTipoActividad=" + idTipoActividad + " ]";
    }

    public List<EeitActividades> getEeitActividadesList() {
        return eeitActividadesList;
    }

    public void setEeitActividadesList(List<EeitActividades> eeitActividadesList) {
        this.eeitActividadesList = eeitActividadesList;
    }
    
}
