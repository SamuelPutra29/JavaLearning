package OOP;

class Laptop2{
    String pemilik;
    String merk;
    Laptop2(String pemilik, String merk) {
        this.merk = merk;
        this.pemilik = pemilik;
    }

    // membuat method untuk class laptop2
    String cekinfo(){
        return "Laptop " + merk + " milik " + pemilik;
    }


}

public class Object3 {

    public static void main(String[] args) {
        Laptop2 lpLisa = new Laptop2("Lisa", "Acer");
        System.out.println(lpLisa.cekinfo());
        Laptop2 lpAndi = new Laptop2("Andi", "Apple");
        System.out.println(lpAndi.cekinfo());
    }
}
