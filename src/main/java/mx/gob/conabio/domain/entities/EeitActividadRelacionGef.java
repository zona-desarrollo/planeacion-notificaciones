/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_actividad_relacion_gef", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitActividadRelacionGef.findAll", query = "SELECT e FROM EeitActividadRelacionGef e")})
public class EeitActividadRelacionGef implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idActividadRelacion")
    private Integer idActividadRelacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idActividad")
    private int idActividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idComponenteGef")
    private int idComponenteGef;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idIndicadorGef")
    private int idIndicadorGef;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idProductoGef")
    private int idProductoGef;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idIndicadorProductoGef")
    private int idIndicadorProductoGef;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idActividadRelacionGef")
    private int idActividadRelacionGef;
    @Column(name = "idOtroIndicador")
    private Integer idOtroIndicador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idActividadRelacionGef")
    private List<EeitActividadRelacionGefDetalle> eeitActividadRelacionGefDetalleList;

    public EeitActividadRelacionGef() {
    }

    public EeitActividadRelacionGef(Integer idActividadRelacion) {
        this.idActividadRelacion = idActividadRelacion;
    }

    public EeitActividadRelacionGef(Integer idActividadRelacion, int idActividad, int idComponenteGef, int idIndicadorGef, int idProductoGef, int idIndicadorProductoGef, int idActividadRelacionGef) {
        this.idActividadRelacion = idActividadRelacion;
        this.idActividad = idActividad;
        this.idComponenteGef = idComponenteGef;
        this.idIndicadorGef = idIndicadorGef;
        this.idProductoGef = idProductoGef;
        this.idIndicadorProductoGef = idIndicadorProductoGef;
        this.idActividadRelacionGef = idActividadRelacionGef;
    }

    public Integer getIdActividadRelacion() {
        return idActividadRelacion;
    }

    public void setIdActividadRelacion(Integer idActividadRelacion) {
        this.idActividadRelacion = idActividadRelacion;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public int getIdComponenteGef() {
        return idComponenteGef;
    }

    public void setIdComponenteGef(int idComponenteGef) {
        this.idComponenteGef = idComponenteGef;
    }

    public int getIdIndicadorGef() {
        return idIndicadorGef;
    }

    public void setIdIndicadorGef(int idIndicadorGef) {
        this.idIndicadorGef = idIndicadorGef;
    }

    public int getIdProductoGef() {
        return idProductoGef;
    }

    public void setIdProductoGef(int idProductoGef) {
        this.idProductoGef = idProductoGef;
    }

    public int getIdIndicadorProductoGef() {
        return idIndicadorProductoGef;
    }

    public void setIdIndicadorProductoGef(int idIndicadorProductoGef) {
        this.idIndicadorProductoGef = idIndicadorProductoGef;
    }

    public int getIdActividadRelacionGef() {
        return idActividadRelacionGef;
    }

    public void setIdActividadRelacionGef(int idActividadRelacionGef) {
        this.idActividadRelacionGef = idActividadRelacionGef;
    }

    public Integer getIdOtroIndicador() {
        return idOtroIndicador;
    }

    public void setIdOtroIndicador(Integer idOtroIndicador) {
        this.idOtroIndicador = idOtroIndicador;
    }

    public List<EeitActividadRelacionGefDetalle> getEeitActividadRelacionGefDetalleList() {
        return eeitActividadRelacionGefDetalleList;
    }

    public void setEeitActividadRelacionGefDetalleList(List<EeitActividadRelacionGefDetalle> eeitActividadRelacionGefDetalleList) {
        this.eeitActividadRelacionGefDetalleList = eeitActividadRelacionGefDetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividadRelacion != null ? idActividadRelacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitActividadRelacionGef)) {
            return false;
        }
        EeitActividadRelacionGef other = (EeitActividadRelacionGef) object;
        if ((this.idActividadRelacion == null && other.idActividadRelacion != null) || (this.idActividadRelacion != null && !this.idActividadRelacion.equals(other.idActividadRelacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.config.EeitActividadRelacionGef[ idActividadRelacion=" + idActividadRelacion + " ]";
    }
    
}
