package ex.dependeciaciclica.repository;

import ex.dependeciaciclica.entity.DepA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepARepository extends JpaRepository<DepA, Long> {

}
