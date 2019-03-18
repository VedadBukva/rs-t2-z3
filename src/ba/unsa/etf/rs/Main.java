package ba.unsa.etf.rs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String recenica = "", najduza = "";
        String recenica1 = "";
        System.out.println("Unesite recenicu: ");
        Scanner unos = new Scanner(System.in);
        recenica = unos.nextLine();

        for(String rijec:recenica.split(" ")) {
            if(rijec.length()>najduza.length())
                najduza = rijec;
        }
        for(String rijec2:recenica.split(" ")) {
            if(rijec2.equals(najduza))
                rijec2 = rijec2.toUpperCase();

            recenica1 += rijec2 + " ";
        }
            System.out.println(recenica1);
    }
}
