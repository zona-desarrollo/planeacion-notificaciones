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
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_procesos", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicProcesos.findAll", query = "SELECT e FROM EeicProcesos e")
    , @NamedQuery(name = "EeicProcesos.findByIdProceso", query = "SELECT e FROM EeicProcesos e WHERE e.idProceso = :idProceso")})
public class EeicProcesos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProceso")
    private Integer idProceso;
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
    
    
    @ManyToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "eeia_procesos_subprocesos", joinColumns = {
        @JoinColumn(unique = true ,
                    name = "idProceso", 
                    referencedColumnName = "idProceso")}, 
        inverseJoinColumns = {
        @JoinColumn(name = "idSubProceso", referencedColumnName = "idSubProceso")})      
    private Set<EeicSubprocesos> eeicSubprocesosList;

    public Set<EeicSubprocesos> getEeicSubprocesosList() {
        return eeicSubprocesosList;
    }

    public void setEeicSubprocesosList(Set<EeicSubprocesos> eeicSubprocesosList) {
        this.eeicSubprocesosList = eeicSubprocesosList;
    }

    public EeicProcesos() {
    }

    public EeicProcesos(Integer idProceso) {
        this.idProceso = idProceso;
    }

    public EeicProcesos(Integer idProceso, String descripcion, Date fechaInicio) {
        this.idProceso = idProceso;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(Integer idProceso) {
        this.idProceso = idProceso;
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
//    public List<EeicSubprocesos> getEeicSubprocesosList() {
//        return eeicSubprocesosList;
//    }
//
//    public void setEeicSubprocesosList(List<EeicSubprocesos> eeicSubprocesosList) {
//        this.eeicSubprocesosList = eeicSubprocesosList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProceso != null ? idProceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicProcesos)) {
            return false;
        }
        EeicProcesos other = (EeicProcesos) object;
        if ((this.idProceso == null && other.idProceso != null) || (this.idProceso != null && !this.idProceso.equals(other.idProceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.security.EeicProcesos[ idProceso=" + idProceso + " ]";
    }
    
}
