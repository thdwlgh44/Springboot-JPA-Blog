package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cos.blog.model.User;

//자동으로 bean 등록이 된다.
//@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}

//JPA Naming 전략
//select * from user where username =?1 AND password =?2;
//User findByUsernameAndPassword(String username, String password);

//@Query(value = "select * from user where username =?1 AND password =?2", nativeQuery = true)
//User login(String username, String password);