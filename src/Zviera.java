public class Zviera {
    protected int vek;
    protected boolean nazive;

    public Zviera(int vek){
        this.vek = vek;
        this.nazive = true;
    }

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
