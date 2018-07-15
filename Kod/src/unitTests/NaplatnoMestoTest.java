package unitTests;

import model.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class NaplatnoMestoTest {

    @Test
    public void testDobavljajaUredjajaUspesno() {
        KontrolerRampe k = new KontrolerRampe("1");
        NaplatnoMesto nm = new NaplatnoMesto("1");
        nm.dodajUredjaj(k);
        Assertions.assertEquals(k, nm.dobaviUredjaj(TipUredjaja.KONTOLER_RAMPE));
    }

    @Test
    public void testDobavljanjaUredjajaNeuspesno() {
        NaplatnoMesto nm = new NaplatnoMesto("1");
        Assertions.assertNull(nm.dobaviUredjaj(TipUredjaja.KONTOLER_RAMPE));
    }

    @Test
    public void testBrisanjaUredjajaUklonjenog() {
        KontrolerRampe k = new KontrolerRampe("1");
        NaplatnoMesto nm = new NaplatnoMesto("1");
        nm.dodajUredjaj(k);
        nm.ukloniUredjaj("1");
        Assertions.assertNull(nm.dobaviUredjaj(TipUredjaja.KONTOLER_RAMPE));
    }
}
