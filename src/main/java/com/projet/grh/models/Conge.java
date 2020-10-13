package com.projet.grh.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="conge")

public class Conge implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_conge")
    int id;
    @Column(name = "lib_conge")
    String libelle;
    @Column(name = "descrip_conge")
    String description;

    public Conge() {
    }

    public Conge(int id, String libelle, String description) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
    }
}
