package controllers;

public abstract class SubController implements Controllable, Stepable{
    MainController mainController;

    public SubController(MainController mainController) {
        this.mainController = mainController;
    }

    public MainController getMainController() {
        return mainController;
    }
}
