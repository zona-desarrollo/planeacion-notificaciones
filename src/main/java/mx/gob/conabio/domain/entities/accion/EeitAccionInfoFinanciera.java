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
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_accion_info_financiera", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitAccionInfoFinanciera.findAll", query = "SELECT e FROM EeitAccionInfoFinanciera e")
    , @NamedQuery(name = "EeitAccionInfoFinanciera.findByIdAccion", query = "SELECT e FROM EeitAccionInfoFinanciera e WHERE e.idAccion = :idAccion")
})
public class EeitAccionInfoFinanciera implements Serializable {

    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER, mappedBy = "eeitAccionInfoFinanciera")
    private @Getter @Setter List<EeitAccionInfoFinancieraFinanciadores> eeitAccionInfoFinancieraFinanciadores;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAccion")
    private @Getter @Setter Integer idAccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFinanciador")
    private @Getter @Setter int idFinanciador;
    
  
    @Size(max = 100)
    @Column(name = "OtroFinanciador")
    private @Getter @Setter String otroFinanciador;
    @Column(name = "TipoDeCambio")
    private @Getter @Setter BigDecimal tipoDeCambio = new BigDecimal(0);
    @Column(name = "AnioPresupuesto")
    private @Getter @Setter Integer anioPresupuesto;
    
    @Column(name = "AnioPresupuestoDate")
    @Temporal(TemporalType.DATE)
    private @Getter @Setter Date anioPresupuestoDate;

    public EeitAccionInfoFinanciera() {
    }

    public EeitAccionInfoFinanciera(Integer idAccion) {
        this.idAccion = idAccion;
    }

    public EeitAccionInfoFinanciera(Integer idAccion, int idFinanciador) {
        this.idAccion = idAccion;
        this.idFinanciador = idFinanciador;
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
        if (!(object instanceof EeitAccionInfoFinanciera)) {
            return false;
        }
        EeitAccionInfoFinanciera other = (EeitAccionInfoFinanciera) object;
        if ((this.idAccion == null && other.idAccion != null) || (this.idAccion != null && !this.idAccion.equals(other.idAccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.finanzas.EeitAccionInfoFinanciera[ idAccion=" + idAccion + " ]";
    }

   
}
