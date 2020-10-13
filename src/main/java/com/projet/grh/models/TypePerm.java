package com.projet.grh.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="type_perm")
public class TypePerm implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_perm")
    private Long Id;

    @Column(name = "lib_perm")
    private String libelle;

    public TypePerm(Long id, String libelle) {
        Id = id;
        this.libelle = libelle;
    }

    public TypePerm() {

    }


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setlibelle(String libelle) {
        this.libelle = libelle;
    }
}