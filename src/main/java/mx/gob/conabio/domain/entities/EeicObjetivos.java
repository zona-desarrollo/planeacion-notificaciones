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

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_objetivos", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicObjetivos.findAll", query = "SELECT e FROM EeicObjetivos e")
    , @NamedQuery(name = "EeicObjetivos.findByIdObjetivo", query = "SELECT e FROM EeicObjetivos e WHERE e.idObjetivo = :idObjetivo")})
public class EeicObjetivos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idObjetivo")
    private Integer idObjetivo;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idObjetivo")
    private List<EeicMetas> eeicMetasList;
    @OneToMany(mappedBy = "eeicIdObjetivo")
    private List<EeicAccion> eeicAccionList;

    public EeicObjetivos() {
    }

    public EeicObjetivos(Integer idObjetivo) {
        this.idObjetivo = idObjetivo;
    }

    public EeicObjetivos(Integer idObjetivo, String descripcion, Date fechaInicio) {
        this.idObjetivo = idObjetivo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdObjetivo() {
        return idObjetivo;
    }

    public void setIdObjetivo(Integer idObjetivo) {
        this.idObjetivo = idObjetivo;
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

    public List<EeicMetas> getEeicMetasList() {
        return eeicMetasList;
    }

    public void setEeicMetasList(List<EeicMetas> eeicMetasList) {
        this.eeicMetasList = eeicMetasList;
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
        hash += (idObjetivo != null ? idObjetivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicObjetivos)) {
            return false;
        }
        EeicObjetivos other = (EeicObjetivos) object;
        if ((this.idObjetivo == null && other.idObjetivo != null) || (this.idObjetivo != null && !this.idObjetivo.equals(other.idObjetivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain2.EeicObjetivos[ idObjetivo=" + idObjetivo + " ]";
    }
    
}
