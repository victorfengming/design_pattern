
package com.atguigu.memento.theory;
public class Memento {
    private String state;

    // 构造器
    public Memento() {
    }

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
