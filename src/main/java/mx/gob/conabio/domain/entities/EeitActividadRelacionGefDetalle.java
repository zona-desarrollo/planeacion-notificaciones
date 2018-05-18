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
@Table(name = "eeit_actividad_relacion_gef_detalle", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitActividadRelacionGefDetalle.findAll", query = "SELECT e FROM EeitActividadRelacionGefDetalle e")
    , @NamedQuery(name = "EeitActividadRelacionGefDetalle.findByIdDetalle", query = "SELECT e FROM EeitActividadRelacionGefDetalle e WHERE e.idDetalle = :idDetalle")
    , @NamedQuery(name = "EeitActividadRelacionGefDetalle.findByIdIndicadorProducto", query = "SELECT e FROM EeitActividadRelacionGefDetalle e WHERE e.idIndicadorProducto = :idIndicadorProducto")})
public class EeitActividadRelacionGefDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetalle")
    private Integer idDetalle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idIndicadorProducto")
    private int idIndicadorProducto;
    @Column(name = "porcentaje")
    private Integer porcentaje;
    @Size(max = 10)
    @Column(name = "mes")
    private String mes;
    @Size(max = 10)
    @Column(name = "anio")
    private String anio;
    @JoinColumn(name = "idActividadRelacionGef", referencedColumnName = "idActividadRelacion")
    @ManyToOne(optional = false)
    private EeitActividadRelacionGef idActividadRelacionGef;

    @Transient
    private String tooltipDetalle = null;
    @Transient
    private String descripcionCorta = null;
    
    
    public EeitActividadRelacionGefDetalle() {
    }

    public EeitActividadRelacionGefDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public EeitActividadRelacionGefDetalle(Integer idDetalle, int idIndicadorProducto) {
        this.idDetalle = idDetalle;
        this.idIndicadorProducto = idIndicadorProducto;
    }

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdIndicadorProducto() {
        return idIndicadorProducto;
    }

    public void setIdIndicadorProducto(int idIndicadorProducto) {
        this.idIndicadorProducto = idIndicadorProducto;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public EeitActividadRelacionGef getIdActividadRelacionGef() {
        return idActividadRelacionGef;
    }

    public void setIdActividadRelacionGef(EeitActividadRelacionGef idActividadRelacionGef) {
        this.idActividadRelacionGef = idActividadRelacionGef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalle != null ? idDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitActividadRelacionGefDetalle)) {
            return false;
        }
        EeitActividadRelacionGefDetalle other = (EeitActividadRelacionGefDetalle) object;
        if ((this.idDetalle == null && other.idDetalle != null) || (this.idDetalle != null && !this.idDetalle.equals(other.idDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.config.EeitActividadRelacionGefDetalle[ idDetalle=" + idDetalle + " ]";
    }

    public String getTooltipDetalle() {
        return tooltipDetalle;
    }

    public void setTooltipDetalle(String tooltipDetalle) {
        this.tooltipDetalle = tooltipDetalle;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    
    
}
