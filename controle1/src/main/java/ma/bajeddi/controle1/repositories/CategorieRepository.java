package ma.bajeddi.controle1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.bajeddi.controle1.entities.Categorie;


@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
	List<Categorie> findByCategorie(Categorie category);
}
