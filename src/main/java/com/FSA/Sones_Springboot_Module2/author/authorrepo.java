package com.FSA.Sones_Springboot_Module2.author;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface authorrepo extends CrudRepository<author, Long> {

    List<author> findByFirstName(String firstName);
  List<author> findByLastName(String lastName);

  author findById(long id);
}