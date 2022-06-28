package com.demo.rest.services;

import com.demo.rest.model.Book;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.List;

@Path("books")
public class BookResource {

    @Inject
    @ConfigProperty(name = "book_list_size", defaultValue = "10")
    private Integer bookListSize;

    @PersistenceContext
    private EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllBooks() {

        List<Book> allBooks = this.entityManager
                .createQuery("SELECT b FROM Book b", Book.class)
                .setMaxResults(bookListSize)
                .getResultList();

        return Response.ok(allBooks).build();
    }
}
