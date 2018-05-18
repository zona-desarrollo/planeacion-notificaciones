/* 
* Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.accion;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author yukio arroyo gomez (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_accion_info_financiera_financiadores")
@NamedQueries({
    @NamedQuery(name = "EeitAccionInfoFinancieraFinanciadores.findByIdAccion", query = "SELECT e FROM EeitAccionInfoFinancieraFinanciadores e WHERE e.eeitAccionInfoFinancieraFinanciadoresPK.idAccion = :idAccion")
    })
public class EeitAccionInfoFinancieraFinanciadores implements Serializable {

    @EmbeddedId
    protected @Getter @Setter EeitAccionInfoFinancieraFinanciadoresPK eeitAccionInfoFinancieraFinanciadoresPK;

    private static final long serialVersionUID = 1L;
    
    @Size(max = 80)
    @Column(name = "otroFinanciador")
    private String otroFinanciador;
    @JoinColumn(name = "idAccion", referencedColumnName = "idAccion", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EeitAccionInfoFinanciera eeitAccionInfoFinanciera;
    
    @Column(name = "idFinanciador")
    private @Getter @Setter int idFinanciador;
    @Column(name = "idFinanciador2")
    private @Getter @Setter int idFinanciador2;
    @Column(name = "idFinanciador3")
    private @Getter @Setter int idFinanciador3;
    
    
    
    public void setFinanciadores(int[] arrayFinanciadores){
        if(arrayFinanciadores == null){
            return;
        }
        if(arrayFinanciadores.length == 1){
            this.idFinanciador = arrayFinanciadores[0];
        }else if(arrayFinanciadores.length == 2){
            this.idFinanciador2 = arrayFinanciadores[1];
        }
        else{
           this.idFinanciador3 = arrayFinanciadores[2]; 
        }
        
    }
    public int[] getFinanciadores(){
            return new int[] {this.idFinanciador,this.idFinanciador2,this.idFinanciador3};
        
    }
    public EeitAccionInfoFinancieraFinanciadores() {
    }

    public String getOtroFinanciador() {
        return otroFinanciador;
    }

    public void setOtroFinanciador(String otroFinanciador) {
        this.otroFinanciador = otroFinanciador;
    }

    public EeitAccionInfoFinanciera getEeitAccionInfoFinanciera() {
        return eeitAccionInfoFinanciera;
    }

    public void setEeitAccionInfoFinanciera(EeitAccionInfoFinanciera eeitAccionInfoFinanciera) {
        this.eeitAccionInfoFinanciera = eeitAccionInfoFinanciera;
    }

    @Column(name = "persistido")
    public @Getter @Setter boolean persistido;

    @Transient
    public @Getter @Setter boolean readonlyOtro;
    
    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof EeitAccionInfoFinancieraFinanciadores)) {
            return false;
        }
        EeitAccionInfoFinancieraFinanciadores other = (EeitAccionInfoFinancieraFinanciadores) object;
        if (this.eeitAccionInfoFinancieraFinanciadoresPK != other.getEeitAccionInfoFinancieraFinanciadoresPK()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.accion.EeitAccionInfoFinancieraFinanciadores[ Id "+ this.eeitAccionInfoFinancieraFinanciadoresPK + " ]";
    }
}
