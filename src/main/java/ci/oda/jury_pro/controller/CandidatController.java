package ci.oda.jury_pro.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.Entity.Candidat;
import ci.oda.jury_pro.Services.CandidatService;


@RestController
@CrossOrigin
public class CandidatController {
    @Autowired
    private CandidatService candidatService;
    private Candidat candidat;

    @GetMapping("/candidats/event/{event_id}")
    public List<Map<String, Object>> getAllCandidatByEvent(@PathVariable long event_id) {
        return candidatService.getListeByCandidats(event_id);
    }


    @GetMapping("/candidat")
    public List<Candidat> getAllCandidat() {

        return candidatService.getAllCandidat();
    }

    @GetMapping("/candidat/{candidat_id}")
    public Candidat getCandidat_id(@PathVariable Long candidat_id) {

        return candidatService.getCandidat_id(candidat_id);

    }

    @PostMapping("/candidats")
    public ResponseEntity<?> createOrUpdateEvenement(@RequestBody  Candidat candidat) {

        //Boolean boo = false;
        

        ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

         System.out.println(candidat.getCandidat_nom());
         candidatService.createOrUpdateCandidat(candidat);
         if (candidatService.createOrUpdateCandidat(candidat)) {
             result = new ResponseEntity<>(HttpStatus.OK);
         }
         return result;
     } 
 
 /*  @PostMapping("/candidat/delete")
    public ResponseEntity<?> delete(@RequestBody Candidat candidat) {
        ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        try {
            if (!candidatService.delete(candidat)) {
                throw new Exception();
            }
            result = new ResponseEntity<>(HttpStatus.OK);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }  */


    @DeleteMapping("/candidat/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){

        candidatService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
 
}
