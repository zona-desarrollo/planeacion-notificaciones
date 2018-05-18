/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.actividad.finanzas;

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
@Table(name = "eeic_tiposdesglose", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicTiposdesglose.findAll", query = "SELECT e FROM EeicTiposdesglose e")
    , @NamedQuery(name = "EeicTiposdesglose.findByIdTipoDesglose", query = "SELECT e FROM EeicTiposdesglose e WHERE e.idTipoDesglose = :idTipoDesglose")})
public class EeicTiposdesglose implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoDesglose")
    private Integer idTipoDesglose;
    @Basic(optional = false)
    @Size(min = 1, max = 50)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "FechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @OneToMany(mappedBy = "idTipoDesglose")
    private List<EeitActividadDetalleFinanciero> eeitActividadDetalleFinancieroList;

    public EeicTiposdesglose() {
    }

    public EeicTiposdesglose(Integer idTipoDesglose) {
        this.idTipoDesglose = idTipoDesglose;
    }

    public EeicTiposdesglose(Integer idTipoDesglose, String descripcion, Date fechaInicio) {
        this.idTipoDesglose = idTipoDesglose;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdTipoDesglose() {
        return idTipoDesglose;
    }

    public void setIdTipoDesglose(Integer idTipoDesglose) {
        this.idTipoDesglose = idTipoDesglose;
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

    public List<EeitActividadDetalleFinanciero> getEeitActividadDetalleFinancieroList() {
        return eeitActividadDetalleFinancieroList;
    }

    public void setEeitActividadDetalleFinancieroList(List<EeitActividadDetalleFinanciero> eeitActividadDetalleFinancieroList) {
        this.eeitActividadDetalleFinancieroList = eeitActividadDetalleFinancieroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDesglose != null ? idTipoDesglose.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicTiposdesglose)) {
            return false;
        }
        EeicTiposdesglose other = (EeicTiposdesglose) object;
        if ((this.idTipoDesglose == null && other.idTipoDesglose != null) || (this.idTipoDesglose != null && !this.idTipoDesglose.equals(other.idTipoDesglose))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.finanzas.EeicTiposdesglose[ idTipoDesglose=" + idTipoDesglose + " ]";
    }
    
}
