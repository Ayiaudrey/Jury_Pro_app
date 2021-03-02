package ci.oda.jury_pro.Services;

public interface VoteDTO {

    public Long getVote_candidat_id();
    public Long getJury_id();
    public Long getEvenement_id();
    public Long getCandidat_id();
    public Long getNote();
    public String getCommentaires();
    public Long getCritere_id();

    
}
