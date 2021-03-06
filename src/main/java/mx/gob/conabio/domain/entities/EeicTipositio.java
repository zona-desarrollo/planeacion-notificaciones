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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_tipositio", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicTipositio.findAll", query = "SELECT e FROM EeicTipositio e")
    , @NamedQuery(name = "EeicTipositio.findByIdTipoSitio", query = "SELECT e FROM EeicTipositio e WHERE e.idTipoSitio = :idTipoSitio")})
public class EeicTipositio implements Serializable {

    @OneToMany(mappedBy = "idTipoSitio")
    private List<EeitLocalizaciongeografica> eeitLocalizaciongeograficaList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTipoSitio")
    private Integer idTipoSitio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "FechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    public EeicTipositio() {
    }

    public EeicTipositio(Integer idTipoSitio) {
        this.idTipoSitio = idTipoSitio;
    }

    public EeicTipositio(Integer idTipoSitio, String descripcion, Date fechaInicio) {
        this.idTipoSitio = idTipoSitio;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdTipoSitio() {
        return idTipoSitio;
    }

    public void setIdTipoSitio(Integer idTipoSitio) {
        this.idTipoSitio = idTipoSitio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<EeitLocalizaciongeografica> getEeitLocalizaciongeograficaList() {
        return eeitLocalizaciongeograficaList;
    }

    public void setEeitLocalizaciongeograficaList(List<EeitLocalizaciongeografica> eeitLocalizaciongeograficaList) {
        this.eeitLocalizaciongeograficaList = eeitLocalizaciongeograficaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoSitio != null ? idTipoSitio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicTipositio)) {
            return false;
        }
        EeicTipositio other = (EeicTipositio) object;
        if ((this.idTipoSitio == null && other.idTipoSitio != null) || (this.idTipoSitio != null && !this.idTipoSitio.equals(other.idTipoSitio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeicTipositio[ idTipoSitio=" + idTipoSitio + " ]";
    }

}
