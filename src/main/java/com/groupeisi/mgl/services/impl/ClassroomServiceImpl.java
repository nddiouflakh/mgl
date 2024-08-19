package com.groupeisi.mgl.services.impl;

import com.groupeisi.mgl.domaine.Classroom;
import com.groupeisi.mgl.repository.ClassroomRepository;
import com.groupeisi.mgl.services.ClassroomService;
import com.groupeisi.mgl.services.dto.ClassroomDto;
import com.groupeisi.mgl.services.mapper.ClassroomMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    private final ClassroomRepository classroomRepository;
    private final ClassroomMapper classroomMapper;


    public ClassroomServiceImpl(ClassroomRepository classroomRepository, ClassroomMapper classroomMapper) {
        this.classroomRepository = classroomRepository;
        this.classroomMapper = classroomMapper;
    }

    @Override
    public ClassroomDto save(ClassroomDto classroomDto) {
        var result = classroomRepository.save(classroomMapper.toEntity(classroomDto));
        return classroomMapper.toDto(result);
    }

    @Override
    public List<ClassroomDto> findAll() {
        var listClassroom = classroomRepository.findAll();
        return classroomMapper.toDtoList(listClassroom);
    }

    @Override
    public Optional<ClassroomDto> findOne(Long id) {
        return classroomRepository.findById(id).map(classroomMapper::toDto);
    }

    @Override
    public void delete(Long id) {
         classroomRepository.deleteById(id);
    }
}
