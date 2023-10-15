package OOP;

class Drone{
    // Antribut untuk class drone
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;

    //method
    void terbang(){
        energi--;
        if(energi>10){
            // terbang berarti nilai ketinggian bertambah
            ketinggian++;
            System.out.println("Drone terbang...");
        }
        else{
            System.out.println("Energi lemah:Drone tidak bisa terbang");
        }
    }

    void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
        }
        else {
            System.out.println("Mesin dimatikan");
        }
    }

    void turun(){
        // ketinggian berkurang, karena turun
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }

    void belok(){
        energi--;
        System.out.println("Drone belok");
    }

    void maju(){
        energi--;
        System.out.println("Drone maju ke depan");
        kecepatan++;
    }

    void mundur(){
        energi--;
        System.out.println("Drone mundur");
        kecepatan++;
    }
}


public class object4 {
    public static void main(String[] args) {
        //membuat object drone
        Drone dr = new Drone();

        // mengisi atribut drone
        dr.energi = 50;
        dr.kecepatan = 10;
        dr.ketinggian = 20;
        dr.merek = "Apple";

        // menjalakan method
        dr.maju();
        dr.matikanMesin();


        /*
           int energi;
    int ketinggian;
    int kecepatan;
    String merek;
         */

    }
}
