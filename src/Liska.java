import java.util.Random;

public class Liska extends Zviera{
    private static int dlzkaZivota = 30;
    private static int dospelost = 10;
    private static int plna_sytost = 50;
    private static int pocetZyvichLysok = 0;
    private int sytost;

    public Liska(){
        pocetZyvichLysok++;
        Random r = new Random();
        sytost = r.nextInt(plna_sytost);
    }

    @Override
    public int vratMaximalnuDlzkuZivota() {
        return dlzkaZivota;
    }

    @Override
    public Zviera interaguj(Zviera cudzieZviera) {
        return null;
    }

    @Override
    public void starni(){
        if(!nazive){
            return;
        }
        super.starni();
        sytost--;
        if(sytost == 0){
            System.out.println("L: umieram od hladu");
            zomri();
        }
    }

    @Override
    public void zomri(){
        super.zomri();
        pocetZyvichLysok--;
    }
}
