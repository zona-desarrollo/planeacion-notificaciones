/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.actividad.finanzas;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_actividad_detalle_financiero", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitActividadDetalleFinanciero.findAll", query = "SELECT e FROM EeitActividadDetalleFinanciero e")
    , @NamedQuery(name = "EeitActividadDetalleFinanciero.findByIdActividad", query = "SELECT e FROM EeitActividadDetalleFinanciero e WHERE e.idActividad = :idActividad")})
public class EeitActividadDetalleFinanciero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idActividad")
    private Integer idActividad;
    @Basic(optional = false)
    @Column(name = "Superficie")
    private int superficie;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Total")
    private BigDecimal total;
    
    @JoinColumn(name = "idActividad", referencedColumnName = "idActividad", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private EeitActividadInfoFinanciera eeitActividadInfoFinanciera;
    
    @JoinColumn(name = "idTipoDesglose", referencedColumnName = "idTipoDesglose")
    @ManyToOne(optional = false,fetch= FetchType.EAGER)
    private EeicTiposdesglose idTipoDesglose;

    @Column(name = "anio")
    private @Getter @Setter int anio;
    
    
    public EeitActividadDetalleFinanciero() {
    }

    public EeitActividadDetalleFinanciero(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public EeitActividadDetalleFinanciero(Integer idActividad, int superficie) {
        this.idActividad = idActividad;
        this.superficie = superficie;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public EeitActividadInfoFinanciera getEeitActividadInfoFinanciera() {
        return eeitActividadInfoFinanciera;
    }

    public void setEeitActividadInfoFinanciera(EeitActividadInfoFinanciera eeitActividadInfoFinanciera) {
        this.eeitActividadInfoFinanciera = eeitActividadInfoFinanciera;
    }

    public EeicTiposdesglose getIdTipoDesglose() {
        return idTipoDesglose;
    }

    public void setIdTipoDesglose(EeicTiposdesglose idTipoDesglose) {
        this.idTipoDesglose = idTipoDesglose;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividad != null ? idActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitActividadDetalleFinanciero)) {
            return false;
        }
        EeitActividadDetalleFinanciero other = (EeitActividadDetalleFinanciero) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.finanzas.EeitActividadDetalleFinanciero[ idActividad=" + idActividad + " ]";
    }
    
}
