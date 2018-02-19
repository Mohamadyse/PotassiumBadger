import com.sun.org.apache.xpath.internal.functions.FuncStartsWith;

import java.util.*;

public class Testtt {

    public static void main(String[] args) {
        /*String Centence = new String(" I wanna go home, take off this uniform and leave the show.");

        System.out.println(Centence.trim());
        Centence=Centence.trim();
        System.out.println(Centence);
        System.out.println(Centence.endsWith("show."));
        System.out.println(Centence.contains("ff t"));*/

        /*HashSet<Integer> phoneNumbers = new HashSet<>();

        for (int i = 1 ;i <= 90; i++){

            phoneNumbers.add((int) (Math.random() * 200 + 300));
        }
        System.out.println(phoneNumbers);

        ///////////////////////////////*/

        HashMap<String, Integer> Contacts = new HashMap<>();

        for (int k = 1; k < 10; k++){

            Contacts.put("Adam"+k , (k + 100));
            System.out.print("Adam" + k + " = " + (k+100) + ",  ");

        }

        System.out.println();
        System.out.println(Contacts);

    }



    }
