package com.green.lc.service;

import com.green.lc.entity.Emp;

import java.util.List;
import java.util.Optional;


public interface EmpService {

    Optional<Emp> findById(Long empId);

    Iterable<Emp> findAll();

    long count();

    void delete(Emp emp);

    boolean existsById(Long empId);

    List<Emp> findByEmpNameContaining(String empName);

    List<Emp> findByEmpNameStartingWith(String empName);

    List<Emp> findByEmpNameEndingWith(String empName);

    List<Emp> findByEmpIdGreaterThan(Long empId);

}
