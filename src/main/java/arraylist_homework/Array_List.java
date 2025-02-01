package arraylist_homework;

import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {
        ArrayList<String> seasonOfYear = new ArrayList<>();// Why (capacity 2); don't work

        String winter = new String("Winter");
        String spring = new String("Spring");
        String summer = new String("Summer");
       // String autumn = new String("Autumn");
        String autumn = "Autumn";

        seasonOfYear.add(winter);
        seasonOfYear.add(spring);
        seasonOfYear.add(summer);
        seasonOfYear.add(autumn);

        seasonOfYear.add(1, "unknownSeason");

        seasonOfYear.set(1, " \"Unknown\" is not a season");

        System.out.println(seasonOfYear);
        System.out.println(seasonOfYear.size());
        System.out.println(seasonOfYear.get(3));
        System.out.println(seasonOfYear.indexOf("Summer"));
        System.out.println(seasonOfYear.contains("Sumer"));
        System.out.println(seasonOfYear.get(1));
        System.out.println(seasonOfYear);
        System.out.println(seasonOfYear.remove(0));
        System.out.println(seasonOfYear.remove(" \"Unknown\" is not a season"));
        System.out.println(seasonOfYear);

    }
}
