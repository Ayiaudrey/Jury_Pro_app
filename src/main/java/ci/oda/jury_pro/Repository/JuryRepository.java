package ci.oda.jury_pro.Repository;

import javax.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.jpa.repository.Query;

import ci.oda.jury_pro.Entity.Jury;

@CrossOrigin
@Repository
public interface JuryRepository extends JpaRepository<Jury, Long> {
@Query(value = "SELECT * FROM jury,evenements WHERE evenements.evenement_id=jury.event_id AND jury.event_id=:id",nativeQuery=true)
List<Map<String, Object>> listJuryparEvent(@Param("id") Long id );
    
    }

