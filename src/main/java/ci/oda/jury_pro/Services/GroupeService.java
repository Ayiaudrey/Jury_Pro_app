package ci.oda.jury_pro.Services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ci.oda.jury_pro.Entity.Groupe;
import ci.oda.jury_pro.Repository.GroupeRepository;

@Service

public class GroupeService {
    @Autowired 
    private GroupeRepository groupeRepository;

    public List<Groupe> getAllGroupe() {
        return groupeRepository.findAll();
    }
    public Groupe getGroupe_id (Long groupe_id) {
        return groupeRepository.getOne(groupe_id);
    }


    public boolean createOrUpdateGroup(Groupe groupe){
        boolean result = false;
            try {
                if (groupe.getGroupe_id() > 0) {
                    Groupe item = groupeRepository.getOne(groupe.getGroupe_id());
                    result = true;
                    if (item == null) {
                        throw new Exception();
                    }
                }
                groupeRepository.save(groupe);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
            return result;
        }



        public void delete(Long groupe_id) {

            try {
                if (groupe_id < 0 || groupe_id == null) {
                    throw new Exception();
                }
                groupeRepository.deleteById(groupe_id);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


}
