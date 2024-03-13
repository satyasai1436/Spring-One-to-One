package in.satya.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	private String passportNum;
	private LocalDate issued;
	private LocalDate expired;
	
	
	@OneToOne
	@JoinColumn(name="emo_id")
	private Emp2 emp;


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public String getPassportNum() {
		return passportNum;
	}


	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}


	public LocalDate getIssued() {
		return issued;
	}


	public void setIssued(LocalDate issued) {
		this.issued = issued;
	}


	public LocalDate getExpired() {
		return expired;
	}


	public void setExpired(LocalDate expired) {
		this.expired = expired;
	}


	public Emp2 getEmp() {
		return emp;
	}


	public void setEmp(Emp2 emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Passport [pid=" + pid + ", passportNum=" + passportNum + ", issued=" + issued + ", expired=" + expired+"]";
	}
	

}
