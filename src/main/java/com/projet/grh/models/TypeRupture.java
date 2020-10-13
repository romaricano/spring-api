package com.projet.grh.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="type_rupture")

public class TypeRupture implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_type_rupture")
    int id;
    @Column(name = "lib_rupture")
    String libelle;

    public TypeRupture() {
    }

    public TypeRupture(int id, String libelle) {
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
