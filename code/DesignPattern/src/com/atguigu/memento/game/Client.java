package com.atguigu.memento.game;

/**
 * ClassName:  <br/>
 * Description:  <br/>
 * Date: 2021-02-09 15:25 <br/>
 * @project java_mode
 * @package com.atguigu.memento.game
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("----备忘录模式--------");
        // 创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("----和boss大战之前的状态----");
        gameRole.display();
        // 把当前的状态保存caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());
        //
        System.out.println("和boss开始大战~~~");
        gameRole.setVit(30);
        gameRole.setDef(30);
        System.out.println("大战之后~~~");
        gameRole.display();

        System.out.println("大战只后,使用备忘录对象恢复到大战之前");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("恢复后的状态:");
        gameRole.display();
        /**
         * ----备忘录模式--------
         * ----和boss大战之前的状态----
         * 游戏角色当前的攻击力:100
         * 游戏角色当前的防御力:100
         * 和boss开始大战~~~
         * 大战之后~~~
         * 游戏角色当前的攻击力:30
         * 游戏角色当前的防御力:30
         * 大战只后,使用备忘录对象恢复到大战之前
         * 恢复后的状态:
         * 游戏角色当前的攻击力:100
         * 游戏角色当前的防御力:100
         *
         * Process finished with exit code 0
         */
    }
}
