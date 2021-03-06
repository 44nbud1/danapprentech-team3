package project.akhir.danapprentechteam3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.akhir.danapprentechteam3.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByNoTelepon(String noTelepon);
	void deleteByNoTelepon(String noTelepon);
	Boolean existsByNoTelepon(String noTelepon);
	Boolean existsByEmail(String email);
	User findByEmail(String email);
	User findByEmailIgnoreCase(String email);
}
