/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_actividad_otrasespecies", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitActividadOtrasespecies.findAll", query = "SELECT e FROM EeitActividadOtrasespecies e WHERE e.autorizado = false")
    , @NamedQuery(name = "EeitActividadOtrasespecies.findByIdOtraEspecie", query = "SELECT e FROM EeitActividadOtrasespecies e WHERE e.idOtraEspecie = :idOtraEspecie")})
public class EeitActividadOtrasespecies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idOtraEspecie")
    private Integer idOtraEspecie;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "idActividad")
    private int idActividad;
    
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "genero")
    private String genero;
    
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "especie")
    private String especie;
    
    @Size(max = 80)
    @Column(name = "infraespecie")
    private String infraespecie;
    
    @Size(min = 1, max = 80)
    @Column(name = "motivoInclusion")
    private String motivoInclusion;
    
    @Column(name = "autorizado")
    private boolean autorizado;
    
    @ManyToOne    
    @JoinColumn (name = "idActividad",insertable = false, updatable = false)
    private @Getter @Setter EeitActividades actividad;
    
    
    @Transient
    private boolean renderPlusSign = false;
    @Transient
    private boolean renderMinusdSign = false;
    
    public EeitActividadOtrasespecies() {
    }

    public EeitActividadOtrasespecies(Integer idOtraEspecie) {
        this.idOtraEspecie = idOtraEspecie;
    }

    public EeitActividadOtrasespecies(Integer idOtraEspecie, int idActividad, String genero, String especie, String motivoInclusion, boolean autorizado) {
        this.idOtraEspecie = idOtraEspecie;
        this.idActividad = idActividad;
        this.genero = genero;
        this.especie = especie;
        this.motivoInclusion = motivoInclusion;
        this.autorizado = autorizado;
    }

    public Integer getIdOtraEspecie() {
        return idOtraEspecie;
    }

    public void setIdOtraEspecie(Integer idOtraEspecie) {
        this.idOtraEspecie = idOtraEspecie;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getInfraespecie() {
        return infraespecie;
    }

    public void setInfraespecie(String infraespecie) {
        this.infraespecie = infraespecie;
    }

    public String getMotivoInclusion() {
        return motivoInclusion;
    }

    public void setMotivoInclusion(String motivoInclusion) {
        this.motivoInclusion = motivoInclusion;
    }

    public boolean getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOtraEspecie != null ? idOtraEspecie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitActividadOtrasespecies)) {
            return false;
        }
        
        EeitActividadOtrasespecies other = (EeitActividadOtrasespecies) object;
        
        if(this.idOtraEspecie == null && other.idOtraEspecie == null){
            
            boolean a = this.genero == null && other.getGenero() == null;
            boolean b = this.especie == null && other.getEspecie() == null;
            boolean c = this.infraespecie == null && other.getInfraespecie() == null;
            
            if(a && b && c)
                return true;
            
            if(this.genero.equals(other.getGenero()) && this.especie.equals(other.getEspecie()) && 
                    this.infraespecie.equals(other.infraespecie)){
                return true;
            }
            else{
                return false;
            }
        }
        if ((this.idOtraEspecie == null && other.idOtraEspecie != null) || (this.idOtraEspecie != null && !this.idOtraEspecie.equals(other.idOtraEspecie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeitActividadOtrasespecies[ idOtraEspecie=" + idOtraEspecie + " ]";
    }

    public boolean isRenderPlusSign() {
        return renderPlusSign;
    }

    public void setRenderPlusSign(boolean renderPlusSign) {
        this.renderPlusSign = renderPlusSign;
    }

    public boolean isRenderMinusdSign() {
        return renderMinusdSign;
    }

    public void setRenderMinusdSign(boolean renderMinusdSign) {
        this.renderMinusdSign = renderMinusdSign;
    }
    
    public boolean isValid(){
        if(this.genero == null || this.genero.isEmpty()){
            return false;
        }
        if(this.especie == null || this.especie.isEmpty()){
            return false;
        }
        return true;
    }
    
}
