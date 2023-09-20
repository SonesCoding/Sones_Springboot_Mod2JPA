package com.FSA.Sones_Springboot_Module2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.FSA.Sones_Springboot_Module2.author.author;
import com.FSA.Sones_Springboot_Module2.author.authorrepo;
import com.FSA.Sones_Springboot_Module2.book.book;
import com.FSA.Sones_Springboot_Module2.book.bookrepo;
import com.FSA.Sones_Springboot_Module2.history.history;
import com.FSA.Sones_Springboot_Module2.history.historyrepo;

@SpringBootApplication

public class DBaccessing {

  private static final Logger log = LoggerFactory.getLogger(DBaccessing.class);

  public static void main(String[] args) {
    SpringApplication.run(DBaccessing.class);
  }

  @Bean
  public CommandLineRunner demo(bookrepo repository) {
    return (args) -> {
      // save a few customers
    repository.save(new book( "The Secret Garden", "Frances Hodgson Burnett"));
    repository.save(new book( "Aesops Fables", "Aesop"));
    repository.save(new book( "Holes", "Louis Sachar"));
    repository.save(new book( "Peter Pan", "J.M. Barrie"));
    repository.save(new book( "The Wonderful Wizard of Oz", "L. Frank Baum"));
    repository.save(new book( "The Swiss Family Robinsons", "Johann D. Wyss"));
    repository.save(new book( "Treasure Island", "Louis Stevenson"));
    repository.save(new book( "Danny the Champion of the World", "Roald Dahl"));
    

      // fetch all customers
      log.info("Books found with findAll():");
      log.info("-------------------------------");
      for (book book : repository.findAll()) {
        log.info(book.toString());
      }
      log.info("");

    };
  }

  @Bean
  public CommandLineRunner demo1(authorrepo repository) {
    return (args) -> {

      repository.save(new author("Frances", "Hodgson Burnett"));
      repository.save(new author("The", "Aesop"));
      repository.save(new author("Louis", "Sachar"));
      repository.save(new author("J.M.", "Barrie"));
      repository.save(new author("L. Frank", "Baum"));
      repository.save(new author("Johann", "D. Wyss"));
      repository.save(new author("Louis", "Stevenson"));
      repository.save(new author("Roald", "Dahl"));


      log.info("Authors found with findAll():");
      log.info("-------------------------------");
      for (author author : repository.findAll()) {
        log.info(author.toString());
      }
      log.info("");

    };
  }

  @Bean
  public CommandLineRunner demo2(historyrepo repository) {
    return (args) -> {

      repository.save(new history("09/17/23", "09/7/23", "The Secret Garden"));
      repository.save(new history("09/17/23", "09/07/23, ", "Aesops Fables"));
      repository.save(new history("08/20/23", "08/10/23", "Holes"));
      repository.save(new history( "...", "04/04/99", "Peter Pan"));
      repository.save(new history("07/12/23", "07/07/23","Holes"));
      repository.save(new history("07/01/23", "06/23/23", "The Wonderful Wizard of Oz"));
      repository.save(new history("...", "02/14/91", "The Swiss Family Robinsons"));
      repository.save(new history("01/01/01", "01/01/01", "Danny the Champion of the World"));
      
      

      
      log.info("History found with findAll():");
      log.info("-------------------------------");
      for (history history : repository.findAll()) {
        log.info(history.toString());
      }
      log.info("");

    };
  }
}