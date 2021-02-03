package com.atguigu.principle.ocp;

/**
 * ClassName: ocp <br/>
 * Description: ocp <br/>
 * Date: 2021-02-02 8:48 <br/>
 * <br/>
 *
 * @author victor
 * @version 产品版本信息 2021年02月02日8:48分 victor(victorfm@163.com) 新建<br/>
 * <p>
 * 修改记录
 * @email victorfm@163.com
 * @project java_mode
 * @package com.atguigu.principle.ocp
 */
public class Ocp {
    public static void main(String[] args) {
        /*
         * 使用,看看存在的问题
         *
         * */
        GraphicEditor ge = new GraphicEditor();
        ge.drawShape(new Rectangle());
        ge.drawShape(new Circle());
        ge.drawShape(new Triangle());
        ge.drawShape(new Other());
        // ?
        // todo 这里怎么说就
        // 调用方还是加上了一行代码啊

    }
}

/*
 * 这是一个用于绘图的类
 * */
class GraphicEditor {
    // 这个才是真正的调用方
    public void drawShape(Shape s) {
       s.draw();
    }
}

/*
 * 鸡肋
 * */
abstract class Shape {
    int m_type;

    public abstract void draw();// 抽象方法
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        // sout`
        System.out.println("绘制矩形!");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制原型");
    }
}

class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角");
    }
}


// 新增其他图形
class Other extends Shape{

    @Override
    public void draw() {
        System.out.println("其他图形");
    }
}



