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

import ci.oda.jury_pro.Entity.Critères;
import ci.oda.jury_pro.Services.CritereService;

@CrossOrigin
@RestController
public class CritereController {
    @Autowired
    private CritereService critereService;
    private Critères critères;

    @GetMapping("/criteres")
    public List<Critères> getAllCritères() {
        return critereService.getAllCritères();
    }

    @GetMapping("/criteres/event/{even_id}")
    public List<Map<String, Object>> getAllCritereByEvent(@PathVariable long even_id) {
        return critereService.getCritereByEvents(even_id);
    }

    @GetMapping("/critères/{critere_id}")
    public Critères getCritere_id(@PathVariable Long critere_id) {

        return critereService.getCritere_id(critere_id);

    }

    @PostMapping("/critères")
    public ResponseEntity<?> createOrUpdatecritere(@RequestBody Critères critères) {
       
		ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        try {
            if (!critereService.createOrUpdatecritere(critères)){
                throw new Exception();
            }
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){

        }
        return result;
    }


    @DeleteMapping("/critere/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){

        critereService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
 

     }


     
