import controller.LoginActions;
import viewer.LoginWindow;

public class Application {
    public static void main(String[] args){
        LoginWindow lw = new LoginWindow();
        LoginActions la = new LoginActions();
        lw.setController(la);
        lw.setVisible(true);

    }
}
