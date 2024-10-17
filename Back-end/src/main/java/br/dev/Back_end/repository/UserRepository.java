package br.dev.Back_end.repository;

import br.dev.Back_end.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<Users, Long> {
    @Override
    Optional<Users> findById(Long userID);
}
