package in.satya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.satya.entity.Emp2;

public interface empRepo extends JpaRepository<Emp2, Integer>{
	
	
	//public void get(Integer id);

}
