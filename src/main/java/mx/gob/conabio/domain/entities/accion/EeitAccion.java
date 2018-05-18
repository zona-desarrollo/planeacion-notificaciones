/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.accion;

import mx.gob.conabio.domain.entities.*;
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
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import mx.gob.conabio.domain.entities.security.EeipUsuarios;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_accion", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitAccion.findAll", query = "SELECT e FROM EeitAccion e")
    , @NamedQuery(name = "EeitAccion.findByIdAccion", query = "SELECT e FROM EeitAccion e WHERE e.idAccion = :idAccion")})
public class EeitAccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAccion")
    private Integer idAccion;
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
    private String lineaBase2014  = "default";
    @Column(name = "idCoparticipante")
    private Integer idCoparticipante;
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
    @Column(name="OtraCategoria")
    private @Getter @Setter String otraCategoria;
    
    @OneToMany (fetch = FetchType.EAGER)
    @JoinTable(
                name = "eeia_accion_categoria",
                joinColumns = @JoinColumn(name = "idAccion"),
                inverseJoinColumns = @JoinColumn(name = "idCategoria"))
    private @Getter @Setter Set<EeicCategoriaAccion> categorias;
    
    
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    
    @JoinColumn(name = "idTipoAccion", referencedColumnName = "idTipoAccion")
    @ManyToOne(optional = false)
    private EeicTiposaccion idTipoAccion;
    
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private EeipUsuarios idUsuario;
    
    @Column(name = "Objetivo")
    private String objetivo;
    
    @Column(name = "DuracionPlan")
    private Integer duracionPlan;
    
    
    @Column(name = "Inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicial;
    
    @Column(name = "Fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    
    @Column(name = "EstatusAvance")
    private String estatusAvance;
    
    @Column(name = "Resultado")
    private String resultado;
    
    @Column(name = "LogroPorc")
    private Integer logroPorc;
    
    @Column(name = "Rezago")
    private String rezago;
    
    @OneToMany
    @JoinTable(
                name = "eeia_accion_rutaintro",
                joinColumns = @JoinColumn(name = "idAccion"),
                inverseJoinColumns = @JoinColumn(name = "idRutaIntro"))
    private Set<EeicRutasintroduccion> rutasIntroduccion;
    
    @Size(max = 80)
    @Column(name="motivoInclusion")
    private @Getter @Setter String motivoInclusion;

    public Set<EeicRutasintroduccion> getRutasIntroduccion() {
        return rutasIntroduccion;
    }

    public void setRutasIntroduccion(Set<EeicRutasintroduccion> rutasIntroduccion) {
        this.rutasIntroduccion = rutasIntroduccion;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accion")
    private @Getter @Setter List<EeitAccionLineabase> metas;
    
    
    @Transient
    private @Getter @Setter List<EeitAccionOtrasespecies> otrasEspecies;
    
    public EeitAccion() {
    }

    public EeitAccion(Integer idAccion) {
        this.idAccion = idAccion;
    }

    public EeitAccion(Integer idAccion, String nombre, String descripcion, String lineaBase2014, int idUbicacionTerritorial, Date fechaRegistro) {
        this.idAccion = idAccion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lineaBase2014 = lineaBase2014;
        this.idUbicacionTerritorial = idUbicacionTerritorial;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(Integer idAccion) {
        this.idAccion = idAccion;
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

    public EeipUsuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(EeipUsuarios idUsuario) {
        this.idUsuario = idUsuario;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccion != null ? idAccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof EeitAccion)) {
            return false;
        }
        EeitAccion other = (EeitAccion) object;
        if ((this.idAccion == null && other.idAccion != null) || (this.idAccion != null && !this.idAccion.equals(other.idAccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.config.EeitAcciones[ idAccion=" + idAccion + " ]";
    }

    public String getOtroCoparticipante() {
        return otroCoparticipante;
    }

    public void setOtroCoparticipante(String otroCoparticipante) {
        this.otroCoparticipante = otroCoparticipante;
    }

    public EeicTiposaccion getIdTipoAccion() {
        return idTipoAccion;
    }

    public void setIdTipoAccion(EeicTiposaccion idTipoAccion) {
        this.idTipoAccion = idTipoAccion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Integer getDuracionPlan() {
        return duracionPlan;
    }

    public void setDuracionPlan(Integer duracionPlan) {
        this.duracionPlan = duracionPlan;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getEstatusAvance() {
        return estatusAvance;
    }

    public void setEstatusAvance(String estatusAvance) {
        this.estatusAvance = estatusAvance;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Integer getLogroPorc() {
        return logroPorc;
    }

    public void setLogroPorc(Integer logroPorc) {
        this.logroPorc = logroPorc;
    }

    public String getRezago() {
        return rezago;
    }

    public void setRezago(String rezago) {
        this.rezago = rezago;
    }
    
    
    
    
}
