//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.11.01 à 12:53:42 PM CET 
//


package soapserver.api.author_ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soapserver.api.author_ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapserver.api.author_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddAuthorRequest }
     * 
     */
    public AddAuthorRequest createAddAuthorRequest() {
        return new AddAuthorRequest();
    }

    /**
     * Create an instance of {@link Valuelist }
     * 
     */
    public Valuelist createValuelist() {
        return new Valuelist();
    }

    /**
     * Create an instance of {@link DeleteAuthorResponse }
     * 
     */
    public DeleteAuthorResponse createDeleteAuthorResponse() {
        return new DeleteAuthorResponse();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    /**
     * Create an instance of {@link GetAuthorByIdResponse }
     * 
     */
    public GetAuthorByIdResponse createGetAuthorByIdResponse() {
        return new GetAuthorByIdResponse();
    }

    /**
     * Create an instance of {@link AuthorXSD }
     * 
     */
    public AuthorXSD createAuthorXSD() {
        return new AuthorXSD();
    }

    /**
     * Create an instance of {@link AddAuthorResponse }
     * 
     */
    public AddAuthorResponse createAddAuthorResponse() {
        return new AddAuthorResponse();
    }

    /**
     * Create an instance of {@link UpdateAuthorResponse }
     * 
     */
    public UpdateAuthorResponse createUpdateAuthorResponse() {
        return new UpdateAuthorResponse();
    }

    /**
     * Create an instance of {@link GetAuthorByIdRequest }
     * 
     */
    public GetAuthorByIdRequest createGetAuthorByIdRequest() {
        return new GetAuthorByIdRequest();
    }

    /**
     * Create an instance of {@link GetAllAuthorsRequest }
     * 
     */
    public GetAllAuthorsRequest createGetAllAuthorsRequest() {
        return new GetAllAuthorsRequest();
    }

    /**
     * Create an instance of {@link UpdateAuthorRequest }
     * 
     */
    public UpdateAuthorRequest createUpdateAuthorRequest() {
        return new UpdateAuthorRequest();
    }

    /**
     * Create an instance of {@link DeleteAuthorRequest }
     * 
     */
    public DeleteAuthorRequest createDeleteAuthorRequest() {
        return new DeleteAuthorRequest();
    }

    /**
     * Create an instance of {@link GetAllAuthorsResponse }
     * 
     */
    public GetAllAuthorsResponse createGetAllAuthorsResponse() {
        return new GetAllAuthorsResponse();
    }

}
