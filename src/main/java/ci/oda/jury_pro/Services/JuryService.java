package ci.oda.jury_pro.Services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ci.oda.jury_pro.Entity.Jury;
import ci.oda.jury_pro.Repository.JuryRepository;


@Service
public class JuryService {
    @Autowired 
    private JuryRepository juryRepository;

    
    public List<Jury> getAllJury() {
        return juryRepository.findAll();
    }

    public  List<Map<String, Object>> getJuryByEvents(Long event_id) {
        return juryRepository.listJuryparEvent(event_id);
    }


    public Jury getJury_id (Long jury_id) {
        return juryRepository.getOne(jury_id);
    }


    public boolean createOrUpdateJury(Jury jury){
        boolean result = false;
            try {
                if (jury.getJury_id() > 0) {
                    Jury item = juryRepository.getOne(jury.getJury_id());
                    
                    if (item == null) {
                        throw new Exception();
                    }
                    result = true;
                }
              
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            juryRepository.save(jury);

            return result;
        }



        public void delete(Long jury_id) {

            try {
                if (jury_id < 0 || jury_id == null) {
                    throw new Exception();
                }
                juryRepository.deleteById(jury_id);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}


