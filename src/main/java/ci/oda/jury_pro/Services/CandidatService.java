package ci.oda.jury_pro.Services;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import ci.oda.jury_pro.Entity.Candidat;
import ci.oda.jury_pro.Repository.CandidatRepository;
import org.springframework.data.repository.query.Param;

@Service

public class CandidatService {
    @Autowired 
    private CandidatRepository candidatRepository; 

    
    public List<Candidat> getAllCandidat() {
        return candidatRepository.findAll();
    }

    public  List<Map<String, Object>> getListeByCandidats(Long event_id) {
        return candidatRepository.listcandidatparevent(event_id);
    }
   

    public Candidat getCandidat_id(Long candidat_id) {
        return candidatRepository.findById(candidat_id).get();
    }


   public boolean createOrUpdateCandidat(Candidat candidat){
        boolean result = false;
            try {
                if (candidat.getCandidat_id() > 0) {
                    Candidat item = candidatRepository.getOne(candidat.getCandidat_id());
                  
                    if (item == null) {
                        throw new Exception();
                    }
                    result = true;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
                candidatRepository.save(candidat);
            
            return result;
        } 


/* public boolean delete(Candidat candidat) {
    boolean result = false;
    try {
        if (candidat.getCandidatId() < 0) {
            throw new Exception();
        }
        Candidat item = candidatRepository.getOne(candidat.getCandidatId());
        if (item == null) {
            throw new Exception();
        }
        candidatRepository.delete(candidat);
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
    return result;
} */
    
 public void delete(Long candidat_id) {

    try {
        if (candidat_id < 0 || candidat_id == null) {
            throw new Exception();
        }
        candidatRepository.deleteById(candidat_id);
    } catch (Exception e) {
        e.printStackTrace();
    }
} 



}



    


