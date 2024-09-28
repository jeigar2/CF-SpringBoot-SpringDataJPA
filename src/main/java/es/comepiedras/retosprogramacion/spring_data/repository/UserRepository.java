package es.comepiedras.retosprogramacion.spring_data.repository;

import es.comepiedras.retosprogramacion.spring_data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
