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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_rutasintroduccion", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeicRutasintroduccion.findAll", query = "SELECT e FROM EeicRutasintroduccion e")
    , @NamedQuery(name = "EeicRutasintroduccion.findByIdRutaIntroduccion", query = "SELECT e FROM EeicRutasintroduccion e WHERE e.idRutaIntroduccion = :idRutaIntroduccion")})
public class EeicRutasintroduccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_RutaIntroduccion")
    private Integer idRutaIntroduccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "FechaInicio")
    private String fechaInicio;
    @Size(max = 45)
    @Column(name = "FechaFin")
    private String fechaFin;
    
    public EeicRutasintroduccion() {
    }

    public EeicRutasintroduccion(Integer idRutaIntroduccion) {
        this.idRutaIntroduccion = idRutaIntroduccion;
    }

    public EeicRutasintroduccion(Integer idRutaIntroduccion, String descripcion, String fechaInicio) {
        this.idRutaIntroduccion = idRutaIntroduccion;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    public Integer getIdRutaIntroduccion() {
        return idRutaIntroduccion;
    }

    public void setIdRutaIntroduccion(Integer idRutaIntroduccion) {
        this.idRutaIntroduccion = idRutaIntroduccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRutaIntroduccion != null ? idRutaIntroduccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicRutasintroduccion)) {
            return false;
        }
        EeicRutasintroduccion other = (EeicRutasintroduccion) object;
        if ((this.idRutaIntroduccion == null && other.idRutaIntroduccion != null) || (this.idRutaIntroduccion != null && !this.idRutaIntroduccion.equals(other.idRutaIntroduccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getDescripcion();
    }
    
}
