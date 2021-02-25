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

import ci.oda.jury_pro.Entity.Vote_groupes;
import ci.oda.jury_pro.Services.VotegroupeService;

@RestController
public class VotegroupeController {
    
    @Autowired
    private VotegroupeService votegroupeService;
    private Vote_groupes vote_groupes;

    @GetMapping("/vote_groupes")
    public List<Vote_groupes> getAllVote_groupes() {

        return votegroupeService.getAllVote_groupes();
    }

    @GetMapping("/vote_groupes/{evenement_id}")
    public Vote_groupes getVote_groupe_id(@PathVariable Long vote_groupe_id) {

        return votegroupeService.getVote_groupe_id(vote_groupe_id);

    }

    @PostMapping("/vote_groupes")
    public ResponseEntity<?> createOrUpdateVote_groupes(@RequestBody Vote_groupes vote_groupes) {
       
		ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        try {
            if (!votegroupeService.createOrUpdateVote_groupes(vote_groupes)){
                throw new Exception();
            }
        }
        catch (Exception e){

        }
        return result;
    }

    @DeleteMapping("/votegroupe/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){

        votegroupeService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
