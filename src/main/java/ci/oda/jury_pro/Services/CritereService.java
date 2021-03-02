package ci.oda.jury_pro.Services;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ci.oda.jury_pro.Entity.Critères;
import ci.oda.jury_pro.Repository.CritèreRepository;



@Service
public class CritereService {
    @Autowired 
    private CritèreRepository critèreRepository;


    public  List<Map<String, Object>> getCritereByEvents(Long even_id) {
        return critèreRepository.listcritereparevent(even_id);
    }
    
    public List<Critères> getAllCritères() {
        return critèreRepository.findAll();
    }
    public Critères getCritere_id (Long critere_id) {
        return critèreRepository.getOne(critere_id);
    }


    public boolean createOrUpdatecritere (Critères critères){
        boolean result = false;
            try {
                if (critères.getCritere_id() > 0) {
                    Critères item = critèreRepository.getOne(critères.getCritere_id());
                  
                    if (item == null) {
                        throw new Exception();
                    }
                    result = true;
                }

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            critèreRepository.save(critères);

            return result;
        }


        public void delete(Long critere_id) {

            try {
                if (critere_id < 0 || critere_id == null) {
                    throw new Exception();
                }
                critèreRepository.deleteById(critere_id);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        
}
