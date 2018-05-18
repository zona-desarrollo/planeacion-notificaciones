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
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_accion_detalle_financiero_costos", catalog = "conabio", schema = "")
@NamedQueries({
      @NamedQuery(name = "EeitAccionDetalleFinancieroCostos.findAll", query = "SELECT e FROM EeitAccionDetalleFinancieroCostos e")
    , @NamedQuery(name = "EeitAccionDetalleFinancieroCostos.findByIdAccion",
            query = "SELECT e FROM EeitAccionDetalleFinancieroCostos e WHERE e.eeitAccionDetalleFinancieroCostosPK.idAccion = :idAccion"),
      @NamedQuery(name = "EeitAccionDetalleFinancieroCostos.findByIdAccionAnio",
            query = "SELECT e FROM EeitAccionDetalleFinancieroCostos e WHERE e.eeitAccionDetalleFinancieroCostosPK.idAccion = :idAccion and e.eeitAccionDetalleFinancieroCostosPK.anio = :anio")})
public class EeitAccionDetalleFinancieroCostos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeitAccionDetalleFinancieroCostosPK eeitAccionDetalleFinancieroCostosPK;
    @Size(max = 40)
    @Column(name = "SubCosto")
    private String subCosto;
    @Size(max = 40)
    @Column(name = "UnidadFisica")
    private String unidadFisica;
    @Column(name = "UnidadDeMedida")
    private @Getter @Setter BigDecimal unidadDeMedida  = new BigDecimal(0);;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UnidadDeValor")
    private BigDecimal unidadDeValor = new BigDecimal(0);
    
    @Transient
    private @Getter @Setter BigDecimal subTotal = new BigDecimal(0);
    

    
     @Transient
    public @Getter @Setter boolean disableDetalleAction;
    public EeitAccionDetalleFinancieroCostos() {
    }

    public EeitAccionDetalleFinancieroCostos(EeitAccionDetalleFinancieroCostosPK eeitAccionDetalleFinancieroCostosPK) {
        this.eeitAccionDetalleFinancieroCostosPK = eeitAccionDetalleFinancieroCostosPK;
    }

    public EeitAccionDetalleFinancieroCostos(int idAccion, int idCosto, int consecutivo, int anio) {
        this.eeitAccionDetalleFinancieroCostosPK = new EeitAccionDetalleFinancieroCostosPK(idAccion, idCosto, consecutivo,anio);
    }

    public EeitAccionDetalleFinancieroCostosPK getEeitAccionDetalleFinancieroCostosPK() {
        return eeitAccionDetalleFinancieroCostosPK;
    }

    public void setEeitAccionDetalleFinancieroCostosPK(EeitAccionDetalleFinancieroCostosPK eeitAccionDetalleFinancieroCostosPK) {
        this.eeitAccionDetalleFinancieroCostosPK = eeitAccionDetalleFinancieroCostosPK;
    }

    public String getSubCosto() {
        return subCosto;
    }

    public void setSubCosto(String subCosto) {
        this.subCosto = subCosto;
    }

    public String getUnidadFisica() {
        return unidadFisica;
    }

    public void setUnidadFisica(String unidadFisica) {
        this.unidadFisica = unidadFisica;
    }

    public BigDecimal getUnidadDeValor() {
        return unidadDeValor;
    }

    public void setUnidadDeValor(BigDecimal unidadDeValor) {
        this.unidadDeValor = unidadDeValor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeitAccionDetalleFinancieroCostosPK != null ? eeitAccionDetalleFinancieroCostosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitAccionDetalleFinancieroCostos)) {
            return false;
        }
        EeitAccionDetalleFinancieroCostos other = (EeitAccionDetalleFinancieroCostos) object;
        return !((this.eeitAccionDetalleFinancieroCostosPK == null && other.eeitAccionDetalleFinancieroCostosPK != null) || (this.eeitAccionDetalleFinancieroCostosPK != null && !this.eeitAccionDetalleFinancieroCostosPK.equals(other.eeitAccionDetalleFinancieroCostosPK)));
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.finanzas.EeitAccionDetalleFinancieroCostos[ eeitAccionDetalleFinancieroCostosPK=" + eeitAccionDetalleFinancieroCostosPK + " ]";
    }
    
}
