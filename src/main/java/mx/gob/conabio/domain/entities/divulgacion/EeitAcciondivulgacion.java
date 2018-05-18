/*
 
 
 ** Propiedad  de la Comisión Nacional para el Conocimiento y Uso de la Biodiversidad (CONABIO)
* Liga Periférico-Insurgentes Sur 4903, Parques del Pedregal,
* Tlalpan, 14010 Ciudad de México
* www.conabio.gob.mx 
* www.biodiversidad.gob.mx
 */
package mx.gob.conabio.domain.entities.divulgacion;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeit_acciondivulgacion", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitAcciondivulgacion.findAll", query = "SELECT e FROM EeitAcciondivulgacion e"),
    @NamedQuery(name = "EeitAcciondivulgacion.findAllByIdUsuario", query = "SELECT e FROM EeitAcciondivulgacion e where e.idUsuario =:idUsuario")})
public class EeitAcciondivulgacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAccionDivulgacion")
    private int idAccionDivulgacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUsuario")
    private int idUsuario;    
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipoEvento")
    private int tipoEvento;
    @Size(max = 75)
    @Column(name = "DescripcionOtroEvento")
    private String descripcionOtroEvento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TituloEvento")
    private String tituloEvento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Objetivo")
    private String objetivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Cuidad")
    private String cuidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEstado")
    private int idEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaInicial")
    @Temporal(TemporalType.DATE)
    private Date fechaInicial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaFinal")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumAsistentes")
    private int numAsistentes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Sede")
    private String sede;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "CostoTotal")
    private BigDecimal costoTotal = new BigDecimal(0);
    @Size(max = 400)
    @Column(name = "Comentarios")
    private String comentarios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TemasSesion")
    private String temasSesion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Financiador")
    @Size(max = 400)
    private String financiador;
    @Size(max = 75)
    @Column(name = "OtroFinanciador")
    private String otroFinanciador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPais")
    private @Getter @Setter int idPais;
    

    public EeitAcciondivulgacion() {
    }

    public int getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(int tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getDescripcionOtroEvento() {
        return descripcionOtroEvento;
    }

    public void setDescripcionOtroEvento(String descripcionOtroEvento) {
        this.descripcionOtroEvento = descripcionOtroEvento;
    }

    public String getTituloEvento() {
        return tituloEvento;
    }

    public void setTituloEvento(String tituloEvento) {
        this.tituloEvento = tituloEvento;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
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

    public int getNumAsistentes() {
        return numAsistentes;
    }

    public void setNumAsistentes(int numAsistentes) {
        this.numAsistentes = numAsistentes;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public BigDecimal getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(BigDecimal costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getFinanciador() {
        return financiador;
    }

    public void setFinanciador(String financiador) {
        this.financiador = financiador;
    }

    
    public String getOtroFinanciador() {
        return otroFinanciador;
    }

    public void setOtroFinanciador(String otroFinanciador) {
        this.otroFinanciador = otroFinanciador;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTemasSesion() {
        return temasSesion;
    }

    public void setTemasSesion(String temasSesion) {
        this.temasSesion = temasSesion;
    }

    public int getIdAccionDivulgacion() {
        return idAccionDivulgacion;
    }

    public void setIdAccionDivulgacion(int idAccionDivulgacion) {
        this.idAccionDivulgacion = idAccionDivulgacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "EeitAcciondivulgacion{" + "idAccionDivulgacion=" + idAccionDivulgacion + ", idUsuario=" + idUsuario + ", tipoEvento=" + tipoEvento + ", descripcionOtroEvento=" + descripcionOtroEvento + ", tituloEvento=" + tituloEvento + ", objetivo=" + objetivo + ", cuidad=" + cuidad + ", idEstado=" + idEstado + ", fechaInicial=" + fechaInicial + ", fechaFinal=" + fechaFinal + ", numAsistentes=" + numAsistentes + ", sede=" + sede + ", costoTotal=" + costoTotal + ", comentarios=" + comentarios + ", temasSesion=" + temasSesion + ", financiador=" + financiador + ", otroFinanciador=" + otroFinanciador + ", fechaRegistro=" + fechaRegistro + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idAccionDivulgacion;
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
        final EeitAcciondivulgacion other = (EeitAcciondivulgacion) obj;
        if (this.idAccionDivulgacion != other.idAccionDivulgacion) {
            return false;
        }
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        return true;
    }
    
    

}
