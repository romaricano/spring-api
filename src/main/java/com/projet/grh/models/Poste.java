package com.projet.grh.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "poste")
public class Poste implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_poste")
    private int id;
    @Column(name = "lib_poste")
    private String libelle;
    @ManyToMany(mappedBy = "postes")
    private Collection<Employe> employe;
    public Poste() {
    }

    public Poste(int id, String libelle) {
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

    public Collection<Employe> getEmploye() {
        return employe;
    }

    public void setEmploye(Collection<Employe> employe) {
        this.employe = employe;
    }
}
