package ci.oda.jury_pro.Services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ci.oda.jury_pro.Entity.Evenements;
import ci.oda.jury_pro.Repository.EvenementsRepository;


@Service
public class EvenementsService {
    @Autowired 
    private EvenementsRepository evenementsRepository;

    public List<IEvenements> getNombreParticipantByEvenements() {
        return evenementsRepository.findAllWithParticipants();
    }

    
    public List<Evenements> getAllEvenements() {
        return evenementsRepository.findAll();
    }
    public Evenements getEvenement_id (Long evenement_id) {
        return evenementsRepository.findById(evenement_id).get();
    }

    
  /*   public Boolean createOrUpdateEvenement(Evenements evenement){

        Boolean result = false;

        try {
            if (evenement.getEvenementId()> 0) {
                Evenements item = evenementsRepository.getOne(evenement.getEvenementId());
            if (item == null) {
                throw new Exception("Candidats not found");
            }

            result = true;
        }
        } catch (Exception e) {
           
        }
        evenementsRepository.save(evenement);
        return result;
    }
 */






    public Boolean createOrUpdateEvenement(Evenements evenements){
        Boolean result = false;
            try {
                if (evenements.getEvenement_id() > 0) {
                    Evenements item = evenementsRepository.getOne(evenements.getEvenement_id());
                   
                    if (item == null) {
                        throw new Exception();
                    }
                    result = true;
                }
                
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            evenementsRepository.save(evenements);
            return result;
        }
 


public void delete(Long evenement_id) {

    try {
        if (evenement_id < 0 || evenement_id == null) {
            throw new Exception();
        }
        evenementsRepository.deleteById(evenement_id);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

/* public boolean delete(Evenements evenements) {
    boolean result = false;
     try {
        if (evenements.getEvenementId() < 0) {
            throw new Exception();
        }
        Evenements item = evenementsRepository.getOne(evenements.getEvenementId());
        //Evenements item = evenementsRepository.findById(evenements.getEvenementId()).get()
        if (item == null) {
            throw new Exception();
        }
        result = true;
        evenementsRepository.delete(evenements);
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
    return result; 

} */
}

