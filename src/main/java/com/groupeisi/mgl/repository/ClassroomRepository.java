package com.groupeisi.mgl.repository;

import com.groupeisi.mgl.domaine.Classroom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassroomRepository extends CrudRepository<Classroom, Long> {
    List<Classroom> findAll();
}
