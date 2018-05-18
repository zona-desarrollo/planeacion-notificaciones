/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.accion;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "eeit_accion_material_soporte", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitAccionmatsoporte.findAll", query = "SELECT e FROM EeitAccionmatsoporte e")})
public class EeitAccionmatsoporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAccionMatSoporte")
    private Integer idAccionMatSoporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAccion")
    private int idAccion;
    @Column(name = "Anio")
    private Integer anio;
    @Column(name = "idMaterialSoporte")
    private Integer idMaterialSoporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "url")
    private String url;
    @Column(name = "Visible")
    private @Getter @Setter Boolean visible;
    
    @Column(name="NombreArchivo")
    @Size(min = 1, max = 100)
    @NotNull
    private String nombreArchivo;

    @Transient
    private @Getter @Setter long timestamp;
    
    @Column(name = "autorizado")
    private @Getter @Setter boolean autorizado;
    
    
    public EeitAccionmatsoporte() {
    }

    public EeitAccionmatsoporte(Integer idAccionMatSoporte) {
        this.idAccionMatSoporte = idAccionMatSoporte;
    }

    public EeitAccionmatsoporte(Integer idAccionMatSoporte, int idAccion, String url) {
        this.idAccionMatSoporte = idAccionMatSoporte;
        this.idAccion = idAccion;
        this.url = url;
    }

    public Integer getIdAccionMatSoporte() {
        return idAccionMatSoporte;
    }

    public void setIdAccionMatSoporte(Integer idAccionMatSoporte) {
        this.idAccionMatSoporte = idAccionMatSoporte;
    }

    public int getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(int idAccion) {
        this.idAccion = idAccion;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getIdMaterialSoporte() {
        return idMaterialSoporte;
    }

    public void setIdMaterialSoporte(Integer idMaterialSoporte) {
        this.idMaterialSoporte = idMaterialSoporte;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccionMatSoporte != null ? idAccionMatSoporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof EeitAccionmatsoporte)) {
            return false;
        }
        EeitAccionmatsoporte other = (EeitAccionmatsoporte) object;
        if(this.url != null && other.getUrl() != null){
            return this.url.equals(other.getUrl());
        }
        return false;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.seguimiento.EeitAccionmatsoporte[ idAccionMatSoporte=" + idAccionMatSoporte + " ]";
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    
}
