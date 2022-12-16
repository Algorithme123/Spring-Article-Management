package com.article.model;




import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@Table(name="Article")
public class Article {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;


    @Column(name="desigation")
    private String designation;

    @Column(name = "prixUnitaire")
    private String prixUnitaire;

    @Column(name = "quantite")
    private int quantite;

    @Column(name = "description")
    private String description;
}
