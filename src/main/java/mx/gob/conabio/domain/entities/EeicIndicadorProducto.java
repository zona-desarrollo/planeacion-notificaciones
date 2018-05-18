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
import mx.gob.conabio.domain.entities.EeicProductogef;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_indicador_producto", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicIndicadorProducto.findAll", query = "SELECT e FROM EeicIndicadorProducto e")
    , @NamedQuery(name = "EeicIndicadorProducto.findByIdIndicadorProductoGef", query = "SELECT e FROM EeicIndicadorProducto e WHERE e.idIndicadorProductoGef = :idIndicadorProductoGef")
    , @NamedQuery(name = "EeicIndicadorProducto.findByIdProductoGef", query = "SELECT e FROM EeicIndicadorProducto e WHERE e.idProductoGef.idProductoGEF = :idProductoGef")})
public class EeicIndicadorProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idIndicadorProductoGef")
    private Integer idIndicadorProductoGef;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
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
    @JoinColumn(name = "idProductoGef", referencedColumnName = "idProductoGEF")
    @ManyToOne(optional = false)
    private EeicProductogef idProductoGef;

    public EeicIndicadorProducto() {
    }

    public EeicIndicadorProducto(Integer idIndicadorProductoGef) {
        this.idIndicadorProductoGef = idIndicadorProductoGef;
    }

    public EeicIndicadorProducto(Integer idIndicadorProductoGef, String descripcion, Date fechaInicio) {
        this.idIndicadorProductoGef = idIndicadorProductoGef;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdIndicadorProductoGef() {
        return idIndicadorProductoGef;
    }

    public void setIdIndicadorProductoGef(Integer idIndicadorProductoGef) {
        this.idIndicadorProductoGef = idIndicadorProductoGef;
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

    public EeicProductogef getIdProductoGef() {
        return idProductoGef;
    }

    public void setIdProductoGef(EeicProductogef idProductoGef) {
        this.idProductoGef = idProductoGef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIndicadorProductoGef != null ? idIndicadorProductoGef.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicIndicadorProducto)) {
            return false;
        }
        EeicIndicadorProducto other = (EeicIndicadorProducto) object;
        if ((this.idIndicadorProductoGef == null && other.idIndicadorProductoGef != null) || (this.idIndicadorProductoGef != null && !this.idIndicadorProductoGef.equals(other.idIndicadorProductoGef))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.config.EeicIndicadorProducto[ idIndicadorProductoGef=" + idIndicadorProductoGef + " ]";
    }
    
}
