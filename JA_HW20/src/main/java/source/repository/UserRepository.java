package source.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import source.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	User findByUserName(String userName);

}
