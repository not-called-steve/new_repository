package uk.ac.cornwallcollege.james;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        List <String> name = new ArrayList<>();
        List <String> revName = new ArrayList<>();
        name.add("first second");
        name.add("third fourth");
        name.add("fifth sixth");
        int spacePosition;
        String firstname;
        String lastname;
        for (var i : name) {
            spacePosition = i.indexOf(' ');
            firstname = i.substring(0, spacePosition);
            lastname = i.substring(spacePosition + 1, i.length());
            firstname = firstname.concat(", ");
            firstname = firstname.concat(lastname);
            revName.add(firstname);
        }
        Collections.sort(revName);
        for(var i : revName) {
            System.out.println(i);
        }
    }
}
