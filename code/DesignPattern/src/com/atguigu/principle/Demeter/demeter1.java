package com.atguigu.principle.Demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Demeter1 <br/>
 * Description: Demeter1 <br/>
 * Date: 2021-02-02 9:51 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月02日9:51分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
 * @project java_mode
 * @package com.atguigu.principle.Demeter
 */
public class demeter1 {

    public static void main(String[] args) {
        /// 创建一个学校管理类 SchoolManager 对象
        SchoolManager schoolManager = new SchoolManager();
        // 输出学院的员工id 和 学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());


    }

}

// 学校总部员工
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}


// 学院员工类
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 管理学院员工
class CollegeManager {
    // 返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        // 这里我们增加了10个员工 到 list 集合
        // 模拟10个员工的数据
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    public void getAllEmployee2(CollegeManager sub) {
 /*
         * 分析问题:
         * 1. 将输出学院的员工的方法,封装到CollegeManager
         *
         * */
// 获取到学院员工
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("----------------分公司员工----------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
        List<Employee> list2 = new SchoolManager().getAllEmployee();
        System.out.println("----------学校总部员工---------------");
        for (Employee employee : list2) {
            System.out.println(employee.getId());
        }

    }
}

// 学校管理类
/*
 * 这里分析一波,他的直接朋友是哪些,他的间接朋友又是哪些?
 * */
class SchoolManager {

    // 返回学校总部的员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    // 改方法完成输出学校总部和学院员工信息的方法
    void printAllEmployee(CollegeManager sub) {
        sub.getAllEmployee2(sub);
    }
}
