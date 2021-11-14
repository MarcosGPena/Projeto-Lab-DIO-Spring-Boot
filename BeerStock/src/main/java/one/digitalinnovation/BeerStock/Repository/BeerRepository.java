package one.digitalinnovation.BeerStock.Repository;

import one.digitalinnovation.BeerStock.Entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BeerRepository extends JpaRepository<Beer, Long> {

   Beer findById(long id);


}
