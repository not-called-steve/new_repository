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
        for (var i : name) {
            Name cur = new Name(i);
            String reversed = cur.reverseOrder();
            revName.add(reversed);
            System.out.println(cur.getInitials());
        }
        Collections.sort(revName);
        for(var i : revName) {
            System.out.println(i);
        }
    }
}
