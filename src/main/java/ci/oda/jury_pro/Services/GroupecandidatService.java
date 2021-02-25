package ci.oda.jury_pro.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ci.oda.jury_pro.Entity.Groupe_candidats;
import ci.oda.jury_pro.Repository.GroupecandidatRepository;

@Service
public class GroupecandidatService {
    @Autowired 
    private GroupecandidatRepository groupecandidatRepository;

    public List<Groupe_candidats> getAllGroupeCand() {
        return groupecandidatRepository.findAll();
    }
    public Groupe_candidats getGroupe_candidats_id (Long groupe_candidats_id) {
        return groupecandidatRepository.getOne(groupe_candidats_id);
    }


    public boolean createOrUpdateGroupCand(Groupe_candidats groupe_candidats){
        boolean result = false;
            try {
                if (groupe_candidats.getGroupe_candidats_id() > 0) {
                    Groupe_candidats item = groupecandidatRepository.getOne(groupe_candidats.getGroupe_candidats_id());
                    result = true;
                    if (item == null) {
                        throw new Exception();
                    }
                }
                groupecandidatRepository.save(groupe_candidats);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            return result;
        }




        public void delete(Long groupe_candidats_id) {

            try {
                if (groupe_candidats_id < 0 || groupe_candidats_id == null) {
                    throw new Exception();
                }
                groupecandidatRepository.deleteById(groupe_candidats_id);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        

}



