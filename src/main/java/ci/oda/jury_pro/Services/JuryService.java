package ci.oda.jury_pro.Services;

import java.util.List;
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
    public Jury getJury_id (Long jury_id) {
        return juryRepository.getOne(jury_id);
    }


    public boolean createOrUpdateJury(Jury jury){
        boolean result = false;
            try {
                if (jury.getJury_id() > 0) {
                    Jury item = juryRepository.getOne(jury.getJury_id());
                    result = true;
                    if (item == null) {
                        throw new Exception();
                    }
                }
                juryRepository.save(jury);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
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


