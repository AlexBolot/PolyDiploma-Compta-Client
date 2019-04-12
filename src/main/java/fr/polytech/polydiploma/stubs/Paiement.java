
package fr.polytech.polydiploma.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour paiement complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="paiement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="extraData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paiement", propOrder = {
        "amount",
        "extraData"
})
public class Paiement {

    protected int amount;
    protected String extraData;

    /**
     * Obtient la valeur de la propriété amount.
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Définit la valeur de la propriété amount.
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * Obtient la valeur de la propriété extraData.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExtraData() {
        return extraData;
    }

    /**
     * Définit la valeur de la propriété extraData.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExtraData(String value) {
        this.extraData = value;
    }

}
