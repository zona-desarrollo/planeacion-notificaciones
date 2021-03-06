/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.accion;

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
@Table(name = "eeit_accion_detalle_financiero_beneficios", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitAccionDetalleFinancieroBeneficios.findAll", query = "SELECT e FROM EeitAccionDetalleFinancieroBeneficios e")
    ,@NamedQuery(name = "EeitAccionDetalleFinancieroBeneficios.findByIdAccion", 
            query = "SELECT e FROM EeitAccionDetalleFinancieroBeneficios e WHERE e.eeitAccionDetalleFinancieroBeneficiosPK.idAccion = :idAccion"),
    @NamedQuery(name = "EeitAccionDetalleFinancieroBeneficios.findByIdAccionAnio", 
            query = "SELECT e FROM EeitAccionDetalleFinancieroBeneficios e WHERE e.eeitAccionDetalleFinancieroBeneficiosPK.idAccion = :idAccion and e.eeitAccionDetalleFinancieroBeneficiosPK.anio = :anio")})
public class EeitAccionDetalleFinancieroBeneficios implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeitAccionDetalleFinancieroBeneficiosPK eeitAccionDetalleFinancieroBeneficiosPK;
    @Size(max = 45)
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
    public @Getter @Setter  boolean disableDetalleAction;
    public EeitAccionDetalleFinancieroBeneficios() {
    }

    public EeitAccionDetalleFinancieroBeneficios(EeitAccionDetalleFinancieroBeneficiosPK eeitAccionDetalleFinancieroBeneficiosPK) {
        this.eeitAccionDetalleFinancieroBeneficiosPK = eeitAccionDetalleFinancieroBeneficiosPK;
    }

    public EeitAccionDetalleFinancieroBeneficios(int idAccion, int idBeneficio, int consecutivo, int anio) {
        this.eeitAccionDetalleFinancieroBeneficiosPK = new EeitAccionDetalleFinancieroBeneficiosPK(idAccion, idBeneficio, consecutivo, anio);
    }

    public EeitAccionDetalleFinancieroBeneficiosPK getEeitAccionDetalleFinancieroBeneficiosPK() {
        return eeitAccionDetalleFinancieroBeneficiosPK;
    }

    public void setEeitAccionDetalleFinancieroBeneficiosPK(EeitAccionDetalleFinancieroBeneficiosPK eeitAccionDetalleFinancieroBeneficiosPK) {
        this.eeitAccionDetalleFinancieroBeneficiosPK = eeitAccionDetalleFinancieroBeneficiosPK;
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
        hash += (eeitAccionDetalleFinancieroBeneficiosPK != null ? eeitAccionDetalleFinancieroBeneficiosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitAccionDetalleFinancieroBeneficios)) {
            return false;
        }
        EeitAccionDetalleFinancieroBeneficios other = (EeitAccionDetalleFinancieroBeneficios) object;
        if ((this.eeitAccionDetalleFinancieroBeneficiosPK == null && other.eeitAccionDetalleFinancieroBeneficiosPK != null) || (this.eeitAccionDetalleFinancieroBeneficiosPK != null && !this.eeitAccionDetalleFinancieroBeneficiosPK.equals(other.eeitAccionDetalleFinancieroBeneficiosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.finanzas.EeitAccionDetalleFinancieroBeneficios[ eeitAccionDetalleFinancieroBeneficiosPK=" + eeitAccionDetalleFinancieroBeneficiosPK + " ]";
    }
    
}
