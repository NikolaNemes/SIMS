import controller.CentralWorkerActions;
import controller.LoginActions;
import model.Centrala;
import model.RadnaStanica;
import viewer.CentralWorkerWindow;
import viewer.LoginWindow;

public class Application {
    public static void main(String[] args){
       /* LoginWindow lw = new LoginWindow();
        LoginActions la = new LoginActions();
        lw.setController(la);
        lw.setVisible(true);
        */
        Centrala centrala = new Centrala();
        centrala.dodajRadnuStanicu(new RadnaStanica("NS", "1"));
        centrala.dodajRadnuStanicu(new RadnaStanica("BG", "2"));
        centrala.dodajRadnuStanicu(new RadnaStanica("LZN", "3"));
        CentralWorkerWindow cww = new CentralWorkerWindow(centrala);
        CentralWorkerActions cwa = new CentralWorkerActions(centrala);
        cww.setController(cwa);
        cww.setVisible(true);
    }
}
