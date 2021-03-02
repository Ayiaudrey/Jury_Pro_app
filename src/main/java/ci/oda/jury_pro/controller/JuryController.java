package ci.oda.jury_pro.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ci.oda.jury_pro.Entity.Jury;
import ci.oda.jury_pro.Services.JuryService;


@RestController
public class JuryController {
 
    @Autowired
    private JuryService juryService;
    private Jury jury;

    @GetMapping("/jury")
    public List<Jury> getAllJury() {

        return juryService.getAllJury();
    }


    @GetMapping("/jury/event/{event_id}")
    public List<Map<String, Object>> getAllJuryByEvent(@PathVariable long event_id) {
        return juryService.getJuryByEvents(event_id);
    }


    @GetMapping("/jury/{jury_id}")
    public Jury getJury_id(@PathVariable Long jury_id) {

        return juryService.getJury_id(jury_id);

    }

    @PostMapping("/jury")
    public ResponseEntity<?> createOrUpdateJury(@RequestBody Jury jury) {
       
		ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        
        System.out.println(jury.getJury_nom_complet());

        juryService.createOrUpdateJury(jury);
        if (juryService.createOrUpdateJury(jury)) {
            result = new ResponseEntity<>(HttpStatus.OK);
        }
        return result;
    }


    @DeleteMapping("/jury/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){

        juryService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
