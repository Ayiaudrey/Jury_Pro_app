package ci.oda.jury_pro.Entity;


import javax.persistence.*;

@Entity
@Table(name="Vote_groupes")

   
public class Vote_groupes {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    
    private Long vote_groupe_id;
    private int jury_id;
    private int evenement_id;
    private int groupe_id;

    public Vote_groupes(Long vote_groupe_id, int jury_id, int evenement_id, int groupe_id) {
        this.vote_groupe_id = vote_groupe_id;
        this.jury_id = jury_id;
        this.evenement_id = evenement_id;
        this.groupe_id = groupe_id;
    }

    public Long getVote_groupe_id() {
        return vote_groupe_id;
    }

    public void setVote_groupe_id(Long vote_groupe_id) {
        this.vote_groupe_id = vote_groupe_id;
    }

    public int getJury_id() {
        return jury_id;
    }

    public void setJury_id(int jury_id) {
        this.jury_id = jury_id;
    }

    public int getEvenement_id() {
        return evenement_id;
    }

    public void setEvenement_id(int evenement_id) {
        this.evenement_id = evenement_id;
    }

    public int getGroupe_id() {
        return groupe_id;
    }

    public void setGroupe_id(int groupe_id) {
        this.groupe_id = groupe_id;
    }
}
