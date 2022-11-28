package cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.repository;

import cat.itacademyBarcelonactiva.s5t1n2CarreterSergio.domain.Flor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 2

@Repository
public interface FlorRepository extends JpaRepository< Flor, Integer > {
}
