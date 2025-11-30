public class Zajac extends Zviera{
    private int dlzkaZivota;

    public Zajac(int vek){
        super(vek);
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
