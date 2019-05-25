
/*
 * User:liveGreen
 * Date: 2019/5/25
 */

package com.green.lc.controller;

import com.green.lc.entity.Emp;
import com.green.lc.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    /**
     * 请求所有数据
     *
     * @return
     */
    @GetMapping("/emp")
    public Iterable<Emp> findAll() {
        return empService.findAll();
    }

    /**
     * 通过ID查询单个数据
     *
     * @param empId
     * @return
     */
    @GetMapping("/emp/{empId}")
    public Optional<Emp> findById(@PathVariable("empId") Long empId) {
        return empService.findById(empId);
    }

    /**
     * 获取数量
     *
     * @return
     */
    @RequestMapping(value = "/emp/count", method = RequestMethod.GET)
    public long count() {
        return empService.count();
    }

    @DeleteMapping("/emp")
    public void delete(Emp emp) {
        empService.delete(emp);
    }

    /**
     * 通过ID判断数据是否存在
     *
     * @param empId
     * @return
     */
    @GetMapping("/emp/exists/{empId}")
    public boolean existsById(@PathVariable("empId") Long empId) {
        return empService.existsById(empId);
    }

    /**
     * 根据姓名模糊查询
     *
     * @param empName
     * @return
     */
    @GetMapping(value = "/emp/like")
    public List<Emp> findByEmpNameContaining(@RequestParam("empName") String empName) {
        return empService.findByEmpNameContaining(empName);
    }

    /**
     * 模糊查询字段EmpName，字段值开始与传入的empName匹配的数据
     *
     * @param empName
     * @return
     */
    @GetMapping("/emp/startLike")
    public List<Emp> findByEmpNameStartingWith(@RequestParam("empName") String empName) {
        return empService.findByEmpNameStartingWith(empName);
    }

    /**
     * 模糊查询字段EmpName，字段值结尾与传入的empName匹配的数据
     *
     * @param empName
     * @return
     */
    @GetMapping("/emp/endLike")
    List<Emp> findByEmpNameEndingWith(@RequestParam("empName") String empName) {
        return empService.findByEmpNameEndingWith(empName);
    }

    /**
     * 获取ID大于传入值empId以上的数据
     * @param empId
     * @return
     */
    @GetMapping("/emp/{empId}/greater")
    public List<Emp> findByEmpIdGreaterThan(@PathVariable("empId") Long empId){
        return empService.findByEmpIdGreaterThan(empId);
    }

}
