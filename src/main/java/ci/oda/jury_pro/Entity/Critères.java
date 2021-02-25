package ci.oda.jury_pro.Entity;
import javax.persistence.*;
@Entity
@Table(name="critère")

public class Critères {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long critere_id;
    private String critere_libelle;
    private String critere_bareme;
    private Long even_id;

   

    public Critères() {
    }

    public Critères(Long critere_id, String critere_libelle, String critere_bareme, Long even_id) {
        this.critere_id = critere_id;
        this.critere_libelle = critere_libelle;
        this.critere_bareme = critere_bareme;
        this.even_id = even_id;
    }

    public Long getCritere_id() {
        return critere_id;
    }

    public void setCritere_id(Long critere_id) {
        this.critere_id = critere_id;
    }

    public String getCritere_libelle() {
        return critere_libelle;
    }

    public void setCritere_libelle(String critere_libelle) {
        this.critere_libelle = critere_libelle;
    }

    public String getCritere_bareme() {
        return critere_bareme;
    }

    public void setCritere_bareme(String critere_bareme) {
        this.critere_bareme = critere_bareme;
    }

    public Long getEven_id() {
        return even_id;
    }

    public void setEven_id(Long even_id) {
        this.even_id = even_id;
    }

    

}
