package com.example.JPA.models;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;




@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Inheritance
@DiscriminatorValue("F")
public class Resource  {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int size;
    private String url;

    @OneToOne
    @JoinColumn(name = "lecture_id ")
    private Lecture lecture;
}
