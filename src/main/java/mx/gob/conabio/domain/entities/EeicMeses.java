/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_meses", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicMeses.findAll", query = "SELECT e FROM EeicMeses e")
    , @NamedQuery(name = "EeicMeses.findById", query = "SELECT e FROM EeicMeses e WHERE e.id = :id")
    , @NamedQuery(name = "EeicMeses.findByMesnum", query = "SELECT e FROM EeicMeses e WHERE e.mesnum = :mesnum")
    , @NamedQuery(name = "EeicMeses.findByNombre", query = "SELECT e FROM EeicMeses e WHERE e.nombre = :nombre")})
public class EeicMeses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Short id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mesnum")
    private short mesnum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;

    public EeicMeses() {
    }

    public EeicMeses(Short id) {
        this.id = id;
    }

    public EeicMeses(Short id, short mesnum, String nombre) {
        this.id = id;
        this.mesnum = mesnum;
        this.nombre = nombre;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public short getMesnum() {
        return mesnum;
    }

    public void setMesnum(short mesnum) {
        this.mesnum = mesnum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicMeses)) {
            return false;
        }
        EeicMeses other = (EeicMeses) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
}
