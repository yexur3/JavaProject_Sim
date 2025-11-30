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
        if(!nazive){
            return null;
        }
        if(cudzieZviera instanceof Liska){
            if(this.vek > dospelost && cudzieZviera.vek > dospelost){
                System.out.println("L: mnozim sa");
                Liska liska = new Liska();
                return liska;
            } else {
                System.out.println("L: vek dospelosti este ne je");
                return null;
            }
        } else if(cudzieZviera instanceof Zajac){
            if(sytost < 2 * plna_sytost / 3){
                System.out.println("L: zrijem zajca");
                cudzieZviera.zomri();
                sytost++;
            } else {
                System.out.println("L: sytost plna, nie zrijem");
            }
        }
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

    public static int getPocetZyvichLysok(){
        return pocetZyvichLysok;
    }
}
