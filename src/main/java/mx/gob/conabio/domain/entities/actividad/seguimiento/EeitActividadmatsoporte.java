/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.actividad.seguimiento;

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

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_actividad_material_soporte", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitActividadmatsoporte.findAll", query = "SELECT e FROM EeitActividadmatsoporte e")})
public class EeitActividadmatsoporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idActividadMatSoporte")
    private Integer idActividadMatSoporte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idActividad")
    private int idActividad;
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
    private Integer visible;
    
    @Column(name="NombreArchivo")
    @Size(min = 1, max = 100)
    @NotNull
    private String nombreArchivo;

    public EeitActividadmatsoporte() {
    }

    public EeitActividadmatsoporte(Integer idActividadMatSoporte) {
        this.idActividadMatSoporte = idActividadMatSoporte;
    }

    public EeitActividadmatsoporte(Integer idActividadMatSoporte, int idActividad, String url) {
        this.idActividadMatSoporte = idActividadMatSoporte;
        this.idActividad = idActividad;
        this.url = url;
    }

    public Integer getIdActividadMatSoporte() {
        return idActividadMatSoporte;
    }

    public void setIdActividadMatSoporte(Integer idActividadMatSoporte) {
        this.idActividadMatSoporte = idActividadMatSoporte;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
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

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividadMatSoporte != null ? idActividadMatSoporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof EeitActividadmatsoporte)) {
            return false;
        }
        EeitActividadmatsoporte other = (EeitActividadmatsoporte) object;
        if(this.url != null && other.getUrl() != null){
            return this.url.equals(other.getUrl());
        }
        return false;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.seguimiento.EeitActividadmatsoporte[ idActividadMatSoporte=" + idActividadMatSoporte + " ]";
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    
}
