package com.groupeisi.mgl.services.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ClassroomDto {
    private Long id;
    private String nom;
    private String description;

}
