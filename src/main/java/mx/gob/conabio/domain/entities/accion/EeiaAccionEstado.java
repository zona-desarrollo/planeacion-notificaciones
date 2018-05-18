/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.accion;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeia_accion_estado", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeiaAccionEstado.findAll", query = "SELECT e FROM EeiaAccionEstado e")
    , @NamedQuery(name = "EeiaAccionEstado.findByIdAccion", query = "SELECT e FROM EeiaAccionEstado e WHERE e.idAccion = :idAccion")
    , @NamedQuery(name = "EeiaAccionEstado.findByIdEstado", query = "SELECT e FROM EeiaAccionEstado e WHERE e.idEstado = :idEstado")})
public class EeiaAccionEstado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAccion")
    private Integer idAccion;
    @Column(name = "idEstado")
    private Integer idEstado;

    public EeiaAccionEstado() {
    }

    public EeiaAccionEstado(Integer idAccion) {
        this.idAccion = idAccion;
    }

    public Integer getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(Integer idAccion) {
        this.idAccion = idAccion;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccion != null ? idAccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeiaAccionEstado)) {
            return false;
        }
        EeiaAccionEstado other = (EeiaAccionEstado) object;
        if ((this.idAccion == null && other.idAccion != null) || (this.idAccion != null && !this.idAccion.equals(other.idAccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeiaAccionEstado[ idAccion=" + idAccion + " ]";
    }
    
}
