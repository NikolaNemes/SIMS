import UI.FajlMenadzer;
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
        FajlMenadzer.ucitajKorisnike("korisnici.txt", centrala);
        CentralWorkerWindow cww = new CentralWorkerWindow(centrala);
        cww.setVisible(true);
    }
}
