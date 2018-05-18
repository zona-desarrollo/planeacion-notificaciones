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
@Table(name = "eeib_passwords", catalog = "conabio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EeibPasswords.findAll", query = "SELECT e FROM EeibPasswords e")
    , @NamedQuery(name = "EeibPasswords.findById", query = "SELECT e FROM EeibPasswords e WHERE e.eeibPasswordsPK.id = :id")
    , @NamedQuery(name = "EeibPasswords.findByIdUsuario", query = "SELECT e FROM EeibPasswords e WHERE e.eeibPasswordsPK.idUsuario = :idUsuario")
    , @NamedQuery(name = "EeibPasswords.findByPassword", query = "SELECT e FROM EeibPasswords e WHERE e.password = :password")
    , @NamedQuery(name = "EeibPasswords.findByFecha", query = "SELECT e FROM EeibPasswords e WHERE e.fecha = :fecha")})
public class EeibPasswords implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EeibPasswordsPK eeibPasswordsPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "Password")
    private String password;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public EeibPasswords() {
    }

    public EeibPasswords(EeibPasswordsPK eeibPasswordsPK) {
        this.eeibPasswordsPK = eeibPasswordsPK;
    }

    public EeibPasswords(EeibPasswordsPK eeibPasswordsPK, String password) {
        this.eeibPasswordsPK = eeibPasswordsPK;
        this.password = password;
    }
    
    public EeibPasswords(EeibPasswordsPK eeibPasswordsPK, 
                         String password,
                         Date fecha) {
        this.eeibPasswordsPK = eeibPasswordsPK;
        this.password = password;
        this.fecha = fecha;
    }

    public EeibPasswords(int id, int idUsuario) {
        this.eeibPasswordsPK = new EeibPasswordsPK(id, idUsuario);
    }

    public EeibPasswordsPK getEeibPasswordsPK() {
        return eeibPasswordsPK;
    }

    public void setEeibPasswordsPK(EeibPasswordsPK eeibPasswordsPK) {
        this.eeibPasswordsPK = eeibPasswordsPK;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eeibPasswordsPK != null ? eeibPasswordsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeibPasswords)) {
            return false;
        }
        EeibPasswords other = (EeibPasswords) object;
        if ((this.eeibPasswordsPK == null && other.eeibPasswordsPK != null) || (this.eeibPasswordsPK != null && !this.eeibPasswordsPK.equals(other.eeibPasswordsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.security.EeibPasswords[ eeibPasswordsPK=" + eeibPasswordsPK + " ]";
    }
    
}
