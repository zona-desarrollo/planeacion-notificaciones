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
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_productogef", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicProductogef.findAll", query = "SELECT e FROM EeicProductogef e")
    , @NamedQuery(name = "EeicProductogef.findByIdProductoGEF", query = "SELECT e FROM EeicProductogef e WHERE e.idProductoGEF = :idProductoGEF")
    , @NamedQuery(name = "EeicProductogef.findByIdComponenteGEF", query = "SELECT e FROM EeicProductogef e WHERE e.idComponenteGEF.idComponenteGEF = :idComponenteGEF")})
public class EeicProductogef implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProductoGef")
    private List<EeicIndicadorProducto> eeicIndicadorProductoList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProductoGEF")
    private Integer idProductoGEF;
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
    @JoinColumn(name = "idComponenteGEF", referencedColumnName = "idComponenteGEF")
    @ManyToOne(optional = false)
    private EeicComponentegef idComponenteGEF;

    public EeicProductogef() {
    }

    public EeicProductogef(Integer idProductoGEF) {
        this.idProductoGEF = idProductoGEF;
    }

    public EeicProductogef(Integer idProductoGEF, String descripcion, Date fechaInicio) {
        this.idProductoGEF = idProductoGEF;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdProductoGEF() {
        return idProductoGEF;
    }

    public void setIdProductoGEF(Integer idProductoGEF) {
        this.idProductoGEF = idProductoGEF;
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

    public EeicComponentegef getIdComponenteGEF() {
        return idComponenteGEF;
    }

    public void setIdComponenteGEF(EeicComponentegef idComponenteGEF) {
        this.idComponenteGEF = idComponenteGEF;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductoGEF != null ? idProductoGEF.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicProductogef)) {
            return false;
        }
        EeicProductogef other = (EeicProductogef) object;
        if ((this.idProductoGEF == null && other.idProductoGEF != null) || (this.idProductoGEF != null && !this.idProductoGEF.equals(other.idProductoGEF))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeicProductogef[ idProductoGEF=" + idProductoGEF + " ]";
    }

    public List<EeicIndicadorProducto> getEeicIndicadorProductoList() {
        return eeicIndicadorProductoList;
    }

    public void setEeicIndicadorProductoList(List<EeicIndicadorProducto> eeicIndicadorProductoList) {
        this.eeicIndicadorProductoList = eeicIndicadorProductoList;
    }
    
}
