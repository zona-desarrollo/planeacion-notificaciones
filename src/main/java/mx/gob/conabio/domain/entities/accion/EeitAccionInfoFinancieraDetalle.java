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
import javax.validation.constraints.Size;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_accion_info_financiera_detalle", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitAccionInfoFinancieraDetalle.findAll", query = "SELECT e FROM EeitAccionInfoFinancieraDetalle e")
    , @NamedQuery(name = "EeitAccionInfoFinancieraDetalle.findByIdAccion", query = "SELECT e FROM EeitAccionInfoFinancieraDetalle e WHERE e.eeitAccionInfoFinancieraDetallePK.idAccion = :idAccion")
    , @NamedQuery(name = "EeitAccionInfoFinancieraDetalle.findByAnio", query = "SELECT e FROM EeitAccionInfoFinancieraDetalle e WHERE e.eeitAccionInfoFinancieraDetallePK.anio = :anio")})
public class EeitAccionInfoFinancieraDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeitAccionInfoFinancieraDetallePK eeitAccionInfoFinancieraDetallePK;
    @Size(max = 100)
    @Column(name = "DescripcionOtros")
    private String descripcionOtros;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CostFin1CostoEspecie")
    private BigDecimal costFin1CostoEspecie = new BigDecimal(0);
    @Column(name = "CostFin1CostoEfectivo")
    private BigDecimal costFin1CostoEfectivo  = new BigDecimal(0);
    @Column(name = "CostFin1Total")
    private BigDecimal costFin1Total  = new BigDecimal(0);
    @Column(name = "CostFin2CostoEspecie")
    private BigDecimal costFin2CostoEspecie  = new BigDecimal(0);
    @Column(name = "CostFin2CostoEfectivo")
    private BigDecimal costFin2CostoEfectivo  = new BigDecimal(0);
    @Column(name = "CostFin2Total")
    private BigDecimal costFin2Total = new BigDecimal(0);
    @Column(name = "CostFin3CostoEspecie")
    private BigDecimal costFin3CostoEspecie  = new BigDecimal(0);
    @Column(name = "CostFin3CostoEfectivo")
    private BigDecimal costFin3CostoEfectivo  = new BigDecimal(0);
    @Column(name = "CostFin3Total")
    private BigDecimal costFin3Total  = new BigDecimal(0);
    @Column(name = "CostFin4CostoEspecie")
    private BigDecimal costFin4CostoEspecie  = new BigDecimal(0);
    @Column(name = "CostFin4CostoEfectivo")
    private BigDecimal costFin4CostoEfectivo  = new BigDecimal(0);
    @Column(name = "CostFin4Total")
    private BigDecimal costFin4Total  = new BigDecimal(0);
    @Column(name = "CostFin5CostoEspecie")
    private BigDecimal costFin5CostoEspecie  = new BigDecimal(0);
    @Column(name = "CostFin5CostoEfectivo")
    private BigDecimal costFin5CostoEfectivo  = new BigDecimal(0);
    @Column(name = "CostFin5Total")
    private BigDecimal costFin5Total  = new BigDecimal(0);
    @Column(name = "CostFin6CostoEspecie")
    private BigDecimal costFin6CostoEspecie  = new BigDecimal(0);
    @Column(name = "CostFin6CostoEfectivo")
    private BigDecimal costFin6CostoEfectivo  = new BigDecimal(0);
    @Column(name = "CostFin6Total")
    private BigDecimal costFin6Total  = new BigDecimal(0);
    @Column(name = "CostFin7CostoEspecie")
    private BigDecimal costFin7CostoEspecie  = new BigDecimal(0);
    @Column(name = "CostFin7CostoEfectivo")
    private BigDecimal costFin7CostoEfectivo  = new BigDecimal(0);
    @Column(name = "CostFin7Total")
    private BigDecimal costFin7Total  = new BigDecimal(0);

    public EeitAccionInfoFinancieraDetalle() {
    }

    public EeitAccionInfoFinancieraDetalle(EeitAccionInfoFinancieraDetallePK eeitAccionInfoFinancieraDetallePK) {
        this.eeitAccionInfoFinancieraDetallePK = eeitAccionInfoFinancieraDetallePK;
    }

    public EeitAccionInfoFinancieraDetalle(int idAccion, int anio) {
        this.eeitAccionInfoFinancieraDetallePK = new EeitAccionInfoFinancieraDetallePK(idAccion, anio);
    }

    public EeitAccionInfoFinancieraDetallePK getEeitAccionInfoFinancieraDetallePK() {
        return eeitAccionInfoFinancieraDetallePK;
    }

    public void setEeitAccionInfoFinancieraDetallePK(EeitAccionInfoFinancieraDetallePK eeitAccionInfoFinancieraDetallePK) {
        this.eeitAccionInfoFinancieraDetallePK = eeitAccionInfoFinancieraDetallePK;
    }

    public String getDescripcionOtros() {
        return descripcionOtros;
    }

    public void setDescripcionOtros(String descripcionOtros) {
        this.descripcionOtros = descripcionOtros;
    }

    public BigDecimal getCostFin1CostoEspecie() {
        return costFin1CostoEspecie;
    }

    public void setCostFin1CostoEspecie(BigDecimal costFin1CostoEspecie) {
        this.costFin1CostoEspecie = costFin1CostoEspecie;
    }

    public BigDecimal getCostFin1CostoEfectivo() {
        return costFin1CostoEfectivo;
    }

    public void setCostFin1CostoEfectivo(BigDecimal costFin1CostoEfectivo) {
        this.costFin1CostoEfectivo = costFin1CostoEfectivo;
    }

    public BigDecimal getCostFin1Total() {
        return costFin1Total;
    }

    public void setCostFin1Total(BigDecimal costFin1Total) {
        this.costFin1Total = costFin1Total;
    }

    public BigDecimal getCostFin2CostoEspecie() {
        return costFin2CostoEspecie;
    }

    public void setCostFin2CostoEspecie(BigDecimal costFin2CostoEspecie) {
        this.costFin2CostoEspecie = costFin2CostoEspecie;
    }

    public BigDecimal getCostFin2CostoEfectivo() {
        return costFin2CostoEfectivo;
    }

    public void setCostFin2CostoEfectivo(BigDecimal costFin2CostoEfectivo) {
        this.costFin2CostoEfectivo = costFin2CostoEfectivo;
    }

    public BigDecimal getCostFin2Total() {
        return costFin2Total;
    }

    public void setCostFin2Total(BigDecimal costFin2Total) {
        this.costFin2Total = costFin2Total;
    }

    public BigDecimal getCostFin3CostoEspecie() {
        return costFin3CostoEspecie;
    }

    public void setCostFin3CostoEspecie(BigDecimal costFin3CostoEspecie) {
        this.costFin3CostoEspecie = costFin3CostoEspecie;
    }

    public BigDecimal getCostFin3CostoEfectivo() {
        return costFin3CostoEfectivo;
    }

    public void setCostFin3CostoEfectivo(BigDecimal costFin3CostoEfectivo) {
        this.costFin3CostoEfectivo = costFin3CostoEfectivo;
    }

    public BigDecimal getCostFin3Total() {
        return costFin3Total;
    }

    public void setCostFin3Total(BigDecimal costFin3Total) {
        this.costFin3Total = costFin3Total;
    }

    public BigDecimal getCostFin4CostoEspecie() {
        return costFin4CostoEspecie;
    }

    public void setCostFin4CostoEspecie(BigDecimal costFin4CostoEspecie) {
        this.costFin4CostoEspecie = costFin4CostoEspecie;
    }

    public BigDecimal getCostFin4CostoEfectivo() {
        return costFin4CostoEfectivo;
    }

    public void setCostFin4CostoEfectivo(BigDecimal costFin4CostoEfectivo) {
        this.costFin4CostoEfectivo = costFin4CostoEfectivo;
    }

    public BigDecimal getCostFin4Total() {
        return costFin4Total;
    }

    public void setCostFin4Total(BigDecimal costFin4Total) {
        this.costFin4Total = costFin4Total;
    }

    public BigDecimal getCostFin5CostoEspecie() {
        return costFin5CostoEspecie;
    }

    public void setCostFin5CostoEspecie(BigDecimal costFin5CostoEspecie) {
        this.costFin5CostoEspecie = costFin5CostoEspecie;
    }

    public BigDecimal getCostFin5CostoEfectivo() {
        return costFin5CostoEfectivo;
    }

    public void setCostFin5CostoEfectivo(BigDecimal costFin5CostoEfectivo) {
        this.costFin5CostoEfectivo = costFin5CostoEfectivo;
    }

    public BigDecimal getCostFin5Total() {
        return costFin5Total;
    }

    public void setCostFin5Total(BigDecimal costFin5Total) {
        this.costFin5Total = costFin5Total;
    }

    public BigDecimal getCostFin6CostoEspecie() {
        return costFin6CostoEspecie;
    }

    public void setCostFin6CostoEspecie(BigDecimal costFin6CostoEspecie) {
        this.costFin6CostoEspecie = costFin6CostoEspecie;
    }

    public BigDecimal getCostFin6CostoEfectivo() {
        return costFin6CostoEfectivo;
    }

    public void setCostFin6CostoEfectivo(BigDecimal costFin6CostoEfectivo) {
        this.costFin6CostoEfectivo = costFin6CostoEfectivo;
    }

    public BigDecimal getCostFin6Total() {
        return costFin6Total;
    }

    public void setCostFin6Total(BigDecimal costFin6Total) {
        this.costFin6Total = costFin6Total;
    }

    public BigDecimal getCostFin7CostoEspecie() {
        return costFin7CostoEspecie;
    }

    public void setCostFin7CostoEspecie(BigDecimal costFin7CostoEspecie) {
        this.costFin7CostoEspecie = costFin7CostoEspecie;
    }

    public BigDecimal getCostFin7CostoEfectivo() {
        return costFin7CostoEfectivo;
    }

    public void setCostFin7CostoEfectivo(BigDecimal costFin7CostoEfectivo) {
        this.costFin7CostoEfectivo = costFin7CostoEfectivo;
    }

    public BigDecimal getCostFin7Total() {
        return costFin7Total;
    }

    public void setCostFin7Total(BigDecimal costFin7Total) {
        this.costFin7Total = costFin7Total;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeitAccionInfoFinancieraDetallePK != null ? eeitAccionInfoFinancieraDetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitAccionInfoFinancieraDetalle)) {
            return false;
        }
        EeitAccionInfoFinancieraDetalle other = (EeitAccionInfoFinancieraDetalle) object;
        if ((this.eeitAccionInfoFinancieraDetallePK == null && other.eeitAccionInfoFinancieraDetallePK != null) || (this.eeitAccionInfoFinancieraDetallePK != null && !this.eeitAccionInfoFinancieraDetallePK.equals(other.eeitAccionInfoFinancieraDetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.finanzas.EeitAccionInfoFinancieraDetalle[ eeitAccionInfoFinancieraDetallePK=" + eeitAccionInfoFinancieraDetallePK + " ]";
    }
    
}
