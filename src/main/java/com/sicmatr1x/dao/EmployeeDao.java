package com.sicmatr1x.dao;

import com.sicmatr1x.pojo.Department;
import com.sicmatr1x.pojo.Employee;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
  // 模拟加载数据
  private static Map<Integer, Employee> employees = null;

  @Autowired
  private DepartmentDao departmentDao;

  static {
    employees = new HashMap<>();
    employees.put(101, new Employee(101, "Tony", "test@outlook.com", 1, new Department(101, "教学部")));
    employees.put(101, new Employee(102, "Alice", "test@outlook.com", 0, new Department(102, "市场部")));
  }

  // 主键自增
  private static Integer initId = 10086;

  public void save(Employee employee) {
    if (employee.getId() == null) {
      employee.setId(initId++);
    }
    employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
    employees.put(employee.getId(), employee);
  }

  public Collection<Employee> getEmployees() {
    return employees.values();
  }

  public Employee getEmployeeById(int id) {
    return employees.get(id);
  }

  public void delete(Integer id) {
    employees.remove(id);
  }
}
