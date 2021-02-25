package ci.oda.jury_pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.Entity.Vote_candidats;
import ci.oda.jury_pro.Services.VotecandidatService;

@RestController

public class VotecandidatController {
    @Autowired
    private VotecandidatService votecandidatService;
    private Vote_candidats vote_candidats;

    @GetMapping("/vote_candidats")
    public List<Vote_candidats> getAllVoteCand() {

        return votecandidatService.getAllVoteCand();
    }

    @GetMapping("/vote_candidats/{evenement_id}")
    public Vote_candidats getVote_candidat_id(@PathVariable Long vote_candidat_id) {

        return votecandidatService.getVote_candidat_id(vote_candidat_id);

    }

    @PostMapping("/vote_candidats")
    public ResponseEntity<?> createOrUpdateVoteCand(@RequestBody Vote_candidats vote_candidats) {
       
		ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        try {
            if (!votecandidatService.createOrUpdateVoteCand(vote_candidats)){
                throw new Exception();
            }
        }
        catch (Exception e){

        }
        return result;
    }


   
    @DeleteMapping("/votecandidat/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){

        votecandidatService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
