/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.accion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_accion_lineabase", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitAccionLineabase.findAll", query = "SELECT e FROM EeitAccionLineabase e")
    , @NamedQuery(name = "EeitAccionLineabase.findByIdAccion", query = "SELECT e FROM EeitAccionLineabase e WHERE e.eeitAccionLineabasePK.idAccion = :idAccion")
    , @NamedQuery(name = "EeitAccionLineabase.findByConsec", query = "SELECT e FROM EeitAccionLineabase e WHERE e.eeitAccionLineabasePK.consec = :consec")
    , @NamedQuery(name = "EeitAccionLineabase.findByLineabase", query = "SELECT e FROM EeitAccionLineabase e WHERE e.lineabase = :lineabase")})
public class EeitAccionLineabase implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeitAccionLineabasePK eeitAccionLineabasePK;
    @Size(max = 45)
    @Column(name = "lineabase")
    private String lineabase;
    
    
    
    
    public EeitAccionLineabase() {
        
        this.metas = new ArrayList<>();
        EeitAccionLineabaseMeta meta = new EeitAccionLineabaseMeta();
        meta.setConsec(1);
        this.metas.add(meta);
    }

    public EeitAccionLineabase(EeitAccionLineabasePK eeitAccionLineabasePK) {
        this.eeitAccionLineabasePK = eeitAccionLineabasePK;
    }

    public EeitAccionLineabase(int idAccion, int consec) {
        this.eeitAccionLineabasePK = new EeitAccionLineabasePK(idAccion, consec);
    }

    public EeitAccionLineabasePK getEeitAccionLineabasePK() {
        return eeitAccionLineabasePK;
    }

    public void setEeitAccionLineabasePK(EeitAccionLineabasePK eeitAccionLineabasePK) {
        this.eeitAccionLineabasePK = eeitAccionLineabasePK;
    }

    public String getLineabase() {
        return lineabase;
    }

    public void setLineabase(String lineabase) {
        this.lineabase = lineabase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeitAccionLineabasePK != null ? eeitAccionLineabasePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
       ////no instance of this class
        if (!(object instanceof EeitAccionLineabase)) {
            return false;
        }
        //other primary key is null or consec equals 0, 
        EeitAccionLineabase other = (EeitAccionLineabase) object;
       
        EeitAccionLineabasePK thisKey = this.eeitAccionLineabasePK;
        EeitAccionLineabasePK otherKey = other.getEeitAccionLineabasePK();
        
        if(otherKey != null && thisKey != null){
            return ((thisKey.getIdAccion()== otherKey.getIdAccion()) && (thisKey.getConsec() == other.getConsec()));
        }
        return this.consec == other.getConsec();
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.accion.EeitAccionLineabase[ eeitAccionLineabasePK=" + eeitAccionLineabasePK + " ]";
    }



    @ManyToOne    
    @JoinColumn(name = "idAccion")
    private EeitAccion accion;

    public EeitAccion getAccion() {
        return accion;
    }

    public void setAccion(EeitAccion accion) {
        this.accion = accion;
    }
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lineabase")
    private List<EeitAccionLineabaseMeta> metas = new ArrayList<>();

    public List<EeitAccionLineabaseMeta> getMetas() {
        return metas;
    }

    public void setMetas(List<EeitAccionLineabaseMeta> metas) {
        this.metas = metas;
    }
    
    

    @Transient
    private EeitAccionLineabaseMeta metaDeleted;
    @Transient
    private EeitAccionLineabaseMeta metaAdded;

    public EeitAccionLineabaseMeta getMetaDeleted() {
        return metaDeleted;
    }
    
    private void orderIndexes(){
        if(!this.metas.isEmpty()){
            int i = 0;
            for(EeitAccionLineabaseMeta meta : this.metas){
                meta.setConsec(i++);
            }
        }
    }

    public void setMetaDeleted(EeitAccionLineabaseMeta metaDeleted) {
        this.metaDeleted = metaDeleted;
        this.metas.remove(this.metaDeleted);
        orderIndexes();
    }

    public EeitAccionLineabaseMeta getMetaAdded() {                
        return metaAdded;
    }

    public void setMetaAdded(EeitAccionLineabaseMeta metaAdded) {
        EeitAccionLineabaseMeta meta = new EeitAccionLineabaseMeta();
        meta.setConsec(this.metas.size()+ 1);
        this.metas.add(meta);
        this.metaAdded = meta;
    }
    
    //consecutive field related to user interface logic, see related classes
    @Transient
    private  int consec = 0;

    public int getConsec() {
        return consec;
    }

    public void setConsec(int consec) {
        this.consec = consec;
    }
    
    
}
                