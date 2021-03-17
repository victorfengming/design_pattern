## 类图—实现关系（Implementation） {#implementation}

实现关系实际上就是 **A** 类实现 **B** 接口，他是依赖关系的特例

public interface PersonService { public void delete(Interger id);

}

public class PersonServiceBean implements PersonService { public void delete(Interger id){}

}

=&gt;类图

小结: