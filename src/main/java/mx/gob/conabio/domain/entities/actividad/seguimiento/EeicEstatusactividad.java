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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_estatusactividad", catalog = "conabio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EeicEstatusactividad.findAll", query = "SELECT e FROM EeicEstatusactividad e")
    , @NamedQuery(name = "EeicEstatusactividad.findByIdEstatusActividad", query = "SELECT e FROM EeicEstatusactividad e WHERE e.idEstatusActividad = :idEstatusActividad")
    , @NamedQuery(name = "EeicEstatusactividad.findByDescripcion", query = "SELECT e FROM EeicEstatusactividad e WHERE e.descripcion = :descripcion")
    , @NamedQuery(name = "EeicEstatusactividad.findByFechaInicio", query = "SELECT e FROM EeicEstatusactividad e WHERE e.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "EeicEstatusactividad.findByFechaFin", query = "SELECT e FROM EeicEstatusactividad e WHERE e.fechaFin = :fechaFin")})
public class EeicEstatusactividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEstatusActividad")
    private Integer idEstatusActividad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstatusActividad")
    private List<EeitPlaneacionactividad> eeitPlaneacionactividadList;

    public EeicEstatusactividad() {
    }

    public EeicEstatusactividad(Integer idEstatusActividad) {
        this.idEstatusActividad = idEstatusActividad;
    }

    public EeicEstatusactividad(Integer idEstatusActividad, String descripcion, Date fechaInicio) {
        this.idEstatusActividad = idEstatusActividad;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdEstatusActividad() {
        return idEstatusActividad;
    }

    public void setIdEstatusActividad(Integer idEstatusActividad) {
        this.idEstatusActividad = idEstatusActividad;
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

    @XmlTransient
    public List<EeitPlaneacionactividad> getEeitPlaneacionactividadList() {
        return eeitPlaneacionactividadList;
    }

    public void setEeitPlaneacionactividadList(List<EeitPlaneacionactividad> eeitPlaneacionactividadList) {
        this.eeitPlaneacionactividadList = eeitPlaneacionactividadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstatusActividad != null ? idEstatusActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicEstatusactividad)) {
            return false;
        }
        EeicEstatusactividad other = (EeicEstatusactividad) object;
        if ((this.idEstatusActividad == null && other.idEstatusActividad != null) || (this.idEstatusActividad != null && !this.idEstatusActividad.equals(other.idEstatusActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.seguimiento.EeicEstatusactividad[ idEstatusActividad=" + idEstatusActividad + " ]";
    }
    
}
