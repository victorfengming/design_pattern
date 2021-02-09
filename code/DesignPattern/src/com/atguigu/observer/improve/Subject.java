package com.atguigu.observer.improve;



// 让这个WeathreData来实现
public interface Subject {
    public void registerObserver(Observer2 o);
    public void removeObserver(Observer2 o);
    public void notifyObservers();
}
