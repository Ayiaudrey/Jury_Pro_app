package ci.oda.jury_pro.Entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="evenements")

public class Evenements {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long evenement_id;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    private String evenement_type;
    private String evenement_nom;
    private Date evenement_date_debut;
    private Date evenement_date_fin;
    @Lob
    private byte[] evenement_photo;

    public Evenements() {
    }

    public Long getEvenement_id() {
        return evenement_id;
    }

    public void setEvenement_id(Long evenement_id) {
        this.evenement_id = evenement_id;
    }

    public String getEvenement_type() {
        return evenement_type;
    }

    public void setEvenement_type(String evenement_type) {
        this.evenement_type = evenement_type;
    }

    public String getEvenement_nom() {
        return evenement_nom;
    }

    public void setEvenement_nom(String evenement_nom) {
        this.evenement_nom = evenement_nom;
    }

    public Date getEvenement_date_debut() {
        return evenement_date_debut;
    }

    public void setEvenement_date_debut(Date evenement_date_debut) {
        this.evenement_date_debut = evenement_date_debut;
    }

    public Date getEvenement_date_fin() {
        return evenement_date_fin;
    }

    public void setEvenement_date_fin(Date evenement_date_fin) {
        this.evenement_date_fin = evenement_date_fin;
    }

    public byte[] getEvenement_photo() {
        return evenement_photo;
    }

    public void setEvenement_photo(byte[] evenement_photo) {
        this.evenement_photo = evenement_photo;
    }

    public Evenements(Long evenement_id, String evenement_type, String evenement_nom, Date evenement_date_debut,
            Date evenement_date_fin, byte[] evenement_photo) {
        this.evenement_id = evenement_id;
        this.evenement_type = evenement_type;
        this.evenement_nom = evenement_nom;
        this.evenement_date_debut = evenement_date_debut;
        this.evenement_date_fin = evenement_date_fin;
        this.evenement_photo = evenement_photo;
    }

   

}
