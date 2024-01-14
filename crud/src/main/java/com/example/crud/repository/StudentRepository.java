package com.example.crud.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crud.entity.Student;;;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
