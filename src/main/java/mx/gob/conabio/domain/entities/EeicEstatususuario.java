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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import mx.gob.conabio.domain.entities.security.EeipUsuarios;
import mx.gob.conabio.domain.entities.security.EeipUsuariosConsulta;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_estatususuario", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicEstatususuario.findAll", query = "SELECT e FROM EeicEstatususuario e")
    , @NamedQuery(name = "EeicEstatususuario.findByIdEstatusUsuario", query = "SELECT e FROM EeicEstatususuario e WHERE e.idEstatusUsuario = :idEstatusUsuario")})
public class EeicEstatususuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEstatusUsuario")
    private Integer idEstatusUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
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
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "idEstatusUsuario")
    private @Getter @Setter EeipUsuariosConsulta usuario;

    public EeicEstatususuario() {
    }

    public EeicEstatususuario(Integer idEstatusUsuario) {
        this.idEstatusUsuario = idEstatusUsuario;
    }

    public EeicEstatususuario(Integer idEstatusUsuario, String descripcion, Date fechaInicio) {
        this.idEstatusUsuario = idEstatusUsuario;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdEstatusUsuario() {
        return idEstatusUsuario;
    }

    public void setIdEstatusUsuario(Integer idEstatusUsuario) {
        this.idEstatusUsuario = idEstatusUsuario;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstatusUsuario != null ? idEstatusUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicEstatususuario)) {
            return false;
        }
        EeicEstatususuario other = (EeicEstatususuario) object;
        if ((this.idEstatusUsuario == null && other.idEstatusUsuario != null) || (this.idEstatusUsuario != null && !this.idEstatusUsuario.equals(other.idEstatusUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.repositories.EeicEstatususuario[ idEstatusUsuario=" + idEstatusUsuario + " ]";
    }
    
}
