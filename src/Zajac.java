public class Zajac extends Zviera{
    private static final int dlzkaZivota = 30;
    private static final int dospelost = 10;
    private static int pocetZyvichZajcov = 0;

    public Zajac(){
        pocetZyvichZajcov++;
    }

    @Override
    public int vratMaximalnuDlzkuZivota() {
        return dlzkaZivota;
    }

    @Override
    public Zviera interaguj(Zviera cudzieZviera) {
        return null;
    }


}
