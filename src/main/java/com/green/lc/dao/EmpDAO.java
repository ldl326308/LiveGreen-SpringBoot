
/*
 * User:liveGreen
 * Date: 2019/5/25
 */

package com.green.lc.dao;

import com.green.lc.entity.Emp;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmpDAO extends CrudRepository<Emp, Long> {

    //根据ID查询数据
    Optional<Emp> findById(Long empId);

    //查询所有
    Iterable<Emp> findAll();

    //返回数量
    long count();

    //删除
    void delete(Emp emp);

    //根据empId判断是否存在
    boolean existsById(Long empId);

    // 模糊查询字段EmpName，只要EmpName字段出现了传入的值，择符合
    List<Emp> findByEmpNameContaining(String empName);

    //模糊查询字段EmpName，字段值开头与传入的empName匹配的数据
    List<Emp> findByEmpNameStartingWith(String empName);

    //模糊查询字段EmpName，字段值结尾与传入的empName匹配的数据
    List<Emp> findByEmpNameEndingWith(String empName);

    //获取ID大于传入值empId以上的数据
    List<Emp> findByEmpIdGreaterThan(Long empId);

}
