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
import javax.persistence.OneToOne;
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
@Table(name = "eeic_roles", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicRoles.findAll", query = "SELECT e FROM EeicRoles e")
    , @NamedQuery(name = "EeicRoles.findByIdRol", query = "SELECT e FROM EeicRoles e WHERE e.idRol = :idRol")})
public class EeicRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRol")
    private Integer idRol;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Descripcion")
    private String descripcion;
    
    
    @Size(min = 1, max = 100)
    @Column(name = "DescripcionLbl")
    private String descripcionLbl;
    
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.DATE)
    
    private Date fechaInicio;
    @Column(name = "FechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    
    
    
    @ManyToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        @JoinTable(name = "eeia_roles_procesos", joinColumns = {
        @JoinColumn(unique=true,
                    name = "idRol", 
                    referencedColumnName = "idRol")},
        inverseJoinColumns = {@JoinColumn(name = "idProceso", referencedColumnName = "idProceso")})
    private Set<EeicProcesos> eeicProcesosList;
    
    
    @OneToOne(mappedBy = "idRol",fetch = FetchType.EAGER)
    private EeipUsuarios usuario;

    public EeipUsuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(EeipUsuarios usuario) {
        this.usuario = usuario;
    }

    public EeicRoles() {
    }

    public EeicRoles(Integer idRol) {
        this.idRol = idRol;
    }

    public EeicRoles(Integer idRol, String descripcion, Date fechaInicio) {
        this.idRol = idRol;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
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

    public Set<EeicProcesos> getEeicProcesosList() {
        return eeicProcesosList;
    }

    public void setEeicProcesosList(Set<EeicProcesos> eeicProcesosList) {
        this.eeicProcesosList = eeicProcesosList;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRol != null ? idRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicRoles)) {
            return false;
        }
        EeicRoles other = (EeicRoles) object;
        if ((this.idRol == null && other.idRol != null) || (this.idRol != null && !this.idRol.equals(other.idRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.security.EeicRoles[ idRol=" + idRol + " ]";
    }

    public String getDescripcionLbl() {
        return descripcionLbl;
    }

    public void setDescripcionLbl(String descripcionLbl) {
        this.descripcionLbl = descripcionLbl;
    }

    
}
