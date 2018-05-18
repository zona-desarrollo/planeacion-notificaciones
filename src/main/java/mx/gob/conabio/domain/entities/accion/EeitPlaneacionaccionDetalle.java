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
@Table(name = "eeit_accion_planeacion_detalle", catalog = "conabio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EeitPlaneacionaccionDetalle.findAll", query = "SELECT e FROM EeitPlaneacionaccionDetalle e")
    , @NamedQuery(name = "EeitPlaneacionaccionDetalle.findByIdAccion", query = "SELECT e FROM EeitPlaneacionaccionDetalle e WHERE e.eeitPlaneacionaccionDetallePK.idAccion = :idAccion")
    , @NamedQuery(name = "EeitPlaneacionaccionDetalle.findByAnio", query = "SELECT e FROM EeitPlaneacionaccionDetalle e WHERE e.eeitPlaneacionaccionDetallePK.anio = :anio")})
public class EeitPlaneacionaccionDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeitPlaneacionaccionDetallePK eeitPlaneacionaccionDetallePK;
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

    public EeitPlaneacionaccionDetalle() {
    }

    public EeitPlaneacionaccionDetalle(EeitPlaneacionaccionDetallePK eeitPlaneacionaccionDetallePK) {
        this.eeitPlaneacionaccionDetallePK = eeitPlaneacionaccionDetallePK;
    }

    public EeitPlaneacionaccionDetalle(EeitPlaneacionaccionDetallePK eeitPlaneacionaccionDetallePK, int planeacion, String unidadDeMedida, String fuenteVerificacion) {
        this.eeitPlaneacionaccionDetallePK = eeitPlaneacionaccionDetallePK;
        this.planeacion = planeacion;
        this.unidadDeMedida = unidadDeMedida;
        this.fuenteVerificacion = fuenteVerificacion;
    }

    public EeitPlaneacionaccionDetalle(int idAccion, int anio) {
        this.eeitPlaneacionaccionDetallePK = new EeitPlaneacionaccionDetallePK(idAccion, anio);
    }

    public EeitPlaneacionaccionDetallePK getEeitPlaneacionaccionDetallePK() {
        return eeitPlaneacionaccionDetallePK;
    }

    public void setEeitPlaneacionaccionDetallePK(EeitPlaneacionaccionDetallePK eeitPlaneacionaccionDetallePK) {
        this.eeitPlaneacionaccionDetallePK = eeitPlaneacionaccionDetallePK;
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
        hash += (eeitPlaneacionaccionDetallePK != null ? eeitPlaneacionaccionDetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitPlaneacionaccionDetalle)) {
            return false;
        }
        EeitPlaneacionaccionDetalle other = (EeitPlaneacionaccionDetalle) object;
        if ((this.eeitPlaneacionaccionDetallePK == null && other.eeitPlaneacionaccionDetallePK != null) || (this.eeitPlaneacionaccionDetallePK != null && !this.eeitPlaneacionaccionDetallePK.equals(other.eeitPlaneacionaccionDetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.accion.seguimiento.EeitPlaneacionaccionDetalle[ eeitPlaneacionaccionDetallePK=" + eeitPlaneacionaccionDetallePK + " ]";
    }
    
}
