package db;

import domain.Sequence;
import org.springframework.data.repository.CrudRepository;

public interface SequenceRepository extends CrudRepository<Sequence, Long> {
}
