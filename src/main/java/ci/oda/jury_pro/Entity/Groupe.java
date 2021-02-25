package ci.oda.jury_pro.Entity;

import javax.persistence.*;

@Entity
@Table(name="groupe")

public class Groupe {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    
    private Long groupe_id;
    private int groupe_code;
    private String groupe_nom;
    private int evenement_id;

    public Groupe(Long groupe_id, int groupe_code, String groupe_nom, int evenement_id) {
        this.groupe_id = groupe_id;
        this.groupe_code = groupe_code;
        this.groupe_nom = groupe_nom;
        this.evenement_id = evenement_id;
    }

    public Long getGroupe_id() {
        return groupe_id;
    }

    public void setGroupe_id(Long groupe_id) {
        this.groupe_id = groupe_id;
    }

    public int getGroupe_code() {
        return groupe_code;
    }

    public void setGroupe_code(int groupe_code) {
        this.groupe_code = groupe_code;
    }

    public String getGroupe_nom() {
        return groupe_nom;
    }

    public void setGroupe_nom(String groupe_nom) {
        this.groupe_nom = groupe_nom;
    }

    public int getEvenement_id() {
        return evenement_id;
    }

    public void setEvenement_id(int evenement_id) {
        this.evenement_id = evenement_id;
    }

    public Groupe(){
        
    }
}
