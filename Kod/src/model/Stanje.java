package model;

public abstract class Stanje {

    public abstract void signalZaPodizanje();
    public abstract void detektovanProlazakKola();
    public abstract void detektovanaPodignutaRampa();
    public abstract void detektovanaSpustenaRampa();
    public abstract void prijavljenKvar();
    public abstract void popravljenKvar();
    public abstract void exit();
}
