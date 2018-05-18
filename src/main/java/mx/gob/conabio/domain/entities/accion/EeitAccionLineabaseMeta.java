/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_accion_lineabase_meta", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitAccionLineabaseMeta.findAll", query = "SELECT e FROM EeitAccionLineabaseMeta e")
    , @NamedQuery(name = "EeitAccionLineabaseMeta.findByIdlineabase", query = "SELECT e FROM EeitAccionLineabaseMeta e WHERE e.eeitAccionLineabaseMetaPK.idlineabase = :idlineabase")
    , @NamedQuery(name = "EeitAccionLineabaseMeta.findByConsec", query = "SELECT e FROM EeitAccionLineabaseMeta e WHERE e.eeitAccionLineabaseMetaPK.consec = :consec")
    , @NamedQuery(name = "EeitAccionLineabaseMeta.findByMeta", query = "SELECT e FROM EeitAccionLineabaseMeta e WHERE e.meta = :meta")})
public class EeitAccionLineabaseMeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeitAccionLineabaseMetaPK eeitAccionLineabaseMetaPK;
    
    @Size(max = 45)
    @Column(name = "meta")
    private String meta;
    
   
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "idlineabase"),
                 @JoinColumn(name = "consec")})
    private EeitAccionLineabase lineabase;

    public EeitAccionLineabase getLineabase() {
        return lineabase;
    }

    public void setLineabase(EeitAccionLineabase lineabase) {
        this.lineabase = lineabase;
    }
    
    
    
    
    public EeitAccionLineabaseMeta() {
        
    }

    public EeitAccionLineabaseMeta(EeitAccionLineabaseMetaPK eeitAccionLineabaseMetaPK) {
        this.eeitAccionLineabaseMetaPK = eeitAccionLineabaseMetaPK;
    }

    public EeitAccionLineabaseMeta(int idlineabase, int consec) {
        this.eeitAccionLineabaseMetaPK = new EeitAccionLineabaseMetaPK(idlineabase, consec);
    }

    public EeitAccionLineabaseMetaPK getEeitAccionLineabaseMetaPK() {
        return eeitAccionLineabaseMetaPK;
    }

    public void setEeitAccionLineabaseMetaPK(EeitAccionLineabaseMetaPK eeitAccionLineabaseMetaPK) {
        this.eeitAccionLineabaseMetaPK = eeitAccionLineabaseMetaPK;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeitAccionLineabaseMetaPK != null ? eeitAccionLineabaseMetaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        ////no instance of this class
        if (!(object instanceof EeitAccionLineabaseMeta)) {
            return false;
        }
        //other primary key is null or consec equals 0, 
        EeitAccionLineabaseMeta other = (EeitAccionLineabaseMeta) object;
       
        EeitAccionLineabaseMetaPK thisKey = this.eeitAccionLineabaseMetaPK;
        EeitAccionLineabaseMetaPK otherKey = other.getEeitAccionLineabaseMetaPK();
        
        if(otherKey != null && thisKey != null){
            return ((thisKey.getIdlineabase() == otherKey.getIdlineabase()) && (thisKey.getConsec() == other.getConsec()));
        }
        return this.consec == other.getConsec();
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.accion.EeitAccionLineabaseMeta[ eeitAccionLineabaseMetaPK=" + eeitAccionLineabaseMetaPK + " ]";
    }
    //consecutive field related to user interface logic, see related classes
    @Transient
    private int consec = 0;

    public int getConsec() {
        return consec;
    }

    public void setConsec(int consec) {
        this.consec = consec;
    }
    
}
