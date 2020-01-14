
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;


// if (Arrays.asList(vechiulTestament).contains(vechiulTestament[0])) {
//   System.out.println("corect, iar dupa " + vechiulTestament[0] + "  ce urmeaza? ");


// } else {
//     System.out.println("false");
// }

/* boolean flag = true;

         while (flag) {
         int counter = 0;
         for (int i = 0; i<vechiulTestament.length; i++) {
        System.out.println("Alege carte  " + (i+1)+ "name ");

        if (Arrays.asList(userinput).contains(vechiulTestament[i])) {
        counter++;
        System.out.println("corect, care e urmatoarea carte?");


        if (counter==vechiulTestament.length){
        flag=false;
        } else {
        System.out.println("Wrong");
        break;
        }
        }

        }



        }






         int nbooks = 5;  // number of books to generate
//creating some books


//
// String[] books = IntStream.rangeClosed(1,nbooks).mapToObj(i->"book"+i).toArray(String[]::new);

*/


public class BibleManager {


    static void VechiulTestament() {
        Scanner s = new Scanner(System.in);
        // String userinput= s.nextLine();
        System.out.println("Ati ales Vechhiul Testament pentru memorare");

        String[] vechiulTestament = new String[39];
        vechiulTestament[0] = "geneza";
        vechiulTestament[1] = "exod";
        vechiulTestament[2] = "levetic";
        vechiulTestament[3] = "numeri";
        vechiulTestament[4] = "deutereonomul";
        vechiulTestament[5] = "iosua";
        vechiulTestament[6] = "judecatori";
        vechiulTestament[7] = "rut";
        vechiulTestament[8] = "1 samuel";
        vechiulTestament[9] = "2 samuel";
        vechiulTestament[10] = "1 imparati";
        vechiulTestament[11] = "2 imparati";
        vechiulTestament[12] = "1 cronici";
        vechiulTestament[13] = "2 cronici";
        vechiulTestament[14] = "ezra";
        vechiulTestament[15] = "neemia";
        vechiulTestament[16] = "estera";
        vechiulTestament[17] = "iov";
        vechiulTestament[18] = "psalmii";
        vechiulTestament[19] = "proverbele";
        vechiulTestament[20] = "eclesiastul";
        vechiulTestament[21] = "cantarea cantarilor";
        vechiulTestament[22] = "isaia";
        vechiulTestament[23] = "ieremia";
        vechiulTestament[24] = "planerile lui ieremia";
        vechiulTestament[25] = "ezechiel";
        vechiulTestament[26] = "daniel";
        vechiulTestament[27] = "osea";
        vechiulTestament[28] = "ioel";
        vechiulTestament[29] = "amos";
        vechiulTestament[30] = "obadia";
        vechiulTestament[31] = "iona";
        vechiulTestament[32] = "mica";
        vechiulTestament[33] = "naum";
        vechiulTestament[34] = "habacuc";
        vechiulTestament[35] = "tefania";
        vechiulTestament[36] = "hagai";
        vechiulTestament[37] = "zaharia";
        vechiulTestament[38] = "maleahi";


        boolean flag = true;
        while (flag) { //outer loop
            int counter = 0; //check for total right answers
            for (int i = 0; i < vechiulTestament.length; i++) { //iterate over all books
                System.out.print("Cartea cu numarul   " + (i + 1) + " este numita: ");

                String userinput = s.nextLine();

                if (Arrays.asList(userinput).contains(vechiulTestament[i])) {
                    counter++;
                    try {
                        Thread.sleep(200);// 0.4 seconds
                    } catch (InterruptedException ex) {
                    }
                    if (counter == vechiulTestament.length) {
                        System.out.println("Corect, ati stiut toate cartile corect");
                        flag = false;
                        break;
                    }
                    System.out.println("CORECT, care este numele cartii urmatoare? ");
                    System.out.println("                            ");
                    System.out.println("                            ");
                    if (counter == vechiulTestament.length) { //in case all choices are correct
                        flag = false;
                        System.out.println("Ati stiut toate cartile corect");
                    }
                } else {
                    try {
                        Thread.sleep(800);//2000ms = 2s
                    } catch (InterruptedException ex) {
                    }
                    System.out.println("Wrong, o luam de la capat ");
                    break;//terminate inner loop
                }
            }
        }


    }

    static void NoulTestament() {

        System.out.println("Ati ales Noul Testament pentru memorare");
        Scanner s = new Scanner(System.in);
        String[] noulTestament = new String[27];

        noulTestament[0] = "matei";
        noulTestament[1] = "marcu";
        noulTestament[2] = "luca";
        noulTestament[3] = "ioan";
        noulTestament[4] = "faptele apostolilor";
        noulTestament[5] = "romani";
        noulTestament[6] = "1 corinteni";
        noulTestament[7] = "2 corinteni";
        noulTestament[7] = "galateni";
        noulTestament[8] = "efeseni";
        noulTestament[9] = "filipeni";
        noulTestament[10] = "coloseni";
        noulTestament[11] = "1 tesaloniceni";
        noulTestament[12] = "2 tesaloniceni";
        noulTestament[13] = "1 timotei";
        noulTestament[14] = "2 timotei";
        noulTestament[15] = "tit";
        noulTestament[16] = "filimon";
        noulTestament[17] = "evrei";
        noulTestament[18] = "iacov";
        noulTestament[19] = "1 petru]]";
        noulTestament[20] = "2 petru";
        noulTestament[21] = "1 ioan";
        noulTestament[22]= "2 ioan";
        noulTestament[23]="3 ioan";
        noulTestament[24] = "iuda ";
        noulTestament[25] = "apocalipsa ";


        boolean flag = true;
        while (flag) { //outer loop
            int counter = 0; //check for total right answers
            for (int i = 0; i < noulTestament.length; i++) { //iterate over all books
                System.out.print("Cartea cu numarul   " + (i + 1) + " este numita: ");
                System.out.println("                            ");
                System.out.println("                            ");
                String userinput = s.nextLine();

                if (Arrays.asList(userinput).contains(noulTestament[i])) {
                    counter++;
                    try {
                        Thread.sleep(200);// 0.4 seconds
                    } catch (InterruptedException ex) {
                    }
                    if (counter == noulTestament.length) {
                        System.out.println("Corect, ati stiut toate cartile corect");
                        flag = false;
                        break;

                    }
                    System.out.println("CORECT, care este numele cartii urmatoare? ");



                    if (counter == noulTestament.length) { //in case all choices are correct
                        flag = false;
                        System.out.println("Ati stiut toate cartile corect");
                    }
                } else {

                    try {
                        Thread.sleep(800);//2000ms = 2s
                    } catch (InterruptedException ex) {
                    }
                    System.out.println("Wrong, o luam de la capat ");


                    break;//terminate inner loop


                }
            }
        }


    }


    public static void main(String[] args) {
        System.out.println("Memorati Vechiul Testament sau Noul Testament?");
        System.out.println("Apasati 1 pentru Vechiul Testament");
        System.out.println("Apasati 2 pentru Noul Testament");

Scanner sc = new Scanner(System.in);

int input = sc.nextInt();

int vt = 1;
int nt = 2;
if (input == vt) {
    VechiulTestament();
}

if (input==2){
    NoulTestament();
}
if (input != vt && input != nt) {
    System.out.println("nu exista aceasta optiune");






}
}



    }



