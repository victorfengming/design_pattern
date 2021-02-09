package com.atguigu.memento.game;

/**
 * ClassName:  <br/>
 * Description:  <br/>
 * Date: 2021-02-09 15:20 <br/>
 * @project java_mode
 * @package com.atguigu.memento.game
 */
public class GameRole {
    private int vit;
    private int def;
    //  创建一个Memento 通你这个游戏角色 当前的状态得到一个
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    // 从备忘录对象,恢复GameRole'状态
    public void recoverGameRoleFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    // 显示当前游戏角色的状态
    public void display() {
        System.out.println("游戏角色当前的攻击力:"+this.vit);
        System.out.println("游戏角色当前的防御力:"+this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
