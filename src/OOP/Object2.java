package OOP;

class Laptop{
    // buat 3 property untuk class laptop
    String pemilik;
    String merk;
    double ukuran_layar;


    // buat 2 method untuk class laptop

    String hidupkanLaptop(){
        return  "Hidupkan Laptop";
    }
    String matikanLaptop (){
        return "Matikan Laptop";
    }
}

public class Object2 {
    public static void main(String[] args) {
         // buat object dari class laptop
        Laptop laptopAnto = new Laptop();

        // Set nilai property
        laptopAnto.pemilik = "Anto";
        laptopAnto.merk = "Asus";
        laptopAnto.ukuran_layar = 28;

        //Tampilkan property object laptop
        System.out.println(laptopAnto.pemilik);
        System.out.println(laptopAnto.merk);
        System.out.println(laptopAnto.ukuran_layar);

        //tampilkan hasil method object Laptop
        System.out.println(laptopAnto.hidupkanLaptop());
        System.out.println(laptopAnto.matikanLaptop());



    }



}
