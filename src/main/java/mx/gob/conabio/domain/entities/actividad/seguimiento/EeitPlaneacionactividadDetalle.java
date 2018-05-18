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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_actividad_planeacion_detalle", catalog = "conabio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EeitPlaneacionactividadDetalle.findAll", query = "SELECT e FROM EeitPlaneacionactividadDetalle e")
    , @NamedQuery(name = "EeitPlaneacionactividadDetalle.findByIdActividad", query = "SELECT e FROM EeitPlaneacionactividadDetalle e WHERE e.eeitPlaneacionactividadDetallePK.idActividad = :idActividad")
    , @NamedQuery(name = "EeitPlaneacionactividadDetalle.findByAnio", query = "SELECT e FROM EeitPlaneacionactividadDetalle e WHERE e.eeitPlaneacionactividadDetallePK.anio = :anio")})
public class EeitPlaneacionactividadDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeitPlaneacionactividadDetallePK eeitPlaneacionactividadDetallePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Planeacion")
    private int planeacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "UnidadDeMedida")
    private String unidadDeMedida;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "FuenteVerificacion")
    private String fuenteVerificacion;

    public EeitPlaneacionactividadDetalle() {
    }

    public EeitPlaneacionactividadDetalle(EeitPlaneacionactividadDetallePK eeitPlaneacionactividadDetallePK) {
        this.eeitPlaneacionactividadDetallePK = eeitPlaneacionactividadDetallePK;
    }

    public EeitPlaneacionactividadDetalle(EeitPlaneacionactividadDetallePK eeitPlaneacionactividadDetallePK, int planeacion, String unidadDeMedida, String fuenteVerificacion) {
        this.eeitPlaneacionactividadDetallePK = eeitPlaneacionactividadDetallePK;
        this.planeacion = planeacion;
        this.unidadDeMedida = unidadDeMedida;
        this.fuenteVerificacion = fuenteVerificacion;
    }

    public EeitPlaneacionactividadDetalle(int idActividad, int anio) {
        this.eeitPlaneacionactividadDetallePK = new EeitPlaneacionactividadDetallePK(idActividad, anio);
    }

    public EeitPlaneacionactividadDetallePK getEeitPlaneacionactividadDetallePK() {
        return eeitPlaneacionactividadDetallePK;
    }

    public void setEeitPlaneacionactividadDetallePK(EeitPlaneacionactividadDetallePK eeitPlaneacionactividadDetallePK) {
        this.eeitPlaneacionactividadDetallePK = eeitPlaneacionactividadDetallePK;
    }

    public int getPlaneacion() {
        return planeacion;
    }

    public void setPlaneacion(int planeacion) {
        this.planeacion = planeacion;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public String getFuenteVerificacion() {
        return fuenteVerificacion;
    }

    public void setFuenteVerificacion(String fuenteVerificacion) {
        this.fuenteVerificacion = fuenteVerificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeitPlaneacionactividadDetallePK != null ? eeitPlaneacionactividadDetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitPlaneacionactividadDetalle)) {
            return false;
        }
        EeitPlaneacionactividadDetalle other = (EeitPlaneacionactividadDetalle) object;
        if ((this.eeitPlaneacionactividadDetallePK == null && other.eeitPlaneacionactividadDetallePK != null) || (this.eeitPlaneacionactividadDetallePK != null && !this.eeitPlaneacionactividadDetallePK.equals(other.eeitPlaneacionactividadDetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.seguimiento.EeitPlaneacionactividadDetalle[ eeitPlaneacionactividadDetallePK=" + eeitPlaneacionactividadDetallePK + " ]";
    }
    
}
