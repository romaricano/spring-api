package com.projet.grh.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "type_abs")
public class TypeAbs implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_type_abs")
    int id;
    @Column(name = "lib_abs")
    String libelle;

    public TypeAbs() {
    }

    public TypeAbs(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
