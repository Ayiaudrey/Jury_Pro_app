package ci.oda.jury_pro.Entity;
import javax.persistence.*;

@Entity
@Table(name="Vote_candidats")

public class Vote_candidats {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    
    private Long vote_candidat_id;
    private Long jury_id;
    private Long evenement_id;
    private Long candidat_id;
    private String note;
    private String commentaires;
    private Long critere_id;


    public Vote_candidats() {
    }

    public Vote_candidats(Long vote_candidat_id, Long jury_id, Long evenement_id, Long candidat_id, String note,
            String commentaires, Long critere_id) {
        this.vote_candidat_id = vote_candidat_id;
        this.jury_id = jury_id;
        this.evenement_id = evenement_id;
        this.candidat_id = candidat_id;
        this.note = note;
        this.commentaires = commentaires;
        this.critere_id = critere_id;
    }

    public Long getVote_candidat_id() {
        return vote_candidat_id;
    }

    public void setVote_candidat_id(Long vote_candidat_id) {
        this.vote_candidat_id = vote_candidat_id;
    }

    public Long getJury_id() {
        return jury_id;
    }

    public void setJury_id(Long jury_id) {
        this.jury_id = jury_id;
    }

    public Long getEvenement_id() {
        return evenement_id;
    }

    public void setEvenement_id(Long evenement_id) {
        this.evenement_id = evenement_id;
    }

    public Long getCandidat_id() {
        return candidat_id;
    }

    public void setCandidat_id(Long candidat_id) {
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

    public Long getCritere_id() {
        return critere_id;
    }

    public void setCritere_id(Long critere_id) {
        this.critere_id = critere_id;
    }


   
}
