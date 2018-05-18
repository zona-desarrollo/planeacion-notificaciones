/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.divulgacion;

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
@Table(name = "eeic_temassesiones", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicTemassesiones.findAll", query = "SELECT e FROM EeicTemassesiones e")
    , @NamedQuery(name = "EeicTemassesiones.findByIdTemasSesiones", query = "SELECT e FROM EeicTemassesiones e WHERE e.idTemasSesiones = :idTemasSesiones")})
public class EeicTemassesiones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTemasSesiones")
    private Integer idTemasSesiones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 450)
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

    public EeicTemassesiones() {
    }

    public EeicTemassesiones(Integer idTemasSesiones) {
        this.idTemasSesiones = idTemasSesiones;
    }

    public EeicTemassesiones(Integer idTemasSesiones, String descripcion, Date fechaInicio) {
        this.idTemasSesiones = idTemasSesiones;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdTemasSesiones() {
        return idTemasSesiones;
    }

    public void setIdTemasSesiones(Integer idTemasSesiones) {
        this.idTemasSesiones = idTemasSesiones;
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
        hash += (idTemasSesiones != null ? idTemasSesiones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicTemassesiones)) {
            return false;
        }
        EeicTemassesiones other = (EeicTemassesiones) object;
        if ((this.idTemasSesiones == null && other.idTemasSesiones != null) || (this.idTemasSesiones != null && !this.idTemasSesiones.equals(other.idTemasSesiones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.divulgacion.EeicTemassesiones[ idTemasSesiones=" + idTemasSesiones + " ]";
    }
    
}
