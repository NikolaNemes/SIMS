package unitTests;

import model.NaplatnoMesto;
import model.RadnaStanica;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadnaStanicaTest {

    @Test
    public void pronadjiNaplatnoMestoUspesno() {
        RadnaStanica rs = new RadnaStanica("Novi Sad", "1");
        NaplatnoMesto nm = new NaplatnoMesto("1");
        rs.getNaplatnaMesta().add(nm);
        Assertions.assertEquals(nm, rs.pronadjiNaplatnoMesto("1"));
    }

    @Test
    public void pronadjiNaplatnoMestoNeuspesno() {
        RadnaStanica rs = new RadnaStanica("Novi Sad", "1");
        Assertions.assertNull(rs.pronadjiNaplatnoMesto("1"));
    }

    @Test
    public void pronadjiNaplatnoMestoIzbrisano() {
        RadnaStanica rs = new RadnaStanica("Novi Sad", "1");
        NaplatnoMesto nm = new NaplatnoMesto("1");
        nm.setAktivno(false);
        rs.getNaplatnaMesta().add(nm);
        Assertions.assertNull(rs.pronadjiNaplatnoMesto("1"));
    }


}
