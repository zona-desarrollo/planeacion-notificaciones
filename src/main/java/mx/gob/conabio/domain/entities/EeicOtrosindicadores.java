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
@Table(name = "eeic_otrosindicadores", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicOtrosindicadores.findAll", query = "SELECT e FROM EeicOtrosindicadores e where e.autorizado=true")
    , @NamedQuery(name = "EeicOtrosindicadores.findByIdOtroIndicador", query = "SELECT e FROM EeicOtrosindicadores e WHERE e.idOtroIndicador = :idOtroIndicador"),
    @NamedQuery(name = "EeicOtrosindicadores.findByIdActividad", query = "SELECT e FROM EeicOtrosindicadores e WHERE e.idActividad = :idActividad")
})
public class EeicOtrosindicadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idOtroIndicador")
    private Integer idOtroIndicador;
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
    
    @Column(name = "autorizado")
    private boolean autorizado;
    
    @Column(name = "idActividad")
    private Integer idActividad;

    public EeicOtrosindicadores() {
    }

    public EeicOtrosindicadores(Integer idOtroIndicador) {
        this.idOtroIndicador = idOtroIndicador;
    }

    public EeicOtrosindicadores(Integer idOtroIndicador, 
            String descripcion, Date fechaInicio) {
        this.idOtroIndicador = idOtroIndicador;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.autorizado = false;
    }

    public Integer getIdOtroIndicador() {
        return idOtroIndicador;
    }

    public void setIdOtroIndicador(Integer idOtroIndicador) {
        this.idOtroIndicador = idOtroIndicador;
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
        hash += (idOtroIndicador != null ? idOtroIndicador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicOtrosindicadores)) {
            return false;
        }
        EeicOtrosindicadores other = (EeicOtrosindicadores) object;
        if ((this.idOtroIndicador == null && other.idOtroIndicador != null) || (this.idOtroIndicador != null && !this.idOtroIndicador.equals(other.idOtroIndicador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.config.EeicOtrosindicadores[ idOtroIndicador=" + idOtroIndicador + " ]";
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }    
}
