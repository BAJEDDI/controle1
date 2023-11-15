package ma.bajeddi.controle1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.bajeddi.controle1.entities.Article;



@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
