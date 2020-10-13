package com.projet.grh.models;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Table(name="syndicat")
public class Syndicat implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_synd")
    int id;
    @Column(name = "lib_synd")
    String libelle;

    public Syndicat() {
    }

    public Syndicat(int id, String libelle) {
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
