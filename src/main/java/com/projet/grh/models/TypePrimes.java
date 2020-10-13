package com.projet.grh.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "type_prime")
public class TypePrimes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_prime")
    private Long Id;

    @Column(name = "lib_prime")
    private String libelle;

    public TypePrimes(Long id, String libelle) {
        Id = id;
        this.libelle = libelle;
    }

    public TypePrimes() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

}
