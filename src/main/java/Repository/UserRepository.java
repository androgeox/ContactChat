package Repository;

import Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Long,User> {
}
