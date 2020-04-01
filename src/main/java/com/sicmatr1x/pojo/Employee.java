package com.sicmatr1x.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  private Integer id;
  private String lastName;
  private String email;
  private Integer gender; // 0: female, 1:male
  private Department department;
  private Date birth;

  public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
    this.id = id;
    this.lastName = lastName;
    this.email = email;
    this.gender = gender;
    this.department = department;
    this.birth = new Date();
  }
}
