package in.satya.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.satya.entity.Emp2;
import in.satya.entity.Passport;
import in.satya.repo.empRepo;
import in.satya.repo.passportRepo;
@Service
public class serviceClass {
	@Autowired
	private empRepo eRepo;
	@Autowired
	private passportRepo pRepo;

	public void saveData() {

		Emp2 e = new Emp2();
		e.setEname("Satya");
		e.setDoj(LocalDate.now());

		Passport p = new Passport();
		p.setPassportNum("HQI123YTRF");
		p.setIssued(LocalDate.now().minusYears(20));
		p.setExpired(LocalDate.now().plusYears(10));

		e.setPassport(p);
		p.setEmp(e);

		eRepo.save(e);
		pRepo.save(p);
		System.out.println("Records Are Saved....");
	}
	public void get() {
		Optional<Emp2> id = eRepo.findById(1);
		if(id.isPresent()) {
			Emp2 emp2 = id.get();
			System.out.println(emp2);
			
		}else {
			System.out.println("Data is not Available");
		}	
	}
	public void delete(Integer eid) {
		eRepo.deleteById(eid);
		System.out.println("Records are Deleted....");
		
	}public void deletePassport() {
		pRepo.findById(1);
	}

}
