
/*
 * User:liveGreen
 * Date: 2019/5/25
 */

package com.green.lc.service.imp;

import com.green.lc.dao.EmpDAO;
import com.green.lc.entity.Emp;
import com.green.lc.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImp implements EmpService {

    @Autowired
    private EmpDAO empDAO;

    @Override
    public Optional<Emp> findById(Long empId) {
        return empDAO.findById(empId);
    }

    @Override
    public Iterable<Emp> findAll() {
        return empDAO.findAll();
    }

    @Override
    public long count() {
        return empDAO.count();
    }

    @Override
    public void delete(Emp emp) {
        empDAO.delete(emp);
    }

    @Override
    public boolean existsById(Long empId) {
        return empDAO.existsById(empId);
    }

    @Override
    public List<Emp> findByEmpNameContaining(String empName) {
        return empDAO.findByEmpNameContaining(empName);
    }

    @Override
    public List<Emp> findByEmpNameStartingWith(String empName) {
        return empDAO.findByEmpNameStartingWith(empName);
    }

    @Override
    public List<Emp> findByEmpNameEndingWith(String empName) {
        return empDAO.findByEmpNameEndingWith(empName);
    }

    @Override
    public List<Emp> findByEmpIdGreaterThan(Long empId) {
        return empDAO.findByEmpIdGreaterThan(empId);
    }
}
