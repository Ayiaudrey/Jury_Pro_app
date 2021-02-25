package ci.oda.jury_pro.Entity;
import javax.persistence.*;

@Entity
@Table(name="candidat")
public class Candidat {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    
    private Long candidat_id;
    private String candidat_nom;
    private String candidat_prenom;
    private String candidat_email;
    private Long candidat_telephone;
    private Long event_id;
    @Lob
    private byte[] candidat_photo;
    private String candidat_code;
    
   
   
    public Candidat() {
    }

    public Candidat(Long candidat_id, String candidat_nom, String candidat_prenom, String candidat_email,
            Long candidat_telephone, Long event_id, byte[] candidat_photo, String candidat_code) {
        this.candidat_id = candidat_id;
        this.candidat_nom = candidat_nom;
        this.candidat_prenom = candidat_prenom;
        this.candidat_email = candidat_email;
        this.candidat_telephone = candidat_telephone;
        this.event_id = event_id;
        this.candidat_photo = candidat_photo;
        this.candidat_code = candidat_code;
    }

    public Long getCandidat_id() {
        return candidat_id;
    }

    public void setCandidat_id(Long candidat_id) {
        this.candidat_id = candidat_id;
    }

    public String getCandidat_nom() {
        return candidat_nom;
    }

    public void setCandidat_nom(String candidat_nom) {
        this.candidat_nom = candidat_nom;
    }

    public String getCandidat_prenom() {
        return candidat_prenom;
    }

    public void setCandidat_prenom(String candidat_prenom) {
        this.candidat_prenom = candidat_prenom;
    }

    public String getCandidat_email() {
        return candidat_email;
    }

    public void setCandidat_email(String candidat_email) {
        this.candidat_email = candidat_email;
    }

    public Long getCandidat_telephone() {
        return candidat_telephone;
    }

    public void setCandidat_telephone(Long candidat_telephone) {
        this.candidat_telephone = candidat_telephone;
    }

    public Long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Long event_id) {
        this.event_id = event_id;
    }

    public byte[] getCandidat_photo() {
        return candidat_photo;
    }

    public void setCandidat_photo(byte[] candidat_photo) {
        this.candidat_photo = candidat_photo;
    }

    public String getCandidat_code() {
        return candidat_code;
    }

    public void setCandidat_code(String candidat_code) {
        this.candidat_code = candidat_code;
    }

   
    
}
