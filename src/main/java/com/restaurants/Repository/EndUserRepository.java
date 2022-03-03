package com.restaurants.Repository;

import com.restaurants.Model.EndUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EndUserRepository extends JpaRepository<EndUser, Long> {

    Optional<EndUser> findByEmail(String email);
    Optional<EndUser> findByUsernameOrEmail(String username, String email);
    Optional<EndUser> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

}
