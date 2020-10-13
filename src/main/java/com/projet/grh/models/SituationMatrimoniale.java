package com.projet.grh.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="situation_mat")

public class SituationMatrimoniale implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_sit")
    int id;
    @Column(name = "lib_sit")
    String libelle;

    public SituationMatrimoniale() {
    }

    public SituationMatrimoniale(int id, String libelle) {
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
