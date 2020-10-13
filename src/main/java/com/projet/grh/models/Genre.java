package com.projet.grh.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="genre")
public class Genre implements Serializable {
    @Id
    @GeneratedValue()
    @Column(name = "id_genre")
    private int id;
    @Column(name = "lib_genre")
    private String libelle;

    public Genre() {
    }

    public Genre(int id, String libelle) {
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
