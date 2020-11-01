//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.10.30 à 02:17:55 PM CET 
//


package soapserver.api.author_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour author complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="author">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bookIdList" type="{http://soapserver/api/author-ws}valuelist"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "author", propOrder = {
    "authorId",
    "name",
    "firstName",
    "bookIdList"
})
public class Author {

    protected int authorId;
    @XmlElement(required = true)
    protected String name;
    protected int firstName;
    @XmlElement(required = true)
    protected Valuelist bookIdList;

    /**
     * Obtient la valeur de la propriété authorId.
     * 
     */
    public int getAuthorId() {
        return authorId;
    }

    /**
     * Définit la valeur de la propriété authorId.
     * 
     */
    public void setAuthorId(int value) {
        this.authorId = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété firstName.
     * 
     */
    public int getFirstName() {
        return firstName;
    }

    /**
     * Définit la valeur de la propriété firstName.
     * 
     */
    public void setFirstName(int value) {
        this.firstName = value;
    }

    /**
     * Obtient la valeur de la propriété bookIdList.
     * 
     * @return
     *     possible object is
     *     {@link Valuelist }
     *     
     */
    public Valuelist getBookIdList() {
        return bookIdList;
    }

    /**
     * Définit la valeur de la propriété bookIdList.
     * 
     * @param value
     *     allowed object is
     *     {@link Valuelist }
     *     
     */
    public void setBookIdList(Valuelist value) {
        this.bookIdList = value;
    }

}
