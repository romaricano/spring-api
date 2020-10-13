package com.projet.grh.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "preavis")
public class Preavis  implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_preavis")
    private int id;
    @Column(name = "lib_preavis")
    private String libelle;
    @Column(name = "descrip_preavis")
    private String description;

    public Preavis() {
    }

    public Preavis(int id, String libelle, String description) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
