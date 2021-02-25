package ci.oda.jury_pro.Repository;

import javax.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ci.oda.jury_pro.Entity.Jury;


@Repository
public interface JuryRepository extends JpaRepository<Jury, Long> {
    
    }

