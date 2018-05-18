/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities;

import mx.gob.conabio.domain.entities.catalogo.tipoactividad.EeicTipoactividad;
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import mx.gob.conabio.domain.entities.security.EeipUsuarios;
import org.hibernate.annotations.Where;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_actividad", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitActividades.findAll", query = "SELECT e FROM EeitActividades e")
    , @NamedQuery(name = "EeitActividades.findByIdActividad", query = "SELECT e FROM EeitActividades e WHERE e.idActividad = :idActividad")})
public class EeitActividades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idActividad")
    private Integer idActividad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 350)
    @Column(name = "LineaBase2014")
    private String lineaBase2014;
    
    @Column(name = "idCoparticipante")
    private Integer idCoparticipante;
    
    @OneToMany (fetch = FetchType.EAGER)
    @JoinTable(
                name = "eeia_actividad_coparticipante",
                joinColumns = @JoinColumn(name = "idActividad"),
                inverseJoinColumns = @JoinColumn(name = "idCoparticipante"))
    private @Getter @Setter Set<EeicCoparticipantes> coparticipantes;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUbicacionTerritorial")
    private int idUbicacionTerritorial;
    
    
    @Size(max = 75)
    @Column(name = "DescripcionOtraRuta")
    private String descripcionOtraRuta;
    @Size(max = 100)
    @Column(name="OtroCoparticipante")
    private String otroCoparticipante;
    
    @Size(max = 50)
    @Column(name="OtraCategoriaActividad")
    private @Getter @Setter String otraCategoriaActividad;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    
    @OneToMany (fetch = FetchType.EAGER)
    @JoinTable(
                name = "eeia_actividad_categoria",
                joinColumns = @JoinColumn(name = "idActividad"),
                inverseJoinColumns = @JoinColumn(name = "idCategoria"))
    private @Getter @Setter Set<EeicCategoriaactividad> categorias;
     
    
    @JoinColumn(name = "idTipoActividad", referencedColumnName = "idTipoActividad")
    @ManyToOne(optional = false,fetch = FetchType.EAGER)
    private EeicTipoactividad idTipoActividad;
    
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false,fetch = FetchType.EAGER)
    private EeipUsuarios idUsuario;
    
    @OneToMany (fetch = FetchType.EAGER)
    @JoinTable(
                name = "eeia_actividad_rutaintro",
                joinColumns = @JoinColumn(name = "idActividad"),
                inverseJoinColumns = @JoinColumn(name = "idRutaIntro"))
    private Set<EeicRutasintroduccion> rutasIntroduccion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividad",fetch = FetchType.EAGER)
    @Where(clause = "autorizado='false'")
    private @Getter @Setter List<EeitActividadOtrasespecies> otrasEspecies;
    
    @Size(max = 80)
    @Column(name="motivoInclusion")
    private @Getter @Setter String motivoInclusion;
    
    
    public Set<EeicRutasintroduccion> getRutasIntroduccion() {
        return rutasIntroduccion;
    }

    public void setRutasIntroduccion(Set<EeicRutasintroduccion> rutasIntroduccion) {
        this.rutasIntroduccion = rutasIntroduccion;
    }

    public EeitActividades() {
    }

    public EeitActividades(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public EeitActividades(Integer idActividad, String nombre, String descripcion, String lineaBase2014, int idUbicacionTerritorial, Date fechaRegistro) {
        this.idActividad = idActividad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lineaBase2014 = lineaBase2014;
        this.idUbicacionTerritorial = idUbicacionTerritorial;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLineaBase2014() {
        return lineaBase2014;
    }

    public void setLineaBase2014(String lineaBase2014) {
        this.lineaBase2014 = lineaBase2014;
    }

    public Integer getIdCoparticipante() {
        return idCoparticipante;
    }

    public void setIdCoparticipante(Integer idCoparticipante) {
        this.idCoparticipante = idCoparticipante;
    }

    public int getIdUbicacionTerritorial() {
        return idUbicacionTerritorial;
    }

    public void setIdUbicacionTerritorial(int idUbicacionTerritorial) {
        this.idUbicacionTerritorial = idUbicacionTerritorial;
    }
    
    public String getDescripcionOtraRuta() {
        return descripcionOtraRuta;
    }

    public void setDescripcionOtraRuta(String descripcionOtraRuta) {
        this.descripcionOtraRuta = descripcionOtraRuta;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

  
    public EeicTipoactividad getIdTipoActividad() {
        return idTipoActividad;
    }

    public void setIdTipoActividad(EeicTipoactividad idTipoActividad) {
        this.idTipoActividad = idTipoActividad;
    }

    public EeipUsuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(EeipUsuarios idUsuario) {
        this.idUsuario = idUsuario;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividad != null ? idActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeitActividades)) {
            return false;
        }
        EeitActividades other = (EeitActividades) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.config.EeitActividades[ idActividad=" + idActividad + " ]";
    }

    public String getOtroCoparticipante() {
        return otroCoparticipante;
    }

    public void setOtroCoparticipante(String otroCoparticipante) {
        this.otroCoparticipante = otroCoparticipante;
    }
    
    
    
}
