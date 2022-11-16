package day15arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnCokKarakterHangisi {

    public static void main(String[] args) {

        String str = "Java ogrenemek cok guzel";

        List<String> list = new ArrayList<>(List.of(str.split("")));
        Collections.sort(list);
        System.out.println(list);

        int counter = 0;
        int sayac = 0;

        int maxKrt = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1).equals(list.get(i))) {
                counter++;
            }else {
                counter++;
                maxKrt = Math.max(counter, maxKrt);
                counter=0;
            }
        }

        System.out.println("maxKrt = " + maxKrt);
        System.out.println("counter = " + counter);

        String str1 = "";
        for (int i = 1; i < list.size(); i++) {

            if (list.get(i-1).equals(list.get(i))) {
                if(sayac == maxKrt){
                    System.out.print(list.get(i-1));
                    str1+=list.get(i-1);
                    break;
                }
                sayac++;
            }
        }
        System.out.println();
        System.out.println("En cok tekrarlanan karakter = " + str1);

    }
}
