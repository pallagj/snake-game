package controllers.menu;

import controllers.MainController;
import controllers.ScreenState;
import controllers.SubController;

public abstract class MenuController extends SubController {
    public MenuController(MainController mainController) {
        super(mainController);
    }



    @Override
    public void up(){

    }

    @Override
    public void down(){

    }

    @Override
    public void escape(){
        getMainController().setState(ScreenState.MAIN_MENU);
    }
}
