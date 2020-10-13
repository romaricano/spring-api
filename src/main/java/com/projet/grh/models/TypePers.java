package com.projet.grh.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "type_pers")
public class TypePers implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_type_pers")
    private long Id;


    @Column(name="lib_typers")
    private String libelle;

    public TypePers(long id, String libelle){
        Id = id;
        this.libelle = libelle;
    }

    public TypePers() {
    }

    public long getId(){ return Id; }

    public void setId(long id) { Id = id; }

    public String getlibelle() { return libelle;}

    public void setlibelle(String libelle) { this. libelle = libelle; }


}
