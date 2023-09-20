package com.FSA.Sones_Springboot_Module2.book;


//import java.util.List;

//import com.FSA.Sones_Springboot_Module2.author.author;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="booktable")
public class book{

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


  @Column(name= "title")
    private @Getter @Setter String title;
  

  //@JoinColumn(name="book_author")
 // @ManyToOne(fetch = FetchType.LAZY)

 @Column(name = "book_author")
    private @Getter @Setter //List<author> 
    String author;

    public book(String title, //List<com.FSA.Sones_Springboot_Module2.author.author> 
    String author) {
      this.title = title;
      this.author = author;
    }

}
