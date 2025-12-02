import java.util.Random;

public class Plocha {
    private int sirka;
    private int vyska;
    private MiestoNaPloche[][] plocha;

    public Plocha(int sirka, int vyska){
        this.sirka = sirka;
        this.vyska = vyska;
    }

    public void vytvorPlochu(){
        plocha = new MiestoNaPloche[sirka][vyska];
    }

    public void umestniZvieraNahodne(Zviera zviera){
        Random x, y = new Random();

    }

    public void zobraz(){
        for(int j = 0; j < vyska; j++){
            for (int i = 0; i < sirka; i++){
                System.out.print(".");
            }
            System.out.println(" ");
        }
    }


}
