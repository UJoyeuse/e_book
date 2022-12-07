/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Information;

import dao.GeneralDao;
import java.util.Date;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import model.Author;


/**
 *
 * @author joyeuse
 */

@Path("form")

public class authorr {
    private Author author=new Author();
    private GeneralDao<Author>adao=new GeneralDao<>(Author.class);
    private List<Author>authors;
    
    @POST
    public void save(Author author){
       adao.create(author);
    }
    @GET
    public List<Author>findall(){
       return adao.listAll();
    }
    @PUT
     @Path("/{id}")
     public Author updates(@PathParam("id") int id ,Author author){
        author.setAuthorId(id);
       return  adao.update(author);
         
    }
    
    @DELETE
    @Path("{id}")
     public Author delette(@PathParam("id") int id){
         Author author=(Author) adao.findById(id);
          adao.delete(author); 
          if(author!=null){
          return author;
         }
          return null;
       
    }

 
   public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
    
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public GeneralDao<Author> getAdao() {
        return adao;
    }

    public void setAdao(GeneralDao<Author> adao) {
        this.adao = adao;
    }
    
    
}
