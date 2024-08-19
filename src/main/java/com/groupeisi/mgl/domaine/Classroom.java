package com.groupeisi.mgl.domaine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Classroom {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String description;

}
