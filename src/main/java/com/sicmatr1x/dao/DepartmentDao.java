package com.sicmatr1x.dao;

import com.sicmatr1x.pojo.Department;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDao {
  // 模拟加载数据
  private static Map<Integer, Department> departments = null;
  static {
    departments = new HashMap<>();
    departments.put(101, new Department(101, "教学部"));
    departments.put(101, new Department(102, "市场部"));
    departments.put(101, new Department(103, "教研部"));
    departments.put(101, new Department(104, "运营部"));
  }

  // 获得所有部门信息
  public Collection<Department> getDepartments() {
    return departments.values();
  }

  public Department getDepartmentById(int id) {
    return departments.get(id);
  }

}
