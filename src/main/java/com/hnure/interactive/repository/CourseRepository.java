package com.hnure.interactive.repository;

import com.hnure.interactive.jpa.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
   // @Query("update Course set profit=a Where Course.courseId=:b");
   // @Modifying
  //  @Query("update Course c set c.profit = a where c.courseId=b")
}
