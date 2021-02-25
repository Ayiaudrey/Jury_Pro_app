package ci.oda.jury_pro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import ci.oda.jury_pro.Entity.Critères;
import java.util.List;
import java.util.Map;


@Repository
@CrossOrigin

public interface CritèreRepository extends JpaRepository<Critères, Long>{
@Query(value = "SELECT * FROM critère,evenements WHERE evenements.evenement_id=critère.even_id AND critère.even_id=:id",nativeQuery=true)
List<Map<String, Object>> listcritereparevent(@Param("id") Long id );
    
}
    