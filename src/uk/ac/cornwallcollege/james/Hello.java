package uk.ac.cornwallcollege.james;

import java.util.ArrayList;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        int[] something = {5, 6, 2};
        List <String> name = new ArrayList<>();
        name.add("first second");
        name.add("third fourth");
        name.add("fifth sixth");
        int spacePosition;
        String firstname;
        String lastname;
        String initials;
        String secondInitial;
        for (var i : name) {
            spacePosition = i.indexOf(' ');
            firstname = i.substring(0, spacePosition);
            lastname = i.substring(spacePosition + 1, i.length());
            initials = String.valueOf(i.charAt(0));
            secondInitial = String.valueOf(i.charAt(spacePosition + 1));
            initials = initials.concat(secondInitial);
            System.out.println(lastname + ' ' + firstname);
            System.out.println(initials);
        }
        something[0] = something[1] * something[2];
        System.out.println("Hello world! " + args[0] + " " + args[1]);
        System.out.println(something[0]);
    }
}
