package ci.oda.jury_pro.Services;

import java.util.List;
import ci.oda.jury_pro.Entity.Candidat;

public interface ICandidat {
    public Long getCandidat_id();
    public String getCandidat_nom();
    public String getCandidat_prenom();
    public String getCandidat_email();
    public String getCandidat_telephone();
    public String getEvenement_id();
    public String getCandidat_code();
    public byte[] getEvenement_photo();

    
}
