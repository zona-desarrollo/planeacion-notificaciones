/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.security;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_subprocesos", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicSubprocesos.findAll", query = "SELECT e FROM EeicSubprocesos e")
    , @NamedQuery(name = "EeicSubprocesos.findByIdSubProceso", query = "SELECT e FROM EeicSubprocesos e WHERE e.idSubProceso = :idSubProceso")})
public class EeicSubprocesos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSubProceso")
    private Integer idSubProceso;
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
    @Size(max = 100)
    @Column(name = "UrlRelativa")
    private String urlRelativa;
    @Size(max = 45)
    @Column(name = "ClearCommand")
    private String clearCommand;
    
    
    
//    @ManyToMany(mappedBy = "eeicSubprocesosList")
    
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "idProceso", referencedColumnName = "idProceso")
//    private List<EeicProcesos> eeicProcesosList;

    public EeicSubprocesos() {
    }

    public EeicSubprocesos(Integer idSubProceso) {
        this.idSubProceso = idSubProceso;
    }

    public EeicSubprocesos(Integer idSubProceso, String descripcion, Date fechaInicio) {
        this.idSubProceso = idSubProceso;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdSubProceso() {
        return idSubProceso;
    }

    public void setIdSubProceso(Integer idSubProceso) {
        this.idSubProceso = idSubProceso;
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

    public String getUrlRelativa() {
        return urlRelativa;
    }

    public void setUrlRelativa(String urlRelativa) {
        this.urlRelativa = urlRelativa;
    }

    public String getClearCommand() {
        return clearCommand;
    }

    public void setClearCommand(String clearCommand) {
        this.clearCommand = clearCommand;
    }
//
//    public List<EeicProcesos> getEeicProcesosList() {
//        return eeicProcesosList;
//    }
//
//    public void setEeicProcesosList(List<EeicProcesos> eeicProcesosList) {
//        this.eeicProcesosList = eeicProcesosList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSubProceso != null ? idSubProceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicSubprocesos)) {
            return false;
        }
        EeicSubprocesos other = (EeicSubprocesos) object;
        if ((this.idSubProceso == null && other.idSubProceso != null) || (this.idSubProceso != null && !this.idSubProceso.equals(other.idSubProceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.security.EeicSubprocesos[ idSubProceso=" + idSubProceso + " ]";
    }
    
}
