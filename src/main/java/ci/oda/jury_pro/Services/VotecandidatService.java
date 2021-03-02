package ci.oda.jury_pro.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ci.oda.jury_pro.Entity.Vote_candidats;
import ci.oda.jury_pro.Repository.VotecandidatRepository;


@Service
public class VotecandidatService {
    @Autowired 
    private VotecandidatRepository votecandidatRepository;

public List<VoteDTO> getVoteCandidat (Long candidat_id, Long jury_id, Long evenement_id){
        return votecandidatRepository.__findVoteByCandidatIdJuryIdAndEvenementId(candidat_id, jury_id, evenement_id);
    }




    public List<Vote_candidats> getAllVoteCand() {
        return votecandidatRepository.findAll();
    }
    public Vote_candidats getVote_candidat_id (Long vote_candidat_id) {
        return votecandidatRepository.getOne(vote_candidat_id);
    }


    public boolean createOrUpdateVoteCand(Vote_candidats vote_candidat){
        boolean result = false;
            try {
                if (vote_candidat.getVote_candidat_id() > 0) {
                    Vote_candidats item = votecandidatRepository.getOne(vote_candidat.getVote_candidat_id());
                    
                    if (item == null) {
                        throw new Exception();
                    }
                    result = true;
                }
                
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            votecandidatRepository.save(vote_candidat);
            return result;
        }


        public void delete(Long vote_candidat_id) {

            try {
                if (vote_candidat_id < 0 || vote_candidat_id == null) {
                    throw new Exception();
                }
                votecandidatRepository.deleteById(vote_candidat_id);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}

