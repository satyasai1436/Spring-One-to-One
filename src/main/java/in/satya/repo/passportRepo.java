package in.satya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.satya.entity.Passport;

public interface passportRepo extends JpaRepository<Passport, Integer>{

}
