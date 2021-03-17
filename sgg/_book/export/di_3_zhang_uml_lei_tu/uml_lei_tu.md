## UML 类图 {#uml}

1.  用于描述系统中的类**(**对象**)**本身的组成和类**(**对象**)**之间的各种静态关系。
2.  类之间的关系：依赖、泛化（继承）、实现、关联、聚合与组合。
3.  类图简单举例

public class Person{ //代码形式-&gt;类图

private Integer id; private String name;

public void setName(String name){ this.name=name;

}

public String getName(){ return name;

}

}