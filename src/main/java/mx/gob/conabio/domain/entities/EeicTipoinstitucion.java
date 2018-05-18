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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_tipoinstitucion", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicTipoinstitucion.findAll", query = "SELECT e FROM EeicTipoinstitucion e")
    , @NamedQuery(name = "EeicTipoinstitucion.findByIdTipoInstitucion", query = "SELECT e FROM EeicTipoinstitucion e WHERE e.idTipoInstitucion = :idTipoInstitucion")
    , @NamedQuery(name = "EeicTipoinstitucion.findByNombre", query = "SELECT e FROM EeicTipoinstitucion e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "EeicTipoinstitucion.findByDescripcion", query = "SELECT e FROM EeicTipoinstitucion e WHERE e.descripcion = :descripcion")
    , @NamedQuery(name = "EeicTipoinstitucion.findByFechaInicio", query = "SELECT e FROM EeicTipoinstitucion e WHERE e.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "EeicTipoinstitucion.findByFechaFin", query = "SELECT e FROM EeicTipoinstitucion e WHERE e.fechaFin = :fechaFin")})
public class EeicTipoinstitucion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoInstitucion")
    private Integer idTipoInstitucion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 150)
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

    public EeicTipoinstitucion() {
    }

    public EeicTipoinstitucion(Integer idTipoInstitucion) {
        this.idTipoInstitucion = idTipoInstitucion;
    }

    public EeicTipoinstitucion(Integer idTipoInstitucion, String nombre, Date fechaInicio) {
        this.idTipoInstitucion = idTipoInstitucion;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdTipoInstitucion() {
        return idTipoInstitucion;
    }

    public void setIdTipoInstitucion(Integer idTipoInstitucion) {
        this.idTipoInstitucion = idTipoInstitucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        hash += (idTipoInstitucion != null ? idTipoInstitucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicTipoinstitucion)) {
            return false;
        }
        EeicTipoinstitucion other = (EeicTipoinstitucion) object;
        if ((this.idTipoInstitucion == null && other.idTipoInstitucion != null) || (this.idTipoInstitucion != null && !this.idTipoInstitucion.equals(other.idTipoInstitucion))) {
            return false;
        }
        return true;
    }

    public String fullName(){
        if(this.descripcion == null || this.descripcion.isEmpty()){
            return this.nombre;
        }
        return this.nombre + "-" + this.descripcion;
    }
    
    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeicTipoinstitucion[ idTipoInstitucion=" + idTipoInstitucion + " ]";
    }
    
}
