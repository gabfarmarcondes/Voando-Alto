package br.dev.Back_end.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // private String branch
    // private String name;
    //´private String size
    // private Double price Map<Double, String>
}
