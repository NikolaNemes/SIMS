package model;

public class KontrolerRampe extends Uredjaj {

    private Stanje trenutno;

    public KontrolerRampe() {
        trenutno = null;
    }

    public KontrolerRampe(String id) {
        this.tipUredjaja = TipUredjaja.KONTOLER_RAMPE;
        this.id = id;
        this.aktivan = true;
        trenutno = null;
    };

    public void iskljuciMotor() {

    }

    public void ukljuciMotorPodizanje() {

    }

    public void UkljuciMotorSpustanje() {

    }

    public void postaviNovoStanje(Stanje stanje) {
        this.trenutno.exit();
        this.trenutno = stanje;
    }

    public void signalZaPodizanje() {

    }

    public void detektovanProlazakKola() {

    }

    public void detektovanaPodignutaRampa() {

    }

    public void detektovanaSpustenaRampa() {

    }

    public void prijavljenKvar() {

    }

    public void popravljenKvar() {

    }

    public Stanje getTrenutno() {
        return trenutno;
    }

    public void setTrenutno(Stanje trenutno) {
        this.trenutno = trenutno;
    }
}
