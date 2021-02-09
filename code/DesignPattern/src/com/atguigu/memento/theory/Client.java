package com.atguigu.memento.theory;

/**
 * ClassName:  <br/>
 * Description:  <br/>
 * Date: 2021-02-09 14:36 <br/>
 * @project java_mode
 * @package com.atguigu.memento
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("----备忘录模式----");
        //
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态#1~攻击力100");
        // 保存了当前的状态
        caretaker.add(originator.saveStateMemento());
        originator.setState("状态#2~攻击力80");
        caretaker.add(originator.saveStateMemento());
        originator.setState("状态#3~攻击力50");

        // 希望恢复到状态1
        System.out.println("当前的状态是="+originator.getState());
        // 得到第一个状态
        originator.getStateFromMemento(caretaker.get(0));
        // 将originator 的状态 恢复到状态1
        System.out.println("恢复到状态1\n当前的状态是="+originator.getState());
        System.out.println("------------------");
        /**
         * ----备忘录模式----
         * 当前的状态是=状态#3~攻击力50
         * 恢复到状态1
         * 当前的状态是=状态#1~攻击力100
         * ------------------
         *
         * Process finished with exit code 0
         */
    }
}
