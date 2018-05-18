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
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_componentegef", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicComponentegef.findAll", query = "SELECT e FROM EeicComponentegef e")
    , @NamedQuery(name = "EeicComponentegef.findByIdComponenteGEF", query = "SELECT e FROM EeicComponentegef e WHERE e.idComponenteGEF = :idComponenteGEF")})
public class EeicComponentegef implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idComponenteGef")
    private List<EeicIndicadoresgef> eeicIndicadoresgefList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idComponenteGEF")
    private Integer idComponenteGEF;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idComponenteGEF")
    private List<EeicProductogef> eeicProductogefList;

    public EeicComponentegef() {
    }

    public EeicComponentegef(Integer idComponenteGEF) {
        this.idComponenteGEF = idComponenteGEF;
    }

    public EeicComponentegef(Integer idComponenteGEF, String descripcion, Date fechaInicio) {
        this.idComponenteGEF = idComponenteGEF;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdComponenteGEF() {
        return idComponenteGEF;
    }

    public void setIdComponenteGEF(Integer idComponenteGEF) {
        this.idComponenteGEF = idComponenteGEF;
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

    public List<EeicProductogef> getEeicProductogefList() {
        return eeicProductogefList;
    }

    public void setEeicProductogefList(List<EeicProductogef> eeicProductogefList) {
        this.eeicProductogefList = eeicProductogefList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComponenteGEF != null ? idComponenteGEF.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicComponentegef)) {
            return false;
        }
        EeicComponentegef other = (EeicComponentegef) object;
        if ((this.idComponenteGEF == null && other.idComponenteGEF != null) || (this.idComponenteGEF != null && !this.idComponenteGEF.equals(other.idComponenteGEF))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeicComponentegef[ idComponenteGEF=" + idComponenteGEF + " ]";
    }

    public List<EeicIndicadoresgef> getEeicIndicadoresgefList() {
        return eeicIndicadoresgefList;
    }

    public void setEeicIndicadoresgefList(List<EeicIndicadoresgef> eeicIndicadoresgefList) {
        this.eeicIndicadoresgefList = eeicIndicadoresgefList;
    }
    
}
