## 类图—依赖关系（Dependence） {#dependence}

*   只要是在类中用到了对方，那么他们之间就存在依赖关系。如果没有对方，连编绎都通过不了。

public class PersonServiceBean { private PersonDao personDao;//类public void save(Person person){}

public IDCard getIDCard(Integer personid){} public void modify(){

Department department = new Department();

}

}

public class PersonDao{} public class IDCard{} public class Person{} public class Department{}

*   对应的类图：
*   小结

1.  类中用到了对方
2.  如果是类的成员属性
3.  如果是方法的返回类型
4.  是方法接收的参数类型
5.  方法中使用到