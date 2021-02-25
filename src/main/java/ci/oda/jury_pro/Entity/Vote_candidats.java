package ci.oda.jury_pro.Entity;
import javax.persistence.*;

@Entity
@Table(name="Vote_candidats")

public class Vote_candidats {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    
    private Long vote_candidat_id;
    private int jury_id;
    private int evenement_id;
    private int candidat_id;
    private String note;
    private String commentaires;

    public Vote_candidats(Long vote_candidat_id, int jury_id, int evenement_id, int candidat_id, String note,
            String commentaires) {
        this.vote_candidat_id = vote_candidat_id;
        this.jury_id = jury_id;
        this.evenement_id = evenement_id;
        this.candidat_id = candidat_id;
        this.note = note;
        this.commentaires = commentaires;
    }

    public Long getVote_candidat_id() {
        return vote_candidat_id;
    }

    public void setVote_candidat_id(Long vote_candidat_id) {
        this.vote_candidat_id = vote_candidat_id;
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

    public int getCandidat_id() {
        return candidat_id;
    }

    public void setCandidat_id(int candidat_id) {
        this.candidat_id = candidat_id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }
}
