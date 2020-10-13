package com.projet.grh.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="type_indem")
public class TypeIndem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_type_indem")
    private Long id;

    @Column(name="lib_type_indem")
    private String libelle;

    @Column(name="descrip_indem")
    private String description;

    public TypeIndem(Long id, String libelle, String description) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
    }

    public TypeIndem(Long id, String libelle) {
        id = id;
        this.libelle = libelle;
    }
    public TypeIndem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}



