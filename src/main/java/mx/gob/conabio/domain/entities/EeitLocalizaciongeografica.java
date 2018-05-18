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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "eeit_actividad_localizacion_geografica", catalog = "conabio", schema = "")
@NamedQueries({
    @NamedQuery(name = "EeitLocalizaciongeografica.findAll", query = "SELECT e FROM EeitLocalizaciongeografica e")})
public class EeitLocalizaciongeografica implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idActividad")
    private Integer idActividad;
    @Size(max = 45)
    @Column(name = "tipoLatitud")
    private String tipoLatitud;
    @Size(max = 45)
    @Column(name = "Latitud")
    private String latitud;
    @Size(max = 45)
    @Column(name = "GradosLatitud")
    private String gradosLatitud;
    @Size(max = 45)
    @Column(name = "MinutosLatitud")
    private String minutosLatitud;
    @Size(max = 45)
    @Column(name = "SegundosLatitud")
    private String segundosLatitud;
    @Size(max = 45)
    @Column(name = "tipoLongitud")
    private String tipoLongitud;
    @Size(max = 45)
    @Column(name = "Longitud")
    private String longitud;
    @Size(max = 45)
    @Column(name = "GradosLongitud")
    private String gradosLongitud;
    @Size(max = 45)
    @Column(name = "MinutosLongitud")
    private String minutosLongitud;
    @Size(max = 45)
    @Column(name = "SegundosLongitud")
    private String segundosLongitud;
    @Size(max = 45)
    @Column(name = "X")
    private String x;
    @Size(max = 45)
    @Column(name = "Y")
    private String y;
    @Size(max = 45)
    @Column(name = "Radio")
    private String radio;
    @Size(max = 20)
    @Column(name = "datum")
    private String datum;
    @Size(max = 45)
    @Column(name = "gradosLatitudFinal")
    private String gradosLatitudFinal;
    @Size(max = 45)
    @Column(name = "minutosLatitudFinal")
    private String minutosLatitudFinal;
    @Size(max = 45)
    @Column(name = "segundosLatitudFinal")
    private String segundosLatitudFinal;
    @Size(max = 45)
    @Column(name = "gradosLongitudFinal")
    private String gradosLongitudFinal;
    @Size(max = 45)
    @Column(name = "minutosLongitudFinal")
    private String minutosLongitudFinal;
    @Size(max = 45)
    @Column(name = "segundosLongitudFinal")
    private String segundosLongitudFinal;
    @Size(max = 45)
    @Column(name = "XFinal")
    private String xFinal;
    @Size(max = 45)
    @Column(name = "YFinal")
    private String yFinal;
    @Size(max = 45)
    @Column(name = "LatitudFinal")
    private String latitudFinal;
    @Size(max = 45)
    @Column(name = "LongitudFinal")
    private String longitudFinal;
    @JoinColumn(name = "idTipoCoordenada", referencedColumnName = "idTipoCoordenada")
    @ManyToOne
    private EeicTipocoordenada idTipoCoordenada;
    @JoinColumn(name = "idTipoSitio", referencedColumnName = "idTipoSitio")
    @ManyToOne
    private EeicTipositio idTipoSitio;

    public EeitLocalizaciongeografica() {
    }

    public String getTipoLatitud() {
        return tipoLatitud;
    }

    public void setTipoLatitud(String tipoLatitud) {
        this.tipoLatitud = tipoLatitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getGradosLatitud() {
        return gradosLatitud;
    }

    public void setGradosLatitud(String gradosLatitud) {
        this.gradosLatitud = gradosLatitud;
    }

    public String getMinutosLatitud() {
        return minutosLatitud;
    }

    public void setMinutosLatitud(String minutosLatitud) {
        this.minutosLatitud = minutosLatitud;
    }

    public String getSegundosLatitud() {
        return segundosLatitud;
    }

    public void setSegundosLatitud(String segundosLatitud) {
        this.segundosLatitud = segundosLatitud;
    }

    public String getTipoLongitud() {
        return tipoLongitud;
    }

    public void setTipoLongitud(String tipoLongitud) {
        this.tipoLongitud = tipoLongitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getGradosLongitud() {
        return gradosLongitud;
    }

    public void setGradosLongitud(String gradosLongitud) {
        this.gradosLongitud = gradosLongitud;
    }

    public String getMinutosLongitud() {
        return minutosLongitud;
    }

    public void setMinutosLongitud(String minutosLongitud) {
        this.minutosLongitud = minutosLongitud;
    }

    public String getSegundosLongitud() {
        return segundosLongitud;
    }

    public void setSegundosLongitud(String segundosLongitud) {
        this.segundosLongitud = segundosLongitud;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getGradosLatitudFinal() {
        return gradosLatitudFinal;
    }

    public void setGradosLatitudFinal(String gradosLatitudFinal) {
        this.gradosLatitudFinal = gradosLatitudFinal;
    }

    public String getMinutosLatitudFinal() {
        return minutosLatitudFinal;
    }

    public void setMinutosLatitudFinal(String minutosLatitudFinal) {
        this.minutosLatitudFinal = minutosLatitudFinal;
    }

    public String getSegundosLatitudFinal() {
        return segundosLatitudFinal;
    }

    public void setSegundosLatitudFinal(String segundosLatitudFinal) {
        this.segundosLatitudFinal = segundosLatitudFinal;
    }

    public String getGradosLongitudFinal() {
        return gradosLongitudFinal;
    }

    public void setGradosLongitudFinal(String gradosLongitudFinal) {
        this.gradosLongitudFinal = gradosLongitudFinal;
    }

    public String getMinutosLongitudFinal() {
        return minutosLongitudFinal;
    }

    public void setMinutosLongitudFinal(String minutosLongitudFinal) {
        this.minutosLongitudFinal = minutosLongitudFinal;
    }

    public String getSegundosLongitudFinal() {
        return segundosLongitudFinal;
    }

    public void setSegundosLongitudFinal(String segundosLongitudFinal) {
        this.segundosLongitudFinal = segundosLongitudFinal;
    }

    public EeicTipocoordenada getIdTipoCoordenada() {
        return idTipoCoordenada;
    }

    public void setIdTipoCoordenada(EeicTipocoordenada idTipoCoordenada) {
        this.idTipoCoordenada = idTipoCoordenada;
    }

    public EeicTipositio getIdTipoSitio() {
        return idTipoSitio;
    }

    public void setIdTipoSitio(EeicTipositio idTipoSitio) {
        this.idTipoSitio = idTipoSitio;
    }

    public String getLatitudFinal() {
        return latitudFinal;
    }

    public void setLatitudFinal(String latitudFinal) {
        this.latitudFinal = latitudFinal;
    }

    public String getLongitudFinal() {
        return longitudFinal;
    }

    public void setLongitudFinal(String longitudFinal) {
        this.longitudFinal = longitudFinal;
    }

    public String getxFinal() {
        return xFinal;
    }

    public void setxFinal(String xFinal) {
        this.xFinal = xFinal;
    }

    public String getyFinal() {
        return yFinal;
    }

    public void setyFinal(String yFinal) {
        this.yFinal = yFinal;
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
        if (!(object instanceof EeitLocalizaciongeografica)) {
            return false;
        }
        EeitLocalizaciongeografica other = (EeitLocalizaciongeografica) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeitLocalizaciongeografica[ idActividad =" + idActividad + " ]";
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }
    
}
