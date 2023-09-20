package com.FSA.Sones_Springboot_Module2.book;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookrepo extends CrudRepository<book, Long> {

  book findById(long id);
  List<book> findAll();
  void deleteById(long id);
}

