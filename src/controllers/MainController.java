package controllers;

import java.util.*;

public class MainController extends TimerTask implements Controllable {

    Map<ScreenState, SubController> subControllers = new HashMap<>();
    ScreenState state = ScreenState.MAIN_MENU;

    double time = 0;

    public MainController() {

    }

    public ScreenState getState() {
        return state;
    }

    public void setState(ScreenState state) {
        this.state = state;
    }

    @Override
    public void run() {
        time += 0.001;

    }

    @Override
    public void up() {
        this.getActualController().up();
    }

    @Override
    public void right() {
        this.getActualController().right();
    }

    @Override
    public void down() {
        this.getActualController().down();
    }

    @Override
    public void left() {
        this.getActualController().left();
    }

    @Override
    public void escape() {
        this.getActualController().escape();
    }

    @Override
    public void enter() {
        this.getActualController().enter();
    }

    public SubController getActualController(){
        return subControllers.get(state);
    }

    public static void main(String[] args){
        MainController mainController = new MainController();
        Timer timer = new Timer();
        timer.schedule(mainController, 0, 1000/60);
    }
}
