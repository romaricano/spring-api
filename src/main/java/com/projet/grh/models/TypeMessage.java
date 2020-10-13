package com.projet.grh.models;


import javax.persistence.*;


@Entity
@Table(name = "type_message")
public class TypeMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_type_message")
    private Long Id;

    @Column(name = "lib_err")
    private String libelle;

    public TypeMessage(Long id, String libelle){
        Id = id ;
        this.libelle = libelle;
    }

    public TypeMessage() {

    }

    public Long getId(){ return Id; }

    public void setId(Long id) { Id = id;}

    public String getLibelle(){ return libelle; }

    public void setLibelle(String libelle) { this.libelle = libelle; }

}
