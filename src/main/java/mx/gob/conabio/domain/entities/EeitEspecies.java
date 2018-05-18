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

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_actividad_especies", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitEspecies.findAll", query = "SELECT e FROM EeitEspecies e")
    , @NamedQuery(name = "EeitEspecies.findByIdEspecie", query = "SELECT e FROM EeitEspecies e WHERE e.idEspecie = :idEspecie")
    , @NamedQuery(name = "EeitEspecies.findByIdAccion", query = "SELECT e FROM EeitEspecies e WHERE e.idAccion = :idAccion")
    , @NamedQuery(name = "EeitEspecies.findByNombreCientifico", query = "SELECT e FROM EeitEspecies e WHERE e.nombreCientifico = :nombreCientifico")
    , @NamedQuery(name = "EeitEspecies.findByNombreComun", query = "SELECT e FROM EeitEspecies e WHERE e.nombreComun = :nombreComun")})
public class EeitEspecies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEspecie")
    private Integer idEspecie;
    @Column(name = "idAccion")
    private Integer idAccion;
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
    @JoinColumn(name = "idActividad", referencedColumnName = "idActividad")
    @ManyToOne(optional = false)
    private EeitActividades idActividad;

    @Transient
    private boolean renderPlusSign = false;
    @Transient
    private boolean renderMinusSign = false;
    @Transient
    private EeicNombrescientificos nombreCientificoObj = new EeicNombrescientificos();

    @Transient
    private boolean disable = false;

    public EeitEspecies() {
    }

    public EeitEspecies(Integer idEspecie) {
        this.idEspecie = idEspecie;
    }

    public EeitEspecies(Integer idEspecie, String nombreCientifico, String nombreComun) {
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

    public Integer getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(Integer idAccion) {
        this.idAccion = idAccion;
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

    public EeitActividades getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(EeitActividades idActividad) {
        this.idActividad = idActividad;
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
        if (!(object instanceof EeitEspecies)) {
            return false;
        }
        EeitEspecies other = (EeitEspecies) object;
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
