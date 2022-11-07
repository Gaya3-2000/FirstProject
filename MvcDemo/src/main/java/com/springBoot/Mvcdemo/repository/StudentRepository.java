package com.springBoot.Mvcdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.Mvcdemo.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
