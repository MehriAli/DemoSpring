package exempleJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import exempleJpa.entity.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

}
