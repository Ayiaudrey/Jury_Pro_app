package ci.oda.jury_pro.Repository;
import javax.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ci.oda.jury_pro.Entity.Groupe;


@Repository
public interface GroupeRepository extends JpaRepository<Groupe, Long> {
    
}

