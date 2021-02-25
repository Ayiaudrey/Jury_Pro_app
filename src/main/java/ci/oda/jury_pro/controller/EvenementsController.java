package ci.oda.jury_pro.controller;

import java.util.List;

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

import ci.oda.jury_pro.Entity.Evenements;
import ci.oda.jury_pro.Services.EvenementsService;
import ci.oda.jury_pro.Services.IEvenements;


@RestController
@CrossOrigin

public class EvenementsController {
    @Autowired
    private EvenementsService evenementsService;
    private Evenements evenements;



    @GetMapping("/evenements/participant")
    public List<IEvenements> getAllEvenementParticipants() {
        return evenementsService.getNombreParticipantByEvenements();
    }

    @GetMapping("/evenement")
    public List<Evenements> getAllEvenements() {

        return evenementsService.getAllEvenements();
    }

    @GetMapping("/evenement/{evenement_id}")
    public Evenements getEvenement_id(@PathVariable Long evenement_id) {

        return evenementsService.getEvenement_id(evenement_id);
    }



    @PostMapping("/evenements")
    public ResponseEntity<?> createOrUpdateEvenement(@RequestBody Evenements evenements) {

        //Boolean boo = false;
        

        ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

         System.out.println(evenements.getEvenement_nom());
         
         evenementsService.createOrUpdateEvenement(evenements);
         if (evenementsService.createOrUpdateEvenement(evenements)) {
             result = new ResponseEntity<>(HttpStatus.OK);
         }
         return result;
     } 


        /* try {
            
            //boolean resultat = evenementService.createOrUpdate(evenement);

            if (!evenementService.createOrUpdate(evenement)) {

                //return new ResponseEntity<>(HttpStatus.OK);
                result = new ResponseEntity<>(HttpStatus.OK);
                //return result;
                System.out.println("reponse ok");
            }else{
                
                //throw new Exception("evenement pas ajouté");
                result = new ResponseEntity<>(HttpStatus.NOT_FOUND);
                //return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                System.out.println("reponse not found");

            }

            return result;
            
        } catch (Exception e) {
           e.printStackTrace();
           System.out.println("reponse bad request");
           // return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
           
        } */
        
  

  /*   @PostMapping("/evenement")
    public ResponseEntity<?> createOrUpdateEvenement(@RequestBody Evenements evenements) {
       
		ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        try {
            if (!evenementsService.createOrUpdateEvenement(evenements)){
                throw new Exception();
            }
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){

        }
        return result;
    }
 */


    /* @PostMapping("/evenement/delete")
    public ResponseEntity<?> delete(@RequestBody Evenements evenements) {
        ResponseEntity<?> result = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        try {
            if (!evenementsService.delete(evenements)){
                throw new Exception();
            }
            result = new ResponseEntity<>(HttpStatus.OK);
            evenementsService.delete(evenements);
            
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return result;
    }  */


    @DeleteMapping("/evenement/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){

        evenementsService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


     }
