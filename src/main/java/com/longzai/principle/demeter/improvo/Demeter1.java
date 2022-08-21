package com.longzai.principle.demeter.improvo;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则注意事项和细节
 * 1)迪米特法则的核心是降低类之间的耦合
 * 2)但是注意:由于每个类都减少了不必要的依赖，因此迪米特法则只是要求降低 类间(对象间)耦合关系，并不是要求完全没有依赖关系
 */
// 客户端
public class Demeter1 {
    public static void main(String[] args) {
        // 创建一个SchoolManager 对象
        SchoolManager schoolManager=new SchoolManager();
        // 输出学院的员工id 和 学院总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

// 学校总部员工类
class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
// 学员的员工类
class  CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 管理学员员工的管理类
class CollegeManager{
    // 返回学员的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) { // 这里增加了10个员工到list
            CollegeEmployee emp=new CollegeEmployee();
            emp.setId("学员员工的id="+i);
            list.add(emp);
        }
        return list;
    }
    // 输出学院员工的信息
    public void printEmployee(){
        List<CollegeEmployee> list =getAllEmployee();
        System.out.println("-------学院员工----------");
        for (CollegeEmployee e:list) {
            System.out.println(e.getId());
        }
    }
}
// 学校的管理类

// 分析SchoolManager的直接朋友有那些 Employee  CollegeManager
// CollegeEmployee不是直接朋友而是一个陌生类 这样就违背了 迪米特法则

class SchoolManager {
    // 返回学校总部的员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++) {// 这里增加了05个员工到list
            Employee employee = new Employee();
            employee.setId("学员总部员工id" + i);
            list.add(employee);
        }
        return list;
    }

    // 该方法完成输出学校总部和学院员工信息(id)的方法
    void printAllEmployee(CollegeManager sub) {
        //分析问题
        // 1.奖输出学院的员工的方法,封装到CollegeManager
        sub.printEmployee();

        // 获取到学院总部员工的方法
        List<Employee> list2=this.getAllEmployee();
        System.out.println("----学校总部员工-----");
        for (Employee e: list2) {
            System.out.println(e.getId());
        }
    }
}