package college.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import college.crud.models.User;

@Repository
public interface UsersRepository extends JpaRepository<User, String> {

}
