import static java.lang.Math.PI;

//class lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungkeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0): "Jari-jari tidak boleh noll!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungkeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);


    }
}
