package com.atguigu.facade;


public class HomeTheaterFacade {
    // 定义各个子系统对象
    private TheaterLigth theaterLigth;
    private PopCorn popCorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    // 构造器
    public HomeTheaterFacade() {
        super();
        this.theaterLigth = TheaterLigth.getInstance();
        this.popCorn = PopCorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    // 操作分成4 步
    public void ready() {
        // 打开爆米花机
        popCorn.on();
        // 工作
        popCorn.play();
        // 屏幕下来
        screen.down();
        // 投影仪打开
        projector.on();
        // 立体声打开
        stereo.on();
        // DVD打开
        dvdPlayer.on();
        // 灯光调暗
        theaterLigth.dim();
    }

    // 播放
    public void play() {
        dvdPlayer.play();
    }

    // 暂停
    public void pause() {
        dvdPlayer.pause();
    }

    // 结束
    public void end() {
        // 打开爆米花机
        popCorn.off();
        // 灯光调亮
        theaterLigth.bright();
        // 屏幕上去
        screen.up();
        // 投影仪打开
        projector.off();
        // 立体声打开
        stereo.off();
        // DVD打开
        dvdPlayer.off();
    }

}
