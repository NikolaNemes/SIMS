import controller.CentralWorkerActions;
import controller.LoginActions;
import viewer.CentralWorkerWindow;
import viewer.LoginWindow;

public class Application {
    public static void main(String[] args){
       /* LoginWindow lw = new LoginWindow();
        LoginActions la = new LoginActions();
        lw.setController(la);
        lw.setVisible(true);
        */
        CentralWorkerWindow cww = new CentralWorkerWindow();
        CentralWorkerActions cwa = new CentralWorkerActions();
        cww.setController(cwa);
        cww.setVisible(true);
    }
}
