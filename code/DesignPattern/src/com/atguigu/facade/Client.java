package com.atguigu.facade;


public class Client {
    public static void main(String[] args) {
         // 直接调用就很麻烦,嗯
        //        不知道要调用谁
        // 我封装好这个Home后,我就直接调用嗯
        // 我整个影院就能够轻松控制
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();
        /*
        PopCorn ON
        PopCorn play
        Screen down
        Projector ON
        Stereo on
        DVD ON
        TheaterLigth dim
        DVD play
        DVD pause
        PopCorn off
        TheaterLigth bright
        Screen up
        Projector off
        Stereo off
        DVD off

        Process finished with exit code 0
        * */
    }
}
