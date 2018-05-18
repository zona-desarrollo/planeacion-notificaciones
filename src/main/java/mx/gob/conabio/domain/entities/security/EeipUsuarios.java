/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.security;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeip_usuarios", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeipUsuarios.findByNombreUsuario", query = "SELECT e FROM EeipUsuarios e WHERE e.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "EeipUsuarios.findByEmail", query = "SELECT e FROM EeipUsuarios e WHERE e.email = :mail"),
    @NamedQuery(name = "EeipUsuarios.findByIdRol", query = "SELECT e FROM EeipUsuarios e WHERE e.idRol.idRol = :idRol"),
    @NamedQuery(name = "EeipUsuarios.findByIdUsuario", query = "SELECT e FROM EeipUsuarios e WHERE e.idUsuario = :idUsuario")
    })

public class EeipUsuarios implements Serializable, UserDetails {
    
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private Integer idUsuario;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEstatusUsuario")
    private int idEstatusUsuario;
    
    
    @Column(name = "idTipoInstitucion")
    private int idTipoInstitucion;
    
    
    @Column(name = "idInstitucion")
    private int idInstitucion;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Nombre")
    private String nombre;
    
    @Size(max = 250)
    @Column(name = "Titulo")
    private String titulo;
    
    @Size(max = 250)
    @Column(name = "CargoArea")
    private String cargoArea;
    
    @Size(max = 240)
    @Column(name = "Direccion")
    private String direccion;
    
    @Column(name = "Telefono")
    private String telefono;
    
    
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Email")
    private String email;
        
    
    @Column(name = "PerteneceGEF")
    private boolean perteneceGEF;
    
    
    @Column(name = "InfoPublica")
    private boolean infoPublica;
    
    @Size(max = 250)
    @Column(name = "Motivo")
    private String motivo;
    
    @Size(max = 100)
    @Column(name = "ObjetivoConsulta")
    private String objetivoConsulta;
    
    
    @NotNull
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    
    @Column(name = "idSuperior")
    private Integer idSuperior;
    
    @Size(max = 100)
    @Column(name = "OtraInstitucion")
    private String otraInstitucion;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "Password")
    private String password;
    
    
    @Size(max = 50)
    @Column(name = "NombreUsuario")
    private String nombreUsuario;
    
    @JoinColumn(name = "idRol", referencedColumnName = "idRol")
    @OneToOne
    private EeicRoles idRol;

    @Column(name = "IdResponsable")
    private Integer idResponsable;
    
    @Column(name = "IdCapturista")
    private Integer idCapturista;
    
    @Transient
    private String oldPassword;
    
    public EeipUsuarios() {
    }

    public EeipUsuarios(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public EeipUsuarios(Integer idUsuario, int idEstatusUsuario, int idTipoInstitucion, int idInstitucion, String nombre, String telefono, String email, boolean perteneceGEF, boolean infoPublica, Date fechaRegistro, String password) {
        this.idUsuario = idUsuario;
        this.idEstatusUsuario = idEstatusUsuario;
        this.idTipoInstitucion = idTipoInstitucion;
        this.idInstitucion = idInstitucion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.perteneceGEF = perteneceGEF;
        this.infoPublica = infoPublica;
        this.fechaRegistro = fechaRegistro;
        this.password = password;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEstatusUsuario() {
        return idEstatusUsuario;
    }

    public void setIdEstatusUsuario(int idEstatusUsuario) {
        this.idEstatusUsuario = idEstatusUsuario;
    }

    public int getIdTipoInstitucion() {
        return idTipoInstitucion;
    }

    public void setIdTipoInstitucion(int idTipoInstitucion) {
        this.idTipoInstitucion = idTipoInstitucion;
    }

    public int getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(int idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCargoArea() {
        return cargoArea;
    }

    public void setCargoArea(String cargoArea) {
        this.cargoArea = cargoArea;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        this.nombreUsuario = email.substring(0, email.indexOf('@'));
    }

    public boolean getPerteneceGEF() {
        return perteneceGEF;
    }

    public void setPerteneceGEF(boolean perteneceGEF) {
        this.perteneceGEF = perteneceGEF;
    }

    public boolean getInfoPublica() {
        return infoPublica;
    }

    public void setInfoPublica(boolean infoPublica) {
        this.infoPublica = infoPublica;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdSuperior() {
        return idSuperior;
    }

    public void setIdSuperior(Integer idSuperior) {
        this.idSuperior = idSuperior;
    }

    public String getOtraInstitucion() {
        return otraInstitucion;
    }

    public void setOtraInstitucion(String otraInstitucion) {
        this.otraInstitucion = otraInstitucion;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public EeicRoles getIdRol() {
        return idRol;
    }

    public void setIdRol(EeicRoles idRol) {
        this.idRol = idRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeipUsuarios)) {
            return false;
        }
        EeipUsuarios other = (EeipUsuarios) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.security.EeipUsuarios[ idUsuario=" + idUsuario + " ]";
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.createAuthorityList(this.idRol.getDescripcion());
    }

    @Override
    public String getUsername() {
        return this.nombreUsuario;
    }

    @Override
    public boolean isAccountNonExpired() {
       return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getObjetivoConsulta() {
        return objetivoConsulta;
    }

    public void setObjetivoConsulta(String objetivoConsulta) {
        this.objetivoConsulta = objetivoConsulta;
    }

    public Integer getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(Integer idResponsable) {
        this.idResponsable = idResponsable;
    }

    public Integer getIdCapturista() {
        return idCapturista;
    }

    public void setIdCapturista(Integer idCapturista) {
        this.idCapturista = idCapturista;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }
    
}
