package ci.oda.jury_pro.Services;

import java.util.List;
import ci.oda.jury_pro.Entity.Evenements;

public interface IEvenements {
    public Long getEvenement_id();
    public String getEvenement_nom();
    public String getEvenement_type();
    public String getEvenement_date_debut();
    public String getEvenement_date_fin();
    public Long getParticipant();
    public byte[] getEvenement_photo();

    
}
