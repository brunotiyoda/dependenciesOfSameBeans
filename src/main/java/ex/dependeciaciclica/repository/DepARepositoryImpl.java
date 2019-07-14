package ex.dependeciaciclica.repository;

import ex.dependeciaciclica.entity.DepA;
import org.springframework.context.annotation.Lazy;

public class DepARepositoryImpl {

    private final DepARepository depARepository;

    public DepARepositoryImpl(@Lazy DepARepository depARepository) {
        this.depARepository = depARepository;
    }

    public DepA save(DepA depA) {
        return depARepository.save(depA);
    }

}
