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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com) (ko.shironeko@outlook.com)
 */
@Entity
@Table(name = "eeic_nombrescientificos", catalog = "conabio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EeicNombrescientificos.findAll", query = "SELECT e FROM EeicNombrescientificos e")})
public class EeicNombrescientificos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_INVAS_COMPLETO")
    private Integer idINVASCOMPLETO;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "IDINVAS")
    private String idinvas;
    @Size(max = 20)
    @Column(name = "IdCATvalido_marzo2017")
    private String idCATvalidomarzo2017;
    @Size(max = 30)
    @Column(name = "GpoSNIB")
    private String gpoSNIB;
    @Size(max = 200)
    @Column(name = "NombreCientifico")
    private String nombreCientifico;
    @Size(max = 200)
    @Column(name = "Reino")
    private String reino;
    @Size(max = 200)
    @Column(name = "Divisionphylum")
    private String divisionphylum;
    @Size(max = 200)
    @Column(name = "Clase")
    private String clase;
    @Size(max = 200)
    @Column(name = "Orden")
    private String orden;
    @Size(max = 200)
    @Column(name = "Familia")
    private String familia;
    @Size(max = 200)
    @Column(name = "Genero")
    private String genero;
    @Size(max = 200)
    @Column(name = "Subgenero")
    private String subgenero;
    @Size(max = 200)
    @Column(name = "Especie")
    private String especie;
    @Size(max = 200)
    @Column(name = "autoranioespecie")
    private String autoranioespecie;
    @Size(max = 200)
    @Column(name = "Categoriainfraespecie")
    private String categoriainfraespecie;
    @Size(max = 200)
    @Column(name = "Infraespecie")
    private String infraespecie;
    @Size(max = 200)
    @Column(name = "autoranioinfraespecie")
    private String autoranioinfraespecie;

    public EeicNombrescientificos() {
    }

    public EeicNombrescientificos(Integer idINVASCOMPLETO) {
        this.idINVASCOMPLETO = idINVASCOMPLETO;
    }

    public EeicNombrescientificos(Integer idINVASCOMPLETO, String idinvas) {
        this.idINVASCOMPLETO = idINVASCOMPLETO;
        this.idinvas = idinvas;
    }

    public Integer getIdINVASCOMPLETO() {
        return idINVASCOMPLETO;
    }

    public void setIdINVASCOMPLETO(Integer idINVASCOMPLETO) {
        this.idINVASCOMPLETO = idINVASCOMPLETO;
    }

    public String getIdinvas() {
        return idinvas;
    }

    public void setIdinvas(String idinvas) {
        this.idinvas = idinvas;
    }

    public String getIdCATvalidomarzo2017() {
        return idCATvalidomarzo2017;
    }

    public void setIdCATvalidomarzo2017(String idCATvalidomarzo2017) {
        this.idCATvalidomarzo2017 = idCATvalidomarzo2017;
    }

    public String getGpoSNIB() {
        return gpoSNIB;
    }

    public void setGpoSNIB(String gpoSNIB) {
        this.gpoSNIB = gpoSNIB;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getDivisionphylum() {
        return divisionphylum;
    }

    public void setDivisionphylum(String divisionphylum) {
        this.divisionphylum = divisionphylum;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSubgenero() {
        return subgenero;
    }

    public void setSubgenero(String subgenero) {
        this.subgenero = subgenero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAutoranioespecie() {
        return autoranioespecie;
    }

    public void setAutoranioespecie(String autoranioespecie) {
        this.autoranioespecie = autoranioespecie;
    }

    public String getCategoriainfraespecie() {
        return categoriainfraespecie;
    }

    public void setCategoriainfraespecie(String categoriainfraespecie) {
        this.categoriainfraespecie = categoriainfraespecie;
    }

    public String getInfraespecie() {
        return infraespecie;
    }

    public void setInfraespecie(String infraespecie) {
        this.infraespecie = infraespecie;
    }

    public String getAutoranioinfraespecie() {
        return autoranioinfraespecie;
    }

    public void setAutoranioinfraespecie(String autoranioinfraespecie) {
        this.autoranioinfraespecie = autoranioinfraespecie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idINVASCOMPLETO != null ? idINVASCOMPLETO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EeicNombrescientificos)) {
            return false;
        }
        EeicNombrescientificos other = (EeicNombrescientificos) object;
        if ((this.idINVASCOMPLETO == null && other.idINVASCOMPLETO != null) || (this.idINVASCOMPLETO != null && !this.idINVASCOMPLETO.equals(other.idINVASCOMPLETO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.gob.conabio.domain.entities.EeicNombrescientificos[ idINVASCOMPLETO=" + idINVASCOMPLETO + " ]";
    }

    public String getLabel(){
        return this.nombreCientifico;
    }
    
    public String getDiscriminador(){
        String disc = "";
        
        if(this.genero != null && !this.genero.isEmpty()){
            disc = disc + " " + genero;
        }
        if(this.especie != null  && !this.especie.isEmpty()){
            disc = disc + " " + especie;
        }
        if(this.infraespecie != null && !this.infraespecie.isEmpty()){
            disc = disc + " " + infraespecie;
        }
        return disc.trim();
    }
}
