package com.projet.grh.models;

import javax.persistence.*;

@Entity
@Table(name = "periode_essai")
public class PeriodeEssaie {
    @Id
    @GeneratedValue
    @Column(name = "id_periode_essai")
    private int idPeriode;
    @Column(name = "lib_periode")
    private String libellePeriode;

    public PeriodeEssaie() {
    }

    public PeriodeEssaie(int idPeriode, String libellePeriode) {
        this.idPeriode = idPeriode;
        this.libellePeriode = libellePeriode;
    }

    public int getIdPeriode() {
        return idPeriode;
    }

    public void setIdPeriode(int idPeriode) {
        this.idPeriode = idPeriode;
    }

    public String getLibellePeriode() {
        return libellePeriode;
    }

    public void setLibellePeriode(String libellePeriode) {
        this.libellePeriode = libellePeriode;
    }
}
