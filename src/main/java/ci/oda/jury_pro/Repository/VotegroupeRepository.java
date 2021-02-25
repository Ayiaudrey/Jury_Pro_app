package ci.oda.jury_pro.Repository;

import javax.persistence.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ci.oda.jury_pro.Entity.Vote_groupes;

@Repository

public interface VotegroupeRepository extends JpaRepository<Vote_groupes, Long> {
    
    }

