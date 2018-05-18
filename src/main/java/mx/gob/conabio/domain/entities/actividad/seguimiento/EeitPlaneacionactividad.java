/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.actividad.seguimiento;

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

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_actividad_planeacion", catalog = "conabio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EeitPlaneacionactividad.findAll", query = "SELECT e FROM EeitPlaneacionactividad e")
    , @NamedQuery(name = "EeitPlaneacionactividad.findByIdActividad", query = "SELECT e FROM EeitPlaneacionactividad e WHERE e.eeitPlaneacionactividadPK.idActividad = :idActividad")
    , @NamedQuery(name = "EeitPlaneacionactividad.findByAnio", query = "SELECT e FROM EeitPlaneacionactividad e WHERE e.eeitPlaneacionactividadPK.anio = :anio")})
public class EeitPlaneacionactividad implements Serializable {

   

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeitPlaneacionactividadPK eeitPlaneacionactividadPK;
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
    private EeicEstatusactividad idEstatusActividad;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaUltAct")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltAct;

    public EeitPlaneacionactividad() {
    }

    public EeitPlaneacionactividad(EeitPlaneacionactividadPK eeitPlaneacionactividadPK) {
        this.eeitPlaneacionactividadPK = eeitPlaneacionactividadPK;
    }

    public EeitPlaneacionactividad(EeitPlaneacionactividadPK eeitPlaneacionactividadPK, String meta, Date fechaRegistro) {
        this.eeitPlaneacionactividadPK = eeitPlaneacionactividadPK;
        this.meta = meta;
        this.fechaRegistro = fechaRegistro;
    }

    public EeitPlaneacionactividad(int idActividad, int anio) {
        this.eeitPlaneacionactividadPK = new EeitPlaneacionactividadPK(idActividad, anio);
    }

    public EeitPlaneacionactividadPK getEeitPlaneacionactividadPK() {
        return eeitPlaneacionactividadPK;
    }

    public void setEeitPlaneacionactividadPK(EeitPlaneacionactividadPK eeitPlaneacionactividadPK) {
        this.eeitPlaneacionactividadPK = eeitPlaneacionactividadPK;
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

    public EeicEstatusactividad getIdEstatusActividad() {
        return idEstatusActividad;
    }

    public void setIdEstatusActividad(EeicEstatusactividad idEstatusActividad) {
        this.idEstatusActividad = idEstatusActividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeitPlaneacionactividadPK != null ? eeitPlaneacionactividadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitPlaneacionactividad)) {
            return false;
        }
        EeitPlaneacionactividad other = (EeitPlaneacionactividad) object;
        if ((this.eeitPlaneacionactividadPK == null && other.eeitPlaneacionactividadPK != null) || (this.eeitPlaneacionactividadPK != null && !this.eeitPlaneacionactividadPK.equals(other.eeitPlaneacionactividadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.actividad.seguimiento.EeitPlaneacionactividad[ eeitPlaneacionactividadPK=" + eeitPlaneacionactividadPK + " ]";
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
