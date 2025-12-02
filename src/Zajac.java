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
        if(cudzieZviera instanceof Zajac){
            if(this.vek > dospelost && cudzieZviera.vek > dospelost){
                System.out.println("Z: mnozim sa");
                Zajac zajac = new Zajac();
                return zajac;
            } else {
                System.out.println("Z: vek dospelosti este ne je");
                return null;
            }
        }

        return null;
    }


}
