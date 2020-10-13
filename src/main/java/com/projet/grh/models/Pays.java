package com.projet.grh.models;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="pays")
public class Pays implements Serializable {
    @Id
    @GeneratedValue()
    @Column(name = "id_pays")
    private int id;
    @Column(name = "lib_pays")
    private String libelle;

    public Pays() {
    }

    public Pays(int id, String libelle) {
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
