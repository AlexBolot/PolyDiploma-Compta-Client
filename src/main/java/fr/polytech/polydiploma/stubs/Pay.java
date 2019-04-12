
package fr.polytech.polydiploma.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour pay complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="pay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paiement" type="{http://www.polytech.unice.fr/si/4a/isa/polydiploma/pay}paiement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pay", propOrder = {
        "paiement"
})
public class Pay {

    protected Paiement paiement;

    /**
     * Obtient la valeur de la propriété paiement.
     *
     * @return possible object is
     * {@link Paiement }
     */
    public Paiement getPaiement() {
        return paiement;
    }

    /**
     * Définit la valeur de la propriété paiement.
     *
     * @param value allowed object is
     *              {@link Paiement }
     */
    public void setPaiement(Paiement value) {
        this.paiement = value;
    }

}
