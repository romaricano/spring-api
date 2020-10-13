package com.projet.grh.models.pk;
import com.projet.grh.models.Employe;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PresencePK implements Serializable {
    private int idPoste;
    private String matriculeEmploye;

    public int getIdPoste() {
        return idPoste;
    }

    public void setIdPoste(int idPoste) {
        this.idPoste = idPoste;
    }

    public String getMatriculeEmploye() {
        return matriculeEmploye;
    }

    public void setMatriculeEmploye(String matriculeEmploye) {
        this.matriculeEmploye = matriculeEmploye;
    }

    public PresencePK() {
    }

    public PresencePK(int idPoste, String matriculeEmploye) {
        this.idPoste = idPoste;
        this.matriculeEmploye = matriculeEmploye;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PresencePK)) return false;
        PresencePK that = (PresencePK) o;
        return getIdPoste() == that.getIdPoste() &&
                Objects.equals(getMatriculeEmploye(), that.getMatriculeEmploye());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPoste(), getMatriculeEmploye());
    }
}
