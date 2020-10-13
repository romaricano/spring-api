package com.projet.grh.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="type_rub")

public class TypeRub implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_type_rub")
    int id;
    @Column(name = "lib_type_rub")
    String libelle;

    public TypeRub(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public TypeRub() {
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
