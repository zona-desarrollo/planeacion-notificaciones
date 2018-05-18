/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_accion", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicAccion.findAll", query = "SELECT e FROM EeicAccion e")
    , @NamedQuery(name = "EeicAccion.findByEeicIdAccion", query = "SELECT e FROM EeicAccion e WHERE e.eeicIdAccion = :eeicIdAccion")})
public class EeicAccion implements Serializable {

    @JoinTable(name = "eeia_actividad_accion", joinColumns = {
        @JoinColumn(name = "idObjetivoMetaAccion", referencedColumnName = "eeic_id_accion")}, inverseJoinColumns = {
        @JoinColumn(name = "idActividad", referencedColumnName = "idActividad")})
    @ManyToMany
    private List<EeitActividades> eeitActividadesList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "eeic_id_accion")
    private Integer eeicIdAccion;
    @Size(max = 400)
    @Column(name = "eeic_descripcion")
    private String eeicDescripcion;
    @Column(name = "eeic_fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date eeicfechaInicio;
    @Column(name = "eeic_fechaFin")
    @Temporal(TemporalType.DATE)
    private Date eeicfechaFin;
    @JoinColumn(name = "eeic_id_meta", referencedColumnName = "idMeta")
    @ManyToOne
    private EeicMetas eeicIdMeta;
    @JoinColumn(name = "eeic_id_objetivo", referencedColumnName = "idObjetivo")
    @ManyToOne
    private EeicObjetivos eeicIdObjetivo;

    public EeicAccion() {
    }

    public EeicAccion(Integer eeicIdAccion) {
        this.eeicIdAccion = eeicIdAccion;
    }

    public Integer getEeicIdAccion() {
        return eeicIdAccion;
    }

    public void setEeicIdAccion(Integer eeicIdAccion) {
        this.eeicIdAccion = eeicIdAccion;
    }

    public String getEeicDescripcion() {
        return eeicDescripcion;
    }

    public void setEeicDescripcion(String eeicDescripcion) {
        this.eeicDescripcion = eeicDescripcion;
    }

    public Date getEeicfechaInicio() {
        return eeicfechaInicio;
    }

    public void setEeicfechaInicio(Date eeicfechaInicio) {
        this.eeicfechaInicio = eeicfechaInicio;
    }

    public Date getEeicfechaFin() {
        return eeicfechaFin;
    }

    public void setEeicfechaFin(Date eeicfechaFin) {
        this.eeicfechaFin = eeicfechaFin;
    }

    public EeicMetas getEeicIdMeta() {
        return eeicIdMeta;
    }

    public void setEeicIdMeta(EeicMetas eeicIdMeta) {
        this.eeicIdMeta = eeicIdMeta;
    }

    public EeicObjetivos getEeicIdObjetivo() {
        return eeicIdObjetivo;
    }

    public void setEeicIdObjetivo(EeicObjetivos eeicIdObjetivo) {
        this.eeicIdObjetivo = eeicIdObjetivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeicIdAccion != null ? eeicIdAccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicAccion)) {
            return false;
        }
        EeicAccion other = (EeicAccion) object;
        if ((this.eeicIdAccion == null && other.eeicIdAccion != null) || (this.eeicIdAccion != null && !this.eeicIdAccion.equals(other.eeicIdAccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain2.EeicAccion[ eeicIdAccion=" + eeicIdAccion + " ]";
    }

    public List<EeitActividades> getEeitActividadesList() {
        return eeitActividadesList;
    }

    public void setEeitActividadesList(List<EeitActividades> eeitActividadesList) {
        this.eeitActividadesList = eeitActividadesList;
    }
    
}
