import controller.LoginActions;
import model.Centrala;
import model.Korisnik;
import viewer.LoginWindow;

public class Application {
    public static Application app;
    private Korisnik currentUser;

    public void setCurrentUser(Korisnik currentUser) {
        this.currentUser = currentUser;
    }

    public Korisnik getCurrentUser() {

        return currentUser;
    }

    private Application(){
    }

    public static Application getInstance(){
        if (app == null){
            app = new Application();
        }
        return app;
    }

    public static void main(String[] args){
        LoginWindow lw = new LoginWindow();
        LoginActions la = new LoginActions();
        Centrala centrala = new Centrala();
        lw.setController(la);
        la.setViewer(lw);
        la.setModel(centrala);
        lw.setVisible(true);

    }
}
