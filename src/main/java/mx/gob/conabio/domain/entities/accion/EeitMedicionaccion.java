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
@Table(name = "eeit_accion_medicion", catalog = "conabio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EeitMedicionaccion.findAll", query = "SELECT e FROM EeitMedicionaccion e")
    , @NamedQuery(name = "EeitMedicionaccion.findByIdAccion", query = "SELECT e FROM EeitMedicionaccion e WHERE e.eeitMedicionaccionPK.idAccion = :idAccion")
    , @NamedQuery(name = "EeitMedicionaccion.findByAnio", query = "SELECT e FROM EeitMedicionaccion e WHERE e.eeitMedicionaccionPK.anio = :anio")})
public class EeitMedicionaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeitMedicionaccionPK eeitMedicionaccionPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Avance")
    private int avance;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "UnidadDeMedida")
    private String unidadDeMedida;
    @Size(max = 300)
    @Column(name = "TipoRezago")
    private String tipoRezago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    public EeitMedicionaccion() {
    }

    public EeitMedicionaccion(EeitMedicionaccionPK eeitMedicionaccionPK) {
        this.eeitMedicionaccionPK = eeitMedicionaccionPK;
    }

    public EeitMedicionaccion(EeitMedicionaccionPK eeitMedicionaccionPK, int avance, String unidadDeMedida, Date fechaRegistro) {
        this.eeitMedicionaccionPK = eeitMedicionaccionPK;
        this.avance = avance;
        this.unidadDeMedida = unidadDeMedida;
        this.fechaRegistro = fechaRegistro;
    }

    public EeitMedicionaccion(int idAccion, int anio, int trimestre) {
        this.eeitMedicionaccionPK = new EeitMedicionaccionPK(idAccion, anio, trimestre);
    }

    public EeitMedicionaccionPK getEeitMedicionaccionPK() {
        return eeitMedicionaccionPK;
    }

    public void setEeitMedicionaccionPK(EeitMedicionaccionPK eeitMedicionaccionPK) {
        this.eeitMedicionaccionPK = eeitMedicionaccionPK;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public String getTipoRezago() {
        return tipoRezago;
    }

    public void setTipoRezago(String tipoRezago) {
        this.tipoRezago = tipoRezago;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeitMedicionaccionPK != null ? eeitMedicionaccionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitMedicionaccion)) {
            return false;
        }
        EeitMedicionaccion other = (EeitMedicionaccion) object;
        if ((this.eeitMedicionaccionPK == null && other.eeitMedicionaccionPK != null) || (this.eeitMedicionaccionPK != null && !this.eeitMedicionaccionPK.equals(other.eeitMedicionaccionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.entities.domain.accion.planeacion.EeitMedicionaccion[ eeitMedicionaccionPK=" + eeitMedicionaccionPK + " ]";
    }
    
}
