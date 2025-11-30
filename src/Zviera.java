public abstract class Zviera {
    protected int vek;
    protected boolean nazive;

    public Zviera(){
        vek = 0;
        nazive = true;
    }

    public abstract int vratMaximalnuDlzkuZivota();

    public abstract Zviera interaguj(Zviera cudzieZviera);

    public void starni(){
        if(nazive == false){
            System.out.println("Zviera uz mrtve!");
        } else {
            vek++;
        }
    }

    public void zomri(){
        if(nazive == true){
            System.out.println("Zviera uz mrtve!");
        } else {
            nazive = false;
        }
    }
}
