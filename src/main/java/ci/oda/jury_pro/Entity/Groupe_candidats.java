package ci.oda.jury_pro.Entity;

import javax.persistence.*;

@Entity
@Table(name="groupe_candidats")

public class Groupe_candidats {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long groupe_candidats_id;
    private int groupe_id;
    private int candidat_id;

    public Groupe_candidats(Long groupe_candidats_id, int groupe_id, int candidat_id) {
        this.groupe_candidats_id = groupe_candidats_id;
        this.groupe_id = groupe_id;
        this.candidat_id = candidat_id;
    }

    public Long getGroupe_candidats_id() {
        return groupe_candidats_id;
    }

    public void setGroupe_candidats_id(Long groupe_candidats_id) {
        this.groupe_candidats_id = groupe_candidats_id;
    }

    public int getGroupe_id() {
        return groupe_id;
    }

    public void setGroupe_id(int groupe_id) {
        this.groupe_id = groupe_id;
    }

    public int getCandidat_id() {
        return candidat_id;
    }

    public void setCandidat_id(int candidat_id) {
        this.candidat_id = candidat_id;
    }
}
