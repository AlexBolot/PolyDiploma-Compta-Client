
package fr.polytech.polydiploma.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour payResponse complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="payResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="has_pay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payResponse", propOrder = {
        "hasPay"
})
public class PayResponse {

    @XmlElement(name = "has_pay")
    protected boolean hasPay;

    /**
     * Obtient la valeur de la propriété hasPay.
     */
    public boolean isHasPay() {
        return hasPay;
    }

    /**
     * Définit la valeur de la propriété hasPay.
     */
    public void setHasPay(boolean value) {
        this.hasPay = value;
    }

}
