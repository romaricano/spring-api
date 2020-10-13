package com.projet.grh.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="type_contrat")
public class TypeContrat implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_type_contrat")
    int id;
    @Column(name = "lib_contrat")
    String libelle;

    public TypeContrat() {
    }

    public TypeContrat(int id, String libelle) {
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
