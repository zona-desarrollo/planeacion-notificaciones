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
import java.util.List;
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
import javax.persistence.OneToMany;
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
@Table(name = "eeic_metas", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicMetas.findAll", query = "SELECT e FROM EeicMetas e")
    , @NamedQuery(name = "EeicMetas.findByIdMeta", query = "SELECT e FROM EeicMetas e WHERE e.idMeta = :idMeta")})
public class EeicMetas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMeta")
    private Integer idMeta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
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
    @JoinColumn(name = "idObjetivo", referencedColumnName = "idObjetivo")
    @ManyToOne(optional = false)
    private EeicObjetivos idObjetivo;
    @OneToMany(mappedBy = "eeicIdMeta")
    private List<EeicAccion> eeicAccionList;

    public EeicMetas() {
    }

    public EeicMetas(Integer idMeta) {
        this.idMeta = idMeta;
    }

    public EeicMetas(Integer idMeta, String descripcion, Date fechaInicio) {
        this.idMeta = idMeta;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(Integer idMeta) {
        this.idMeta = idMeta;
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

    public EeicObjetivos getIdObjetivo() {
        return idObjetivo;
    }

    public void setIdObjetivo(EeicObjetivos idObjetivo) {
        this.idObjetivo = idObjetivo;
    }

    public List<EeicAccion> getEeicAccionList() {
        return eeicAccionList;
    }

    public void setEeicAccionList(List<EeicAccion> eeicAccionList) {
        this.eeicAccionList = eeicAccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMeta != null ? idMeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicMetas)) {
            return false;
        }
        EeicMetas other = (EeicMetas) object;
        if ((this.idMeta == null && other.idMeta != null) || (this.idMeta != null && !this.idMeta.equals(other.idMeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain2.EeicMetas[ idMeta=" + idMeta + " ]";
    }
    
}
