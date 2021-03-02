package ci.oda.jury_pro.Repository;

import java.util.List;

import javax.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ci.oda.jury_pro.Entity.Vote_candidats;
import ci.oda.jury_pro.Services.VoteDTO;

@Repository
public interface VotecandidatRepository extends JpaRepository<Vote_candidats, Long> {

    // @Query(value = "SELECT criteres., COALESCE((SELECT vote_note FROM votes WHERE criteres.critere_id = votes.critere_id AND votes.groupe_id = ?1), 0) as vote_note, (SELECT vote_id FROM votes WHERE criteres.critere_id = votes.critere_id AND votes.groupe_id = ?1) as vote_id FROM criteres WHERE criteres.evenement_id = ?3 UNION SELECT criteres., (SELECT vote_note FROM votes WHERE criteres.critere_id = votes.critere_id AND votes.groupe_id = ?1) as vote_note, (SELECT vote_id FROM votes WHERE criteres.critere_id = votes.critere_id AND votes.groupe_id = ?1) as vote_id FROM criteres WHERE critere_id IN (SELECT critere_id FROM votes WHERE votes.groupe_id = ?1 AND votes.jury_id = ?2)", nativeQuery = true)
    // public List<VoteDTO>__findVoteByGroupeIdJuryIdAndEvenementId(Integer groupe_id, Integer jury_id, Integer evenement_id);

    @Query(value = "SELECT critère.*, COALESCE((SELECT note FROM Vote_candidats WHERE critère.critere_id = Vote_candidats.critere_id AND Vote_candidats.candidat_id = ?1), 0) as note, (SELECT vote_candidat_id FROM Vote_candidats WHERE critère.critere_id = Vote_candidats.critere_id AND Vote_candidats.candidat_id = ?1) as vote_candidat_id FROM critère WHERE critère.even_id = ?3 UNION SELECT critère.*, (SELECT note FROM Vote_candidats WHERE critère.critere_id = Vote_candidats.critere_id AND Vote_candidats.candidat_id = ?1) as note, (SELECT vote_candidat_id FROM Vote_candidats WHERE critère.critere_id = Vote_candidats.critere_id AND Vote_candidats.candidat_id = ?1) as vote_candidat_id FROM critère WHERE critere_id IN (SELECT critere_id FROM Vote_candidats WHERE Vote_candidats.candidat_id = ?1 AND Vote_candidats.jury_id = ?2)", nativeQuery = true)
    public List<VoteDTO>__findVoteByCandidatIdJuryIdAndEvenementId(Long candidat_id, Long jury_id, Long evenement_id);


    // @Query(value = "SELECT evenements.evenement_nom, groupes.nom participant_nom, groupes.media_id, SUM(votes.vote_note) as total , SUM(criteres.critere_bareme) as bareme FROM votes INNER JOIN evenements ON evenements.evenement_id = votes.evenement_id INNER JOIN groupes ON votes.groupe_id = groupes.id INNER JOIN criteres ON votes.critere_id = criteres.critere_id WHERE votes.evenement_id = ?1 GROUP BY votes.groupe_id, votes.evenement_id ORDER BY total DESC", nativeQuery = true)
    // public List<VoteResultDTO> __findGroupeVoteResultByEvenement(Integer evenement_id);

    // @Query(value = "SELECT evenements.evenement_nom, CONCAT(candidats.candidat_nom, ' ',candidats.candidat_prenom) participant_nom, candidats.media_id, SUM(votes.vote_note) as total , SUM(criteres.critere_bareme) as bareme FROM votes INNER JOIN evenements ON evenements.evenement_id = votes.evenement_id INNER JOIN candidats ON votes.candidat_id = candidats.candidat_id INNER JOIN criteres ON votes.critere_id = criteres.critere_id WHERE votes.evenement_id = ?1 GROUP BY votes.candidat_id, votes.evenement_id ORDER BY total DESC", nativeQuery = true)
    // public List<VoteResultDTO> __findCandidatVoteResultByEvenement(Integer evenement_id);
    
    }
