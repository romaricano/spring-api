package com.projet.grh.models;

import com.projet.grh.models.pk.PresencePK;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "presence")
public class Presence implements Serializable {
    @EmbeddedId
    PresencePK id = new PresencePK();
    @ManyToOne
    @MapsId("idPoste")
    @JoinColumn(name = "id_poste", referencedColumnName = "id_poste")
    private Poste poste;

    @ManyToOne
    @MapsId("matriculeEmploye")
    @JoinColumn(name= "matri_emp" , referencedColumnName = "matri_emp")
    private Employe employe;
    @Column(name = "date_pres")
    private Date datePresence;

    public Presence() {
    }

    public Presence(PresencePK id, Poste poste, Employe employe, Date datePresence) {
        this.id = id;
        this.poste = poste;
        this.employe = employe;
        this.datePresence = datePresence;
    }

    public PresencePK getId() {
        return id;
    }

    public void setId(PresencePK id) {
        this.id = id;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Date getDatePresence() {
        return datePresence;
    }

    public void setDatePresence(Date datePresence) {
        this.datePresence = datePresence;
    }

}
