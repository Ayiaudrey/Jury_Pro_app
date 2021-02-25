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

import ci.oda.jury_pro.Entity.Groupe;
import ci.oda.jury_pro.Services.GroupeService;


@RestController

public class GroupeController {
    @Autowired
    private GroupeService groupeService;
    private Groupe groupe;

    @GetMapping("/groupe")
    public List<Groupe> getAllGroupe() {

        return groupeService.getAllGroupe();
    }

    @GetMapping("/groupe/{groupe_id}")
    public Groupe getGroupe_id(@PathVariable Long groupe_id) {

        return groupeService.getGroupe_id(groupe_id);

    }

    @PostMapping("/groupe")
    public ResponseEntity<?> createOrUpdateGroup(@RequestBody Groupe groupe) {
       
		ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        try {
            if (!groupeService.createOrUpdateGroup(groupe)){
                throw new Exception();
            }
        }
        catch (Exception e){

        }
        return result;
    }



    @DeleteMapping("/groupe/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){

        groupeService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
