## 类图—泛化关系(generalization） {#generalization}

*   泛化关系实际上就是继承关系，他是依赖关系的特例

public abstract class DaoSupport{ public void save(Object entity){

}

public void delete(Object id){

}

}

public class PersonServiceBean extends Daosupport{

}

*   对应的类图
*   小结:

1.  泛化关系实际上就是继承关系
2.  如果 A 类继承了 B 类，我们就说 A 和 B 存在泛化关系