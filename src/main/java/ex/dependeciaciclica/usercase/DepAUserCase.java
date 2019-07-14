package ex.dependeciaciclica.usercase;

import ex.dependeciaciclica.entity.DepA;
import ex.dependeciaciclica.repository.DepARepositoryImpl;
import org.springframework.stereotype.Service;

@Service
public class DepAUserCase {

    private final DepARepositoryImpl depARepository;

    public DepAUserCase(DepARepositoryImpl depARepository) {
        this.depARepository = depARepository;
    }

    public DepA save(DepA depA) {
        return depARepository.save(depA);
    }
}
