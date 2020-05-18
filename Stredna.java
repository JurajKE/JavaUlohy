package stredna;

import java.util.Arrays;

public class Stredna {

    //Ternárny operátor
    //Napíš program, ktorý na konzolu vypíš či je číslo deliteľné dvomi alebo nie za pomoci ternárneho operátoru. Nemôžeš použiť if.
    //Napíš program, ktorý na konzolu vypíše či je číslo > ako 10, < ako 10 alebo = 10 za pomoci ternárneho operátoru v ternárnom operátore. Nemôžeš použiť if.

    public static void ternarny(int a){
        System.out.println(a % 2 == 0 ? "je delitelne dvoma" : "nieje delitelne dvoma"); ;
    }

    public static void vacsieMensieRovne(int b){
        System.out.println( b > 10 ? "je vacsie ako 10" : b < 10 ? "je mensie ako 10" : "je rovne 10");
    }

    //Switch
    //Napíš program, ktorý na základe čísla napíše hlášku. Ak 1, tak sa vypíše: Je pondelok. Ak 2, tak sa vypíše: Je utorok. A tak podobne pre všetky dni.
    // Jedine ak 6 alebo 7, tak sa vypíše: Je víkend. Ak by si mal hocičo iné, tak na konzolu napíšeš: Nezadal si dobré číslo dňa.

    public static void svitch(int i){
        switch (i){
            case 1 :
                System.out.println("Je pondelok");
                break;

            case 2 :
                System.out.println("Je utorok");
                break;

            case 3 :
                System.out.println("Je streda");
                break;
            case 4 :
                System.out.println("Je stvrtok");
                break;
            case 5 :
                System.out.println("Je piatok");
                break;
            case 6 :
                System.out.println("Je sobota");
                break;
            case 7 :
                System.out.println("Je nedela");
                break;
        }
    }

    //Polia
    //Maj dvojrozmerné pole kde vnútorné polia majú dĺžku > 5. Na konzolu vypíš prvé dve čísla z každého poľa.
    //Na konzolu vypíš súčet a násobok všetkých čísel v jednorozmernom poli.
    //Na konzolu vypíš súčet a násobok všetkých čísel v dvojrozmernom poli.

    public static void polia() {
        int[][] pole = new int[2][5];


    }

    //Enum
    //Napíš enum, ktorý bude reprezentovať dni v týždni. Potom napíš metódu, ktorá na vstup zoberie ako
    // parameter jeden element z daného enum a na konzolu pomocou switchu napíšeš, či je daný deň – deň
    // v týždni alebo je to víkend.

    //Napíš program, ktorý bude používať enum reprezentujúci svetové strany. Enum bude obsahovať skratky
    // aj celo textovú reprezentáciu strany (S, sever) a aj anglickú reprezentáciu (N, north). Takže cez
    // enum napr. SEVER sa viem dopracovať aj k S, sever, N a aj north.


    public static void enumik(Dni dni){

        switch (dni){
            case PONDELOK:
                System.out.println("je tyzden");
                break;
            case UTOROK:
                System.out.println("je tyzden");
                break;
            case STREDA:
                System.out.println("je tyzden");
                break;
            case STVRTOK:
                System.out.println("je tyzden");
                break;
            case PIATOK:
                System.out.println("je piatok");
                break;
            case SOBOTA:
                System.out.println("je vikend");
                break;
        }
        }


    //String
    //Napíš metódu, ktorej vstupný parameter bude String zložený z dvoch slov – oddelených medzerou.
    //Vstup: Jaroslav Beňo
    //Na výstupe očakávam jednorozmerné pole znakov, kde znaky budú v nasledovnom poradí:
    //Výstup: valsorraJ oňeB
    //Teda prvé slovo bude obrátene a za ním bude druhé slovo obrátene. Medzi nimi bude ponechaná čiarka.
    //Vstup: Malý medveď
    //Výstup: ýlaM ďevdem

    public static void skuskaJedna(String text){
        Character[] poleCharov = new Character[text.length()];
        for (int i = 0; i < text.length(); i++){
            poleCharov[i] = text.charAt(i);
        }
    }

    //Reťazce
    //Napíš metódu, ktorá na vstupe zoberie nejaké meno. Napríklad František Ferdinand Veľký. Metóda vypíše
    // iniciálky daného mena s bodkami – bodka nebude za posledným písmenom iniciálok. Teda v tomto prípade
    // na výstupe bude: F.F.V
    //Napíš metódu, ktorá na vstupe zoberie text. Tento text prerobí tak, že odstráni čiarky a bodky a každé
    // druhé písmeno dá ako uppercase – teda ako veľké písmeno. Napríklad slovo Jaro bude JaRo.


    public static void retazce(String text){
        String zmena;
        zmena = text.replace(',' , ' ' );
        zmena = text.replace('.' , ' ' );

        System.out.println(zmena);
    }


    public static void main(String[] args) {
        ternarny(21);
        vacsieMensieRovne(7);
        svitch(5);
        skuskaJedna("Juraj");
        enumik(Dni.SOBOTA);
        polia();
        retazce("Ahoj, volam sa Juraj.");

    }

}
