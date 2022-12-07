/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Information;

import dao.GeneralDao;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import model.Author;
import model.Book;

/**
 *
 * @author joyeuse
 */
@Path("saved")
public class bookss {
    private Book book=new Book();
    private GeneralDao<Book>bdao=new GeneralDao<>(Book.class);
    private List<Book>books;
    
    
      @POST
    public void save(Book book){
       bdao.create(book);
    }
    
    @GET
    public List<Book>findall(){
        return bdao.listAll();
    }
            
      @PUT
     @Path("/{id}")
     @Consumes(MediaType.APPLICATION_JSON)
     public Book updates(@PathParam("id") int id){
        Book book=(Book) bdao.findById(id);
       return  bdao.update(book);
         
    }       
            
            
     @DELETE
    @Path("{id}")
     public Book delette(@PathParam("id") int id){
         Book book=(Book) bdao.findById(id);
          bdao.delete(book); 
          if(book!=null){
          return book;
         }
          return null;
       
    }
    
    
    
    
    
    
    
    

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public GeneralDao<Book> getBdao() {
        return bdao;
    }

    public void setBdao(GeneralDao<Book> bdao) {
        this.bdao = bdao;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    
    
}
