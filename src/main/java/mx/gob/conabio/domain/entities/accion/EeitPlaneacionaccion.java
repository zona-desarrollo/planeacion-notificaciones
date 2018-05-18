/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.accion;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import mx.gob.conabio.domain.entities.actividad.seguimiento.EeicEstatusactividad;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_accion_planeacion", catalog = "conabio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EeitPlaneacionaccion.findAll", query = "SELECT e FROM EeitPlaneacionaccion e")
    , @NamedQuery(name = "EeitPlaneacionaccion.findByIdAccion", query = "SELECT e FROM EeitPlaneacionaccion e WHERE e.eeitPlaneacionaccionPK.idAccion = :idAccion")
    , @NamedQuery(name = "EeitPlaneacionaccion.findByAnio", query = "SELECT e FROM EeitPlaneacionaccion e WHERE e.eeitPlaneacionaccionPK.anio = :anio")})
public class EeitPlaneacionaccion implements Serializable {

   

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeitPlaneacionaccionPK eeitPlaneacionaccionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "Meta")
    private String meta;
    @Size(max = 400)
    @Column(name = "URLReferencia")
    private String uRLReferencia;
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @JoinColumn(name = "idEstatusActividad", referencedColumnName = "idEstatusActividad")
    @ManyToOne(optional = false)
    private EeicEstatusactividad idEstatusactividad;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaUltAct")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltAct;

    public EeitPlaneacionaccion() {
    }

    public EeitPlaneacionaccion(EeitPlaneacionaccionPK eeitPlaneacionaccionPK) {
        this.eeitPlaneacionaccionPK = eeitPlaneacionaccionPK;
    }

    public EeitPlaneacionaccion(EeitPlaneacionaccionPK eeitPlaneacionaccionPK, String meta, Date fechaRegistro) {
        this.eeitPlaneacionaccionPK = eeitPlaneacionaccionPK;
        this.meta = meta;
        this.fechaRegistro = fechaRegistro;
    }

    public EeitPlaneacionaccion(int idAccion, int anio) {
        this.eeitPlaneacionaccionPK = new EeitPlaneacionaccionPK(idAccion, anio);
    }

    public EeitPlaneacionaccionPK getEeitPlaneacionaccionPK() {
        return eeitPlaneacionaccionPK;
    }

    public void setEeitPlaneacionaccionPK(EeitPlaneacionaccionPK eeitPlaneacionaccionPK) {
        this.eeitPlaneacionaccionPK = eeitPlaneacionaccionPK;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getURLReferencia() {
        return uRLReferencia;
    }

    public void setURLReferencia(String uRLReferencia) {
        this.uRLReferencia = uRLReferencia;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public EeicEstatusactividad getIdEstatusactividad() {
        return idEstatusactividad;
    }

    public void setIdEstatusactividad(EeicEstatusactividad idEstatusactividad) {
        this.idEstatusactividad = idEstatusactividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeitPlaneacionaccionPK != null ? eeitPlaneacionaccionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitPlaneacionaccion)) {
            return false;
        }
        EeitPlaneacionaccion other = (EeitPlaneacionaccion) object;
        if ((this.eeitPlaneacionaccionPK == null && other.eeitPlaneacionaccionPK != null) || (this.eeitPlaneacionaccionPK != null && !this.eeitPlaneacionaccionPK.equals(other.eeitPlaneacionaccionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.accion.seguimiento.EeitPlaneacionaccion[ eeitPlaneacionaccionPK=" + eeitPlaneacionaccionPK + " ]";
    }

    public String getuRLReferencia() {
        return uRLReferencia;
    }

    public void setuRLReferencia(String uRLReferencia) {
        this.uRLReferencia = uRLReferencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaUltAct() {
        return fechaUltAct;
    }

    public void setFechaUltAct(Date fechaUltAct) {
        this.fechaUltAct = fechaUltAct;
    }
    
    
}
