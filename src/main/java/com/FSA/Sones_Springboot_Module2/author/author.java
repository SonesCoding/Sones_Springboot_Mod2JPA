package com.FSA.Sones_Springboot_Module2.author;

//import java.util.List;

//import com.FSA.Sones_Springboot_Module2.book.book;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
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
@Table(name="authortable")
public class author {


  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

  @Column(name = "author_fname", columnDefinition = "VARCHAR(255)")
    private @Getter @Setter String firstName;

    
  @Column(name = "author_lname", columnDefinition = "VARCHAR(255)")
    private @Getter @Setter String lastName;

  
  //@JoinColumn(name="author_book")
  //@OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
  //  private @Getter @Setter List<book> book;

    public author(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }
}

