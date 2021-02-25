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

import ci.oda.jury_pro.Entity.Groupe_candidats;
import ci.oda.jury_pro.Services.GroupecandidatService;


@RestController
public class GroupecandidatController {
    @Autowired
    private GroupecandidatService groupecandidatService;
    private Groupe_candidats groupe_candidats;

    @GetMapping("/groupe_candidats")
    public List<Groupe_candidats> getAllGroupeCand() {

        return groupecandidatService.getAllGroupeCand();
    }

    @GetMapping("/groupe_candidats/{groupe_candidats_id}")
    public Groupe_candidats getGroupe_candidats_id(@PathVariable Long groupe_candidats_id) {

        return groupecandidatService.getGroupe_candidats_id(groupe_candidats_id);

    }

    @PostMapping("/groupe_candidats")
    public ResponseEntity<?> createOrUpdateGroupCand(@RequestBody Groupe_candidats groupe_candidats) {
       
		ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        try {
            if (!groupecandidatService.createOrUpdateGroupCand(groupe_candidats)){
                throw new Exception();
            }
            
        }
        catch (Exception e){

        }
        return result;
    }


    @DeleteMapping("/groupecandidat/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){

        groupecandidatService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
 
}
