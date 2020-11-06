package Utilities;

import java.io.FileNotFoundException;

public class Test {

    public static void main(String args[]) throws FileNotFoundException {
        Utilities utilities = new Utilities();
        System.out.println(utilities.removeSpecialCaractersFromText("455151020.2122..15qweqeqwe"));
       /* Parser parser = new Parser("src/main/java/DataSource/urls.json");
        List<URLs> user = parser.getObjectsFromJson(URLs.class);
        System.out.println(user.get(0).getHome());
        */

    }
}
