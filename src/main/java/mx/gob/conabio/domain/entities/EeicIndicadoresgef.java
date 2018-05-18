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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "eeic_indicadoresgef", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicIndicadoresgef.findAll", query = "SELECT e FROM EeicIndicadoresgef e where e.fechaFin IS NULL")
    , @NamedQuery(name = "EeicIndicadoresgef.findByIdIndicadorGEF", query = "SELECT e FROM EeicIndicadoresgef e WHERE e.idIndicadorGEF = :idIndicadorGEF and e.fechaFin IS NULL")
    , @NamedQuery(name = "EeicIndicadoresgef.findByIdComponenteGef", query = "SELECT e FROM EeicIndicadoresgef e WHERE e.idComponenteGef.idComponenteGEF = :idComponenteGef and e.fechaFin IS NULL")})
public class EeicIndicadoresgef implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idIndicadorGEF")
    private Integer idIndicadorGEF;
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
    @JoinColumn(name = "idComponenteGef", referencedColumnName = "idComponenteGEF")
    @ManyToOne(optional = false)
    private EeicComponentegef idComponenteGef;

    public EeicIndicadoresgef() {
    }

    public EeicIndicadoresgef(Integer idIndicadorGEF) {
        this.idIndicadorGEF = idIndicadorGEF;
    }

    public EeicIndicadoresgef(Integer idIndicadorGEF, String descripcion, Date fechaInicio) {
        this.idIndicadorGEF = idIndicadorGEF;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdIndicadorGEF() {
        return idIndicadorGEF;
    }

    public void setIdIndicadorGEF(Integer idIndicadorGEF) {
        this.idIndicadorGEF = idIndicadorGEF;
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

    public EeicComponentegef getIdComponenteGef() {
        return idComponenteGef;
    }

    public void setIdComponenteGef(EeicComponentegef idComponenteGef) {
        this.idComponenteGef = idComponenteGef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIndicadorGEF != null ? idIndicadorGEF.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicIndicadoresgef)) {
            return false;
        }
        EeicIndicadoresgef other = (EeicIndicadoresgef) object;
        if ((this.idIndicadorGEF == null && other.idIndicadorGEF != null) || (this.idIndicadorGEF != null && !this.idIndicadorGEF.equals(other.idIndicadorGEF))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeicIndicadoresgef[ idIndicadorGEF=" + idIndicadorGEF + " ]";
    }
    
}
