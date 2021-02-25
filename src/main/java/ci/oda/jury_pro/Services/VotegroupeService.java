package ci.oda.jury_pro.Services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ci.oda.jury_pro.Entity.Vote_groupes;
import ci.oda.jury_pro.Repository.VotegroupeRepository;


@Service
public class VotegroupeService {
    @Autowired 
    private VotegroupeRepository votegroupeRepository;

    
    public List<Vote_groupes> getAllVote_groupes() {
        return votegroupeRepository.findAll();
    }
    public Vote_groupes getVote_groupe_id (Long vote_groupe_id) {
        return votegroupeRepository.getOne(vote_groupe_id);
    }


    public boolean createOrUpdateVote_groupes(Vote_groupes vote_groupes){
        boolean result = false;
            try {
                if (vote_groupes.getVote_groupe_id() > 0) {
                    Vote_groupes item = votegroupeRepository.getOne(vote_groupes.getVote_groupe_id());
                    result = true;
                    if (item == null) {
                        throw new Exception();
                    }
                }
                votegroupeRepository.save(vote_groupes);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            return result;
        }



        public void delete(Long vote_groupe_id) {

            try {
                if (vote_groupe_id < 0 || vote_groupe_id == null) {
                    throw new Exception();
                }
                votegroupeRepository.deleteById(vote_groupe_id);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}

