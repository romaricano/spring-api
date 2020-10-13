package com.projet.grh.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "personnes")
public class Personne implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_pers")
    private int id;
    @ManyToOne
    @JoinColumn(name = "type_pers_id_type_pers", referencedColumnName = "id_type_pers")
    private TypePers typePers;
    @Column(name = "nom_pers")
    private String nom;

    public Personne() {
    }

    public Personne(int id, TypePers typePers, String nom) {
        this.id = id;
        this.typePers = typePers;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypePers() {
        return typePers.getlibelle();
    }

    public void setTypePers(TypePers typePers) {
        this.typePers = typePers;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
