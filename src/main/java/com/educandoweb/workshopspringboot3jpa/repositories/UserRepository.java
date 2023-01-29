package com.educandoweb.workshopspringboot3jpa.repositories;

import com.educandoweb.workshopspringboot3jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
