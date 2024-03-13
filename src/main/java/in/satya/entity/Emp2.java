package in.satya.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Emp2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	private String ename;
	private LocalDate   doj;
	
	
	@OneToOne(mappedBy = "emp",cascade = CascadeType.ALL)
	
	private Passport passport;


	public Integer getEid() {
		return eid;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public LocalDate getDoj() {
		return doj;
	}


	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}


	public Passport getPassport() {
		return passport;
	}


	public void setPassport(Passport passport) {
		this.passport = passport;
	}


	@Override
	public String toString() {
		return "Emp2 [eid=" + eid + ", ename=" + ename + ", doj=" + doj + ", passport=" + passport + "]";
	}


//	@Override
//	public String toString() {
//		return "Emp2 [eid=" + eid + ", ename=" + ename + ", doj=" + doj + ", passport=" + passport + "]";
//	}
	
	

}
