package UI;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import model.Centrala;

import java.io.*;



public class FajlMenadzer {

    public static Centrala ucitajKorisnike(String korisnickiFajl, Centrala centrala) {
        XStream xstream = new XStream(new DomDriver());
        Centrala retVal = (Centrala)xstream.fromXML(new File(korisnickiFajl));
        return retVal;
    }

    public static void snimiKorisnike(String korisnickiFajl, Centrala centrala) {
        XStream xstream = new XStream(new DomDriver());
        String xml = xstream.toXML(centrala);
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter(korisnickiFajl));
            pw.print(xml);
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


