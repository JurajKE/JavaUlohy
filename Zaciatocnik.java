package nizka;

public class Zaciatocnik {

    //Úlohy na premenné
    // Napíš jednoduchý program kde vytvoríš 10 premenných. 3 premenným nepriraď hodnotu a 4
    // premenným priraď hodnotu. Pre zvyšné 3 premenné im priraď hodnotu z inej premennej.
    // Pre každý primitívny dátový typ vytvor dve premenné.

    double a;
    double b;
    int c;
    int d = 10;
    long e = 9;
    float f = 8;
    int g = 7;
    int i = d;
    float j = f;
    int k = g;

    //Úlohy na metódy
    //Vytvor tri jednoduché metódy:
    //metóda bude vracať String – podobne ako vo videu
    //metóda bude vracať int
    //metóda nebude vracať nič, namiesto toho bude vypisovať text na konzolu

    public static String metodaJedna(String text){
        return text;
    }

    public static int metodaDva(int i){
        return i;
    }

    public static void metodaTri(){
        System.out.println("vypisanie na konsolu");
    }

    //Zložitejšie úlohy na metódy
    //Napíš si program, ktorý ti na bude vypisovať na konzolu súčet dvoch čísel. Tieto dve čísla prídu ako
    // parametre metódy. Napíš si metódu, ktorá bude mať ten istý názov ako metóda, ktorú si vyrobil v
    // predošlej úlohe. Teraz ale bude mať tri čísla ako parametre a vypíše sa ich súčet na konzolu.

    public static void sucet(int a, int b){
        System.out.println(a + b);
    }

    public static void sucet(int g, int k, int j){
        System.out.println(g + k + j);
    }

    //Úlohy na precvičenie if-else
    //Napíš program, ktorý na konzolu vypíše, či je číslo pozitívne alebo negatívne.
    //Napíš program, ktorý by simuloval varenie omelety.
    //Napíš program, ktorý na základe čísla vypíše na konzolu názov dňa. 1 = Pondelok .
    //Napíš, ktoré z troch čísel je najväčšie.
    //Vypíš tri čísla na konzolu od najmenšieho po najväčšie.
    //Napíš program kde máš číslo. Ak číslo bude deliteľné číslom 3, tak na výpise konzoly bude
    // text Fizz ak bude deliteľné číslom 5, tak na výpise bude text Buzz. Ak bude číslo zároveň
    // deliteľné 3 a aj 5, tak vypíš FizzBuzz.

    public static void positiveNegative(int a){
        if (a < 0){
            System.out.println("cislo je negativne");
        }else if (a == 0){
            System.out.println("cislo je rovne nule");
        }else {
            System.out.println("cislo je pozitivne");
        }
    }

    public static void omeleta(Object vajcia){
        if (vajcia != null){
            System.out.println("Vajcia mame pripravene");
        }else {
            System.out.println("Nemame vajcia je potrebne ist do obchodu");
        }

        //TODO
    }


    public static void cisloDen(int number){
      if (number == 1){
          System.out.println("Je pondelok");
      }else if (number == 2){
          System.out.println("Je utorok");
      }else if (number == 3){
          System.out.println("Je streda");
      }else if (number == 4){
          System.out.println("Je stvrtok");
      }else if (number == 5){
          System.out.println("Je piatok");
      }else if (number == 6){
          System.out.println("Je sobota");
      }else if (number == 7){
          System.out.println("Je nedela");
      }else {
          System.out.println("Zadali ste nespravne cislo");
      }
    }

    public static void ktoreJeVacsie(int a, int b, int c){
        if (a >b && a > c){
                System.out.println("najvacsie je" +a);
        } else if (b > a && b > c){
            System.out.println("najvcasie je " +b);
        }else {
            System.out.println("najvacsie je " +c);
        }
    }

    public static void najvacsieNajmensie(int a, int b, int c){
        if (a > b && a > c){
            if (b > c){
                System.out.println(a +" ," +b +" ," +c);
            }else {
                System.out.println(a +" ," +c +" ," +b);
            }
        }else if (b > a && b > c){
            if (a > c){
                System.out.println(b +" ," +a +" ," +c);
            }else {
                System.out.println(b +" ," +c +" ," +a);
            }
        }else {
            if (b > a){
                System.out.println(c +" ," +b +" ," +a);
            }else {
                System.out.println(c +" ," +a +" ," +b);
            }
        }
    }

    public static void delenie(int a){
        if (a % 3 == 0 && a % 5 == 0){
            System.out.println("FizzBuzz");
        }else if (a % 5 == 0){
            System.out.println("Buzz");
        }else if (a % 3 == 0){
            System.out.println("Fizz");
        }else {
            System.out.println("fujky fuj");
        }
    }


    //Úlohy na While a do while cyklus
    //Použitím cyklu while vypíš na konzolu čísla od 1 do 10.
    //Na konzolu vypíš všetky párne čísla od 1 do 100.
    //Na konzolu vypíš všetky čísla deliteľné 5 od 1 do 100.
    //Maj niekoľko čísel. Na konzolu vypíš súčet párnych a súčet nepárnych čísel.
    //Napíš program, ktorý by simuloval varenie omelety. Použi príklad z if else príkladov a rozšír ho o cykly.

    public static void vypisanie(){
        int i = 1;
        while (i < 11){
            System.out.println(i);
            i++;
        }
    }

    public static void parneCisla(){
        int i = 1;
        while (i <= 100){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void delitelnePat(){
        int i = 1;
        while (i <= 100){
            if (i % 5 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void sucetParnychANeparnych(int a, int b, int c, int d){
        //TODO

    }


    //Úlohy na for cyklus
    //V tejto úlohe sa zamysli a za použitia cyklov a podmienok vypíš do konzoly takéto útvary:
    //1 2 3 4
    //1 2 3
    //1 2
    //1
    //1
    //1 2
    //1 2 3
    //1 2 3 4

    public static void cyklus(){
        for (int j = 5; j > 1; j--){
            for (int i = 1; i < j; i++){
                System.out.print(i);
            }
            System.out.println();
            if (j<=2){
                for (int k = 2; k < 6; k++) {

                    for (int l = 1; l < k; l++) {
                        System.out.print(l);
                    }
                    System.out.println();
                }
            }
        }
    }

    //Úlohy na String (práca s reťazcom)
    //Napíš metódu, ktorá vstupný String zmení na všetko veľké písmená a vypíše ho na konzolu.
    //Napíš metódu, ktorá porovná dva String parametre a na konzolu napíše true ak su rovnaké a false ak nie sú rovnaké.

    public static void velkePismena(String text){
        System.out.println(text.toUpperCase());
    }

    public static void porovnanie(String a, String b){
        if (a.equalsIgnoreCase(b)){
            System.out.println("su rovnake");
        }else {
            System.out.println("nie su rovnake");
        }
    }





    public static void main(String[] args) {
        ktoreJeVacsie(1,2,3);
        najvacsieNajmensie(2,6,9);
        delenie(9);
        positiveNegative(-2);
        sucet(1,2);
        sucet(1,2,3);
        cisloDen(5);
        vypisanie();
        parneCisla();
        delitelnePat();
        cyklus();
        velkePismena("jurajko");
        porovnanie("jurajko", "jurajko");


    }
}
