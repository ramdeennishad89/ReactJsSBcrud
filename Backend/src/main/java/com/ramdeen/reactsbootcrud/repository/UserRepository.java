package com.ramdeen.reactsbootcrud.repository;

import com.ramdeen.reactsbootcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
