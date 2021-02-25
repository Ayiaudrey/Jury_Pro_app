package ci.oda.jury_pro.Entity;

import javax.persistence.*;

@Entity
@Table(name="jury")

public class Jury {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long jury_id;
    private String jury_nom_complet;
    private long jury_telephone;
    private String jury_email;
    private int evenement_id;
    private int jury_code;


	public Jury(Long jury_id, String jury_nom_complet, long jury_telephone, String jury_email, int evenement_id,
			int jury_code) {
		this.jury_id = jury_id;
		this.jury_nom_complet = jury_nom_complet;
		this.jury_telephone = jury_telephone;
		this.jury_email = jury_email;
		this.evenement_id = evenement_id;
		this.jury_code = jury_code;
	}


	public Long getJury_id() {
		return jury_id;
	}


	public void setJury_id(Long jury_id) {
		this.jury_id = jury_id;
	}


	public String getJury_nom_complet() {
		return jury_nom_complet;
	}


	public void setJury_nom_complet(String jury_nom_complet) {
		this.jury_nom_complet = jury_nom_complet;
	}


	public long getJury_telephone() {
		return jury_telephone;
	}


	public void setJury_telephone(long jury_telephone) {
		this.jury_telephone = jury_telephone;
	}


	public String getJury_email() {
		return jury_email;
	}


	public void setJury_email(String jury_email) {
		this.jury_email = jury_email;
	}


	public int getEvenement_id() {
		return evenement_id;
	}


	public void setEvenement_id(int evenement_id) {
		this.evenement_id = evenement_id;
	}


	public int getJury_code() {
		return jury_code;
	}


	public void setJury_code(int jury_code) {
		this.jury_code = jury_code;
	}

}
