/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.accion;

import mx.gob.conabio.domain.entities.actividad.finanzas.*;
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
@Table(name = "eeit_accion_detalle_financiero", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitAccionDetalleFinanciero.findAll", query = "SELECT e FROM EeitAccionDetalleFinanciero e")
    , @NamedQuery(name = "EeitAccionDetalleFinanciero.findByIdAccion", query = "SELECT e FROM EeitAccionDetalleFinanciero e WHERE e.idAccion = :idAccion")})
public class EeitAccionDetalleFinanciero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAccion")
    private Integer idAccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Superficie")
    private int superficie;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Total")
    private BigDecimal total;
    @JoinColumn(name = "idAccion", referencedColumnName = "idAccion", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private EeitAccionInfoFinanciera eeitAccionInfoFinanciera;
    @JoinColumn(name = "idTipoDesglose", referencedColumnName = "idTipoDesglose")
     @ManyToOne(optional = false,fetch= FetchType.EAGER)
    private EeicTiposdesglose idTipoDesglose;
    @Column(name = "anio")
    private @Getter @Setter int anio;
    
    public EeitAccionDetalleFinanciero() {
    }

    public EeitAccionDetalleFinanciero(Integer idAccion) {
        this.idAccion = idAccion;
    }

    public EeitAccionDetalleFinanciero(Integer idAccion, int superficie) {
        this.idAccion = idAccion;
        this.superficie = superficie;
    }

    public Integer getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(Integer idAccion) {
        this.idAccion = idAccion;
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

    public EeitAccionInfoFinanciera getEeitAccionInfoFinanciera() {
        return eeitAccionInfoFinanciera;
    }

    public void setEeitAccionInfoFinanciera(EeitAccionInfoFinanciera eeitAccionInfoFinanciera) {
        this.eeitAccionInfoFinanciera = eeitAccionInfoFinanciera;
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
        hash += (idAccion != null ? idAccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitAccionDetalleFinanciero)) {
            return false;
        }
        EeitAccionDetalleFinanciero other = (EeitAccionDetalleFinanciero) object;
        if ((this.idAccion == null && other.idAccion != null) || (this.idAccion != null && !this.idAccion.equals(other.idAccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.finanzas.EeitAccionDetalleFinanciero[ idAccion=" + idAccion + " ]";
    }
    
}
