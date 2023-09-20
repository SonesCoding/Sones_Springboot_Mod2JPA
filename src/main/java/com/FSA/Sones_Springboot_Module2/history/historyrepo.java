package com.FSA.Sones_Springboot_Module2.history; 


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import java.util.Set;
//import com.FSA.Sones_Springboot_Module2.book.book;


@Repository
public interface historyrepo  extends CrudRepository<history, Long>{
    List<history>findByBorrowedBook(String borrowedBook);
    
    history findById(long id);
}

