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

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_anios", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicAnios.findAll", query = "SELECT e FROM EeicAnios e")
    , @NamedQuery(name = "EeicAnios.findById", query = "SELECT e FROM EeicAnios e WHERE e.id = :id")
    , @NamedQuery(name = "EeicAnios.findByAnio", query = "SELECT e FROM EeicAnios e WHERE e.anio = :anio")})
public class EeicAnios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Short id;
    @Column(name = "anio")
    private Short anio;

    public EeicAnios() {
    }

    public EeicAnios(Short id) {
        this.id = id;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getAnio() {
        return anio;
    }

    public void setAnio(Short anio) {
        this.anio = anio;
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
        if (!(object instanceof EeicAnios)) {
            return false;
        }
        EeicAnios other = (EeicAnios) object;
        
        if(this.anio == null || other.getAnio() == null){
            return false;
        }
        return this.id.equals(other.getId());
    }

    @Override
    public String toString() {
        if(this.anio != null){
            return String.valueOf(this.anio);
        }
        return "";
    }
    
}
