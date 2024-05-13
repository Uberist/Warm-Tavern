package org.example.warmtavernweb.DAO;

import org.example.warmtavernweb.Entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class AdminDAO {
    @Autowired
    private DataSource dataSource;
    public List<Author> getListAuthors(){
        List<Author> authors = new ArrayList<>();
        try(
                Connection connection = dataSource.getConnection();
                Statement statement = connection.createStatement();
        ){
            ResultSet resultSet = statement.executeQuery("SELECT * FROM authors");
            while(resultSet.next()){
                authors.add(new Author(
                        (Integer) resultSet.getObject("id"),
                        resultSet.getObject("author_first_name") + " " +
                        resultSet.getObject("author_last_name") + " " +
                        resultSet.getObject("author_middle_name")));
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return authors;
    }
}
