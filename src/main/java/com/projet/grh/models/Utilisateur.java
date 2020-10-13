package com.projet.grh.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_utili")
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "mot_passe")
    private String password;
    @ManyToOne
    @JoinColumn(name = "employe_matri_emp",referencedColumnName = "matri_emp")
    private Employe employe;

    public Utilisateur() {
    }

    public Utilisateur(Integer id, String username, String password, Employe employe) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.employe = employe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMatriculeUtilisateur() {
        return employe.getMatriculeEmploye();
    }

}
