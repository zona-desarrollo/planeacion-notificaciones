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
import java.util.Objects;
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

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_anp", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicAnp.findAll", query = "SELECT e FROM EeicAnp e")
   ,@NamedQuery(name = "EeicAnp.findByIdANP", query = "SELECT e FROM EeicAnp e WHERE e.anpPK.idANP = :idANP")
   ,@NamedQuery(name = "EeicAnp.findByIdEstado", query = "SELECT e FROM EeicAnp e WHERE e.anpPK.idEstado = :idEstado")})
public class EeicAnp implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private EeicAnpPK anpPK;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
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
    

    public EeicAnp() {
    }

    public EeicAnpPK getAnpPK() {
        return anpPK;
    }

    public void setAnpPK(EeicAnpPK anpPK) {
        this.anpPK = anpPK;
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
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EeicAnp other = (EeicAnp) obj;
        if (!Objects.equals(this.anpPK, other.anpPK)) {
            return false;
        }
        return true;
    }

    
}
