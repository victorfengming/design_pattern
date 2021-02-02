package com.atguigu.principle.ocp;

/**
 * ClassName: ocp <br/>
 * Description: ocp <br/>
 * Date: 2021-02-02 8:48 <br/>
 * <br/>
 *
 * @author yufengming
 * @version 产品版本信息 2021年02月02日8:48分 yufengming(yufengming@travelsky.com) 新建<br/>
 * <p>
 * 修改记录
 * @email yufengming@travelsky.com
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

    }
}

/*
 * 这是一个用于绘图的类
 * */
class GraphicEditor {
    // 接收shape对象,然后根据type,来绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }else if (s.m_type == 3) {
            drawTriangle(s);
        }

    }

    // 沪指矩形
    public void drawRectangle(Shape r) {
        System.out.println("矩形");
    }

    // 绘制原型
    public void drawCircle(Shape r) {
        System.out.println("原形");
    }

    // 沪指三角形
    public void drawTriangle(Shape r) {
        System.out.println("绘制三角形");
    }
}

/*
 * 鸡肋
 * */
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}