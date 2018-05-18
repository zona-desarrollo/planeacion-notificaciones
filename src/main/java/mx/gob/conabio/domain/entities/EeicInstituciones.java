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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "eeic_instituciones", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicInstituciones.findAll", query = "SELECT e FROM EeicInstituciones e")
    , @NamedQuery(name = "EeicInstituciones.findByIdInstitucion", query = "SELECT e FROM EeicInstituciones e WHERE e.eeicInstitucionesPK.idInstitucion = :idInstitucion")
    , @NamedQuery(name = "EeicInstituciones.findByIdTipoInstitucion", query = "SELECT e FROM EeicInstituciones e WHERE e.eeicInstitucionesPK.idTipoInstitucion = :idTipoInstitucion")
    , @NamedQuery(name = "EeicInstituciones.findByNombre", query = "SELECT e FROM EeicInstituciones e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "EeicInstituciones.findByDescripcion", query = "SELECT e FROM EeicInstituciones e WHERE e.descripcion = :descripcion")
    , @NamedQuery(name = "EeicInstituciones.findByFechaInicio", query = "SELECT e FROM EeicInstituciones e WHERE e.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "EeicInstituciones.findByFechaFin", query = "SELECT e FROM EeicInstituciones e WHERE e.fechaFin = :fechaFin")})
public class EeicInstituciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeicInstitucionesPK eeicInstitucionesPK;
    @Size(max = 150)
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

    public EeicInstituciones() {
    }

    public EeicInstituciones(EeicInstitucionesPK eeicInstitucionesPK) {
        this.eeicInstitucionesPK = eeicInstitucionesPK;
    }

    public EeicInstituciones(EeicInstitucionesPK eeicInstitucionesPK, Date fechaInicio) {
        this.eeicInstitucionesPK = eeicInstitucionesPK;
        this.fechaInicio = fechaInicio;
    }

    public EeicInstituciones(int idInstitucion, int idTipoInstitucion) {
        this.eeicInstitucionesPK = new EeicInstitucionesPK(idInstitucion, idTipoInstitucion);
    }

    public EeicInstitucionesPK getEeicInstitucionesPK() {
        return eeicInstitucionesPK;
    }

    public void setEeicInstitucionesPK(EeicInstitucionesPK eeicInstitucionesPK) {
        this.eeicInstitucionesPK = eeicInstitucionesPK;
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
        hash += (eeicInstitucionesPK != null ? eeicInstitucionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicInstituciones)) {
            return false;
        }
        EeicInstituciones other = (EeicInstituciones) object;
        if ((this.eeicInstitucionesPK == null && other.eeicInstitucionesPK != null) || (this.eeicInstitucionesPK != null && !this.eeicInstitucionesPK.equals(other.eeicInstitucionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeicInstituciones[ eeicInstitucionesPK=" + eeicInstitucionesPK + " ]";
    }
    
    public String fullName(){
        
       if(this.descripcion == null || this.descripcion.isEmpty()){
           return this.nombre;
       } 
       
       return this.nombre + "-"+ this.descripcion;
    }
}
