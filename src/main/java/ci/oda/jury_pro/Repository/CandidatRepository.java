package ci.oda.jury_pro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import ci.oda.jury_pro.Entity.Candidat;
import java.util.List;
import java.util.Map;

@Repository
@CrossOrigin
 
public interface CandidatRepository extends JpaRepository<Candidat, Long> {
   
@Query(value = "SELECT * FROM candidat,evenements WHERE evenements.evenement_id=candidat.event_id AND candidat.event_id=:id",nativeQuery=true)
List<Map<String, Object>> listcandidatparevent(@Param("id") Long id );
   
}