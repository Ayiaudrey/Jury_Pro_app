package ci.oda.jury_pro.Repository;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ci.oda.jury_pro.Entity.Evenements;
import ci.oda.jury_pro.Services.IEvenements; 
@CrossOrigin
@Repository
public interface EvenementsRepository extends JpaRepository<Evenements, Long> {
    @Query(value = "SELECT EV.*, GP.Nombre as 'Participant' FROM evenements as EV LEFT OUTER JOIN (SELECT * FROM (SELECT CA.event_id, COUNT(*) AS nombre FROM candidat as CA GROUP BY CA.event_id) AS G1 UNION SELECT * FROM (SELECT GR.evenement_id , COUNT(*) AS nombre FROM groupe as GR GROUP BY GR.evenement_id) AS G2) AS GP ON (EV.evenement_id = GP.event_id)", nativeQuery = true)

    List<IEvenements> findAllWithParticipants();

}