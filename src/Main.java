import java.text.BreakIterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] masyvas1 = {1, 2, 3, 4, 5, 6};
        System.out.println(masyvas1[0]);
        System.out.println(masyvas1[1]);
        System.out.println(masyvas1[2]);
        System.out.println(masyvas1[3]);
        System.out.println(masyvas1[4]);
        System.out.println(masyvas1[5]);

        System.out.println("------------uzduotis nr 2 -------");

        int[][] masyvas2 = {
                {1, 2, 2},
                {4, 5, 6}
        };
        System.out.println(masyvas2[0][0] + " " + masyvas2[0][1] + " " + masyvas2[0][2]);
//        System.out.println(masyvas2[0][0]);
//        System.out.println(masyvas2[0][1]);
//        System.out.println(masyvas2[0][2]);
//

        /*Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.*/


        System.out.println("--------------1uzduotis------- ");

        System.out.println("labas".repeat(10));


        System.out.println("---------------2 uzduotis--------");

        /*Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9*/

        for (int i = 0; i < 10; i++) {
            System.out.println(" " + i);
        }

        System.out.println("--------------3 uzduotis -------");

        /*Sukurkite masyvą su dešimties augalų pavadinimų.*/

        String[] augalai = {"acena", "agaras", "aguona", "bengonija", "Blindė",
                "darzeline", "habera", "gludas", "lonas", "jurginas"};

        System.out.println("-------------4 uzdavinys------------");

        /*Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.*/

        System.out.println(augalai.length);

        System.out.println(augalai[0]);

        for (int i = 0; i < augalai.length; i++) {
            System.out.println(augalai[i]);
        }

        System.out.println("------------- 5uzduotis---------");
        /*Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio, ir baigiant pirmuoju.
        (atvirkščias ciklas).*/

        for (int i = augalai.length - 1; i >= 0; i--)
            System.out.println(augalai[i]);


        System.out.println("--------------6 uzdavinys ---------");

        /*Atspausdinkite kas antrą skaičių nuo 10 iki 50 (pornius);*/

        for (int b = 10; b < 50; b++) {
            if (b % 2 == 0) {
                System.out.println(b);
            }
        }
        System.out.println("------------7 uzdavinys---------");

       /* Atspausdinkite kas antrą skaičių nuo 10 iki 50. (pornius) Jei skaičius dalinasi iš 10
       be liekanos jo nespausdinkite. ( naudokite continue.) (atspausdinti visus porinus skaičius,
        išskyrus tuos kurie dalinasi iš 10 be liekanos)*/

        for (int b = 10; b <= 50; b++) {
            if (b % 2 == 0) {
                if (b % 10 == 0) {
                    continue;
                }
                System.out.println(b);
            }

        }

        System.out.println("--------------8 uzdavinys-------------");

        /*Sukurkite ciklą kuris suktųsi nuo 0 iki 20. Suskaičiuokite,
        kiek kartų kintamasis i turėjo porinę reikšmę; */
        int count = 0;
        for (int c = 0; c <= 20; c++) {
            if (c % 2 == 0) {
                count++;

            }
        }
        System.out.println(count);
        System.out.println("-----------9 uzdavinys---------");

        /*Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių trumpesnių nei 5 simboliai,
         ir kiek ilgesnių nei 7 simboliai. (du skaičiavimai)*/

        String[] augalai2 = {"acena", "agaras", "aguona", "bengonija", "Blindė",
                "darzeline", "habera", "gludas", "lonas", "jurginas"};
        System.out.println(augalai2.length);

        int count5 = 0;
        int count7 = 0;


        for (int i = 0; i < augalai2.length; i++) {
            if (augalai2[i].length() < 5) {
                count5++;

            }
            // System.out.println(augalai2);
        }
        System.out.println(count5);

        for (int i = 0; i < augalai2.length; i++) {
            if (augalai2[i].length() > 7) {
                count7++;
            }
        }
        System.out.println(count7);

        System.out.println("----------10 uzdavinys----------");

        /*Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei 5
        simboliai bet trumpesnių  nei 10 simboliai. (tarp 5 ir 10 simbolių ilgio)*/


        int count8 = 0;

        for (int i = 0; i < augalai2.length; i++) {
            if (augalai2[i].length() >= 5 && augalai2[i].length() < 10) {
                count8++;
            }
        }
        System.out.println(count8);

        System.out.println("-------------1----------------------------");


        /*Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300, atspausdinkite juos
        atskirtus tarpais ir suskaičiuokite kiek tarp jų yra didesnių už 150.  Skaičiai didesni
        nei 275 turi būti atspausdinti skliausteliuose” [ ] “.*/

        int tarpai = 0;
        for (int g = 0; g <= 300; g++) {
            int rnd = (int) (Math.random() * 301);
            if (rnd >= 150) {
                tarpai++;
                System.out.println(tarpai);

            }
            if (rnd > 275)
                System.out.println("[" + rnd + "],");
            else {
                System.out.println(rnd + ",");
            }


        }

        System.out.println("---------------2-----------------------");

        /*Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000, kurie dalijasi iš 77 be liekanos.
         Skaičius atskirkite kableliais. Po paskutinio skaičiaus kablelio neturi būti.
         */
        String kintamasis = "";

        for (int g = 0; g <= 3000; g++) {
            if (g % 77 == 0) {
                kintamasis += g + ",";

            }
        }
        System.out.println(kintamasis.substring(0, kintamasis.length() - 1));


        System.out.println("-------------3---------------");
        /*Nupieškite kvadratą iš “*”, kurio kraštines sudaro 25“*”*/


        for (int k = 1; k <= 25; k++) {
            String zvai = "*";
            for (int i = 1; i < 25; i++) {
                zvai += "*";
            }

            System.out.println(zvai);
        }

        System.out.println("---------------------------4----------------------");

        /*Prieš tai nupieštam kvadratui nupieškite istrižaines zaigzdute pakeisdami kitu simboliu*/

        for (int k = 0; k < 25; k++) {
            String zvai = "";
            for (int i = 0; i < 25; i++) {
                if (k == i) {
                    zvai += "X";
                } else {
                    zvai += "*";
                }
//                zvai += "*";
            }

            System.out.println(zvai);
        }


        System.out.println("-----------------------------------5----------------------");

        /*Metam monetą. Monetos kritimo rezultatą imituojam Math.random() funkcija, kur 0 yra herbas, o 1 - skaičius.
        Monetos metimo rezultatus išvedame į ekraną atskiroje eilutėje: “S” jeigu iškrito skaičius ir “H” jeigu herbas.
         Suprogramuokite tris skirtingus scenarijus kai monetos metimą stabdome:
         */
        //Iškritus herbui;
        //Tris kartus iškritus herbui;
        //Tris kartus iš eilės iškritus herbui;/*

        System.out.println("----------------------------------5.1---------------------");


        while (true) {
            int coin = (int) Math.round(Math.random());
            if (coin == 1) {
                System.out.println("S");
            }
            if (coin == 0) {
                System.out.println("H");
                break;
            }


        }
        System.out.println("----------------------------------5.2---------------------");
        count = 0;
        while (true) {
            int coin = (int) Math.round(Math.random());
            if (coin == 0) {
                System.out.println("H");
                count++;
            } else {
                System.out.println("S");

            }
            if (count >= 3) {
                break;
            }

        }
        System.out.println("iskrito H" + count);
        System.out.println("----------------------------------5.3---------------------");
        count = 0;
        while (true) {
            int coin = (int) Math.round(Math.random());
            if (coin == 0) {
                System.out.println("H");
                count++;
            } else {
                System.out.println("S");
                count = 0;
            }
            if (count >= 3) {
                break;
            }

        }
        System.out.println("iskrito H" + count);


        /*Kazys ir Petras žaidžia šaškėm. Petras surenka taškų kiekį nuo 10 iki 20,
        Kazys surenka taškų kiekį nuo 5 iki 25. Vienoje eilutėje išvesti žaidėjų vardus su taškų kiekiu
         ir “Partiją laimėjo: ​laimėtojo vardas​”. Taškų kiekį generuokite funkcija ​Math.random()​.
          Žaidimą laimi tas, kas greičiau surenka 222 taškus. Partijas kartoti tol,
          kol kažkuris žaidėjas pirmas surenka 222 arba daugiau taškų.
         */

        while (true){

            int kazys = 5 + (int) Math.round(Math.random() * (5 - 25);
            int petras = 10 + (int) Math.round(Math.random() * (10 - 20);
















        }

























    }
}