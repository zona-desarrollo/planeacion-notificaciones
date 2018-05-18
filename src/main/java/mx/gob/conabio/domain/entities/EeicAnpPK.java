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
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Yukio Arroyo Gomez (ko.shironeko@outlook.com)
 */
@Embeddable
public class EeicAnpPK implements Serializable {
    
    
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "idANP")
    private Integer idANP;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEstado")
    private Integer idEstado;
    
    
    public EeicAnpPK() {
    }

    public EeicAnpPK(Integer idANP) {
        this.idANP = idANP;
    }

    public Integer getIdANP() {
        return idANP;
    }

    public void setIdANP(Integer idANP) {
        this.idANP = idANP;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
    
    
}
