package com.projet.grh.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Entity
@Table(name="employe")
public class Employe implements Serializable {
    @Id
    @Column(name="matri_emp")
    private String matriculeEmploye;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "date_naiss")
    private Date dateNaiss;
    @Column(name = "lieu_naiss")
    private String lieuNaiss;
    @ManyToOne
    @JoinColumn(name = "id_genre", referencedColumnName = "id_genre" )
    private Genre genre;
    @Column(name = "nbr_enfts")
    private int nbreEnfants;
    @ManyToOne
    @JoinColumn(name = "pays_id_pays", referencedColumnName = "id_pays" )
    private Pays pays;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "email")
    private String email;
    @Column(name = "statut")
    private Boolean statut;
    @ManyToMany
    @JoinTable(name = "presence")
    private Collection<Poste> postes;

    public Employe() {
    }

    public Employe(String matriculeEmploye, String nom, String prenom, Date dateNaiss, String lieuNaiss, Genre genre, int nbreEnfants, Pays pays, String adresse, String email) {
        this.matriculeEmploye = matriculeEmploye;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.lieuNaiss = lieuNaiss;
        this.genre = genre;
        this.nbreEnfants = nbreEnfants;
        this.pays = pays;
        this.adresse = adresse;
        this.email = email;
    }

    public String getMatriculeEmploye() {
        return matriculeEmploye;
    }

    public void setMatriculeEmploye(String matriculeEmploye) {
        this.matriculeEmploye = matriculeEmploye;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getLieuNaiss() {
        return lieuNaiss;
    }

    public void setLieuNaiss(String lieuNaiss) {
        this.lieuNaiss = lieuNaiss;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getNbreEnfants() {
        return nbreEnfants;
    }

    public void setNbreEnfants(int nbreEnfants) {
        this.nbreEnfants = nbreEnfants;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getStatut() {
        return statut;
    }

    public void setStatut(Boolean statut) {
        this.statut = statut;
    }
}
