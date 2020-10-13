package com.projet.grh.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="traitement")

public class Traitement implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "code_trait")
    int id;
    @Column(name = "lib_trait")
    String libelle;

    public Traitement() {
    }

    public Traitement(int id, String libelle) {
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
