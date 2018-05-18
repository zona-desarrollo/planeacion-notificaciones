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
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.engine.internal.Cascade;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_actividad_info_financiera", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitActividadInfoFinanciera.findAll", query = "SELECT e FROM EeitActividadInfoFinanciera e")
    , @NamedQuery(name = "EeitActividadInfoFinanciera.findByIdActividad", query = "SELECT e FROM EeitActividadInfoFinanciera e WHERE e.idActividad = :idActividad")
})
public class EeitActividadInfoFinanciera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idActividad")
    private Integer idActividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFinanciador")
    private int idFinanciador;
    @Size(max = 100)
    @Column(name = "OtroFinanciador")
    private String otroFinanciador;
    @Column(name = "TipoDeCambio")
    private BigDecimal tipoDeCambio = new BigDecimal(0);
    
    
    @Column(name = "AnioPresupuesto")
    private Integer anioPresupuesto;
    
    @Column(name = "AnioPresupuestoDate")
    @Temporal(TemporalType.DATE)
    private @Getter @Setter Date anioPresupuestoDate;
    
    
    @OneToMany (fetch = FetchType.EAGER)
    @JoinTable( 
                name = "eeia_actividad_financiadopor",
                joinColumns = @JoinColumn(name = "idActividad"),
                inverseJoinColumns = @JoinColumn(name = "idFinanciador"))
    private Set<EeicFinanciadores> financiadores;

    public Set<EeicFinanciadores> getFinanciadores() {
        return financiadores;
    }

    public void setFinanciadores(Set<EeicFinanciadores> financiadores) {
        this.financiadores = financiadores;
    }
    

    public EeitActividadInfoFinanciera() {
    }

    public EeitActividadInfoFinanciera(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public EeitActividadInfoFinanciera(Integer idActividad, int idFinanciador) {
        this.idActividad = idActividad;
        this.idFinanciador = idFinanciador;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public int getIdFinanciador() {
        return idFinanciador;
    }

    public void setIdFinanciador(int idFinanciador) {
        this.idFinanciador = idFinanciador;
    }

    public String getOtroFinanciador() {
        return otroFinanciador;
    }

    public void setOtroFinanciador(String otroFinanciador) {
        this.otroFinanciador = otroFinanciador;
    }

    public Integer getAnioPresupuesto() {
        return anioPresupuesto;
    }

    public void setAnioPresupuesto(Integer anioPresupuesto) {
        this.anioPresupuesto = anioPresupuesto;
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
        if (!(object instanceof EeitActividadInfoFinanciera)) {
            return false;
        }
        EeitActividadInfoFinanciera other = (EeitActividadInfoFinanciera) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.finanzas.EeitActividadInfoFinanciera[ idActividad=" + idActividad + " ]";
    }

    public BigDecimal getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(BigDecimal tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }
 
   
}
