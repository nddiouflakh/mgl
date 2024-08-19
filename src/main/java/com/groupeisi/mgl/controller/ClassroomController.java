package com.groupeisi.mgl.controller;

import com.groupeisi.mgl.domaine.Classroom;
import com.groupeisi.mgl.services.ClassroomService;
import com.groupeisi.mgl.services.dto.ClassroomDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/classroom")
public class ClassroomController {
//    private final ClassroomService classroomService;

//    public ClassroomController(ClassroomService classroomService) {
//        this.classroomService = classroomService;
//    }
    private final ClassroomService classroomService;

    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @PostMapping
    public ClassroomDto save(@RequestBody ClassroomDto classroom) {
        return classroomService.save(classroom);
    }


    @GetMapping
    public List<ClassroomDto> findAll() {
        return classroomService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ClassroomDto> findOne(@PathVariable Long id) {
        return classroomService.findOne(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        classroomService.delete(id);
        return "Suppression avec succes";
    }
}