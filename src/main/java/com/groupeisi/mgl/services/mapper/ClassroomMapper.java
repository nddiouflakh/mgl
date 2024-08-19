package com.groupeisi.mgl.services.mapper;

import com.groupeisi.mgl.domaine.Classroom;
import com.groupeisi.mgl.services.dto.ClassroomDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ClassroomMapper {
    ClassroomDto toDto(Classroom classroom);
    Classroom toEntity(ClassroomDto classroomDto);
    List<ClassroomDto> toDtoList(List<Classroom> classrooms);
}
