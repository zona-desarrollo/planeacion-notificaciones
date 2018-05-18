/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.divulgacion;

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
@Table(name = "eeit_divulgacion_material_soporte", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitDivulgacionmatsoporte.findAll", query = "SELECT e FROM EeitDivulgacionmatsoporte e")
    , @NamedQuery(name = "EeitDivulgacionmatsoporte.findByIdDivulgacionMatSoporte", query = "SELECT e FROM EeitDivulgacionmatsoporte e WHERE e.idDivulgacionMatSoporte = :idDivulgacionMatSoporte")})
public class EeitDivulgacionmatsoporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDivulgacionMatSoporte")
    private Integer idDivulgacionMatSoporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idMaterialSoporte")
    private int idMaterialSoporte;
    @Size(max = 400)
    @Column(name = "url")
    private String url;
    @Column(name = "Visible")
    private Boolean visible;
    @Column(name = "idAccionDivulgacion")
    private int idAccionDivulgacion = 0;
    
    @Column(name = "autorizado")
    private @Getter @Setter boolean autorizado;
    
    @Column(name="nombreArchivo")
    @Size(min = 1, max = 100)
    @NotNull
    private String nombreArchivo;
    
    @Transient
    private @Getter @Setter long timestamp;

    public EeitDivulgacionmatsoporte() {
    }

    public EeitDivulgacionmatsoporte(Integer idDivulgacionMatSoporte) {
        this.idDivulgacionMatSoporte = idDivulgacionMatSoporte;
    }

    public EeitDivulgacionmatsoporte(Integer idDivulgacionMatSoporte, int idMaterialSoporte) {
        this.idDivulgacionMatSoporte = idDivulgacionMatSoporte;
        this.idMaterialSoporte = idMaterialSoporte;
    }

    public Integer getIdDivulgacionMatSoporte() {
        return idDivulgacionMatSoporte;
    }

    public void setIdDivulgacionMatSoporte(Integer idDivulgacionMatSoporte) {
        this.idDivulgacionMatSoporte = idDivulgacionMatSoporte;
    }

    public int getIdMaterialSoporte() {
        return idMaterialSoporte;
    }

    public void setIdMaterialSoporte(int idMaterialSoporte) {
        this.idMaterialSoporte = idMaterialSoporte;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDivulgacionMatSoporte != null ? idDivulgacionMatSoporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitDivulgacionmatsoporte)) {
            return false;
        }
        EeitDivulgacionmatsoporte other = (EeitDivulgacionmatsoporte) object;
        if ((this.idDivulgacionMatSoporte == null && other.idDivulgacionMatSoporte != null) || (this.idDivulgacionMatSoporte != null && !this.idDivulgacionMatSoporte.equals(other.idDivulgacionMatSoporte))) {
            return false;
        }
        return true;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.divulgacion.EeitDivulgacionmatsoporte[ idDivulgacionMatSoporte=" + idDivulgacionMatSoporte + " ]";
    }

    public int getIdAccionDivulgacion() {
        return idAccionDivulgacion;
    }

    public void setIdAccionDivulgacion(int idAccionDivulgacion) {
        this.idAccionDivulgacion = idAccionDivulgacion;
    }
    
}
