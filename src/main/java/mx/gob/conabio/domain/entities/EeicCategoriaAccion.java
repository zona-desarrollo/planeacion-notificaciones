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
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_categoriaaccion", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicCategoriaAccion.findAll", query = "SELECT e FROM EeicCategoriaAccion e")})
public class EeicCategoriaAccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCategoriaAccion")
    private Integer idCategoriaAccion;
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
    public EeicCategoriaAccion() {
    }

    public EeicCategoriaAccion(Integer idCategoriaAccion) {
        this.idCategoriaAccion = idCategoriaAccion;
    }

    public EeicCategoriaAccion(Integer idCategoriaAccion, String descripcion, Date fechaInicio) {
        this.idCategoriaAccion = idCategoriaAccion;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdCategoriaAccion() {
        return idCategoriaAccion;
    }

    public void setIdCategoriaAccion(Integer idCategoriaAccion) {
        this.idCategoriaAccion = idCategoriaAccion;
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
        hash += (idCategoriaAccion != null ? idCategoriaAccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicCategoriaAccion)) {
            return false;
        }
        EeicCategoriaAccion other = (EeicCategoriaAccion) object;
        if ((this.idCategoriaAccion == null && other.idCategoriaAccion != null) ||
            (this.idCategoriaAccion != null && !this.idCategoriaAccion.equals(other.idCategoriaAccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeicCategoriaaccion[ idCategoriaAccion=" + idCategoriaAccion + " ]";
    }

}
