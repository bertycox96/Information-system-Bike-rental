package com.hnure.interactive.repository;

import com.hnure.interactive.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //User findById(Long id);
  // @Query("select u from User as u Where u.age=:a")
 //   User findByAge(@Param("a") Integer age);
   // @Query("select u from User as u Where u.age=:a order by u.age asc ,u.coins desc ")
  // Page<User> findAllByAge(Integer age , Pageable pageable);
    @Transactional
     void deleteByName(String name);
}
