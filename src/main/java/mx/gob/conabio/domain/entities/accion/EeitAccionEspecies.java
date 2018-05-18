/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.accion;

import mx.gob.conabio.domain.entities.*;
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

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_accion_especies", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitAccionEspecies.findAll", query = "SELECT e FROM EeitAccionEspecies e")
    , @NamedQuery(name = "EeitAccionEspecies.findByIdEspecie", query = "SELECT e FROM EeitAccionEspecies e WHERE e.idEspecie = :idEspecie")
    , @NamedQuery(name = "EeitAccionEspecies.findByIdAccion", query = "SELECT e FROM EeitAccionEspecies e WHERE e.accion.idAccion = :idAccion")
    , @NamedQuery(name = "EeitAccionEspecies.findByNombreCientifico", query = "SELECT e FROM EeitAccionEspecies e WHERE e.nombreCientifico = :nombreCientifico")
    , @NamedQuery(name = "EeitAccionEspecies.findByNombreComun", query = "SELECT e FROM EeitAccionEspecies e WHERE e.nombreComun = :nombreComun")})
public class EeitAccionEspecies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEspecie")
    private Integer idEspecie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "nombreCientifico")
    private String nombreCientifico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "nombreComun")
    private String nombreComun;
    @JoinColumn(name = "idAccion", referencedColumnName = "idAccion")
    @ManyToOne(optional = false)
    private EeitAccion accion;

    @Transient
    private boolean renderPlusSign = false;
    @Transient
    private boolean renderMinusSign = false;
    @Transient
    private EeicNombrescientificos nombreCientificoObj = new EeicNombrescientificos();

    @Transient
    private boolean disable = false;

    public EeitAccionEspecies() {
    }

    public EeitAccionEspecies(Integer idEspecie) {
        this.idEspecie = idEspecie;
    }

    public EeitAccionEspecies(Integer idEspecie, String nombreCientifico, String nombreComun) {
        this.idEspecie = idEspecie;
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
    }

    public Integer getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(Integer idEspecie) {
        this.idEspecie = idEspecie;
    }


    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public EeitAccion getAccion() {
        return accion;
    }

    public void setAccion(EeitAccion accion) {
        this.accion = accion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEspecie != null ? idEspecie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitAccionEspecies)) {
            return false;
        }
        EeitAccionEspecies other = (EeitAccionEspecies) object;
        if(this.idEspecie == null && other.idEspecie == null){
            if(this.nombreCientifico.equals(other.getNombreCientifico())){
             return true;   
            }
            else{
                return false;
            }                
        }
        if ((this.idEspecie == null && other.idEspecie != null) || (this.idEspecie != null && !this.idEspecie.equals(other.idEspecie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeitEspecies[ idEspecie=" + idEspecie + " ]";
    }

    public boolean isRenderPlusSign() {
        return renderPlusSign;
    }

    public void setRenderPlusSign(boolean renderPlusSign) {
        this.renderPlusSign = renderPlusSign;
    }

    public boolean isRenderMinusSign() {
        return renderMinusSign;
    }

    public void setRenderMinusSign(boolean renderMinusSign) {
        this.renderMinusSign = renderMinusSign;
    }

    public EeicNombrescientificos getNombreCientificoObj() {
        return nombreCientificoObj;
    }

    public void setNombreCientificoObj(EeicNombrescientificos nombreCientificoObj) {
        
        if (this.nombreCientificoObj != null && nombreCientificoObj != null) {
            this.nombreCientificoObj = nombreCientificoObj;
            this.nombreComun = nombreCientificoObj.getEspecie();
            this.nombreCientifico = nombreCientificoObj.getGenero();
        }

    }

    public boolean isValid(){
        if(this.nombreComun == null || this.nombreComun.isEmpty()){
            return false;
        }
        return true;
    }

    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }
    
}
