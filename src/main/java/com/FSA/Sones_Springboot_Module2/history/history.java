package com.FSA.Sones_Springboot_Module2.history;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.text.DateFormat;
import java.util.Date;
//import java.util.List;

//import com.FSA.Sones_Springboot_Module2.book.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="historytable")
public class history{


  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


  @Column(name = "checkin")
    private String checkinDate;

  @Column(name = "checkout")
    private String checkoutDate;

   // @OneToOne(mappedBy = "history",cascade = CascadeType.ALL)
  //@JoinColumn(name = "borrowedBook_id")
  @Column(name = "borrowedBook_ID")
    private @Getter @Setter //List<book> 
    String borrowedBook;

    public history(String string2, String string, //List<book> 
    String borrowedBook) {
      this.checkinDate = string2;
      this.checkoutDate = string;
      this.borrowedBook = borrowedBook;
    }
}

