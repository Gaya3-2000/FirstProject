package com.springBoot.Mvcdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.Mvcdemo.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
