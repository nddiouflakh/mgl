package com.groupeisi.mgl.services;

import com.groupeisi.mgl.domaine.Classroom;
import com.groupeisi.mgl.services.dto.ClassroomDto;

import java.util.List;
import java.util.Optional;

public interface ClassroomService {
    ClassroomDto save(ClassroomDto classroom);

    List<ClassroomDto> findAll();

    Optional<ClassroomDto> findOne(Long id);

    void delete(Long id);
}
