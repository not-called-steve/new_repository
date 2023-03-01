package uk.ac.cornwallcollege.james;

public class Name {
    String first;
    String last;

    public Name (String s) {
        int pos = s.indexOf(' ');
        first = s.substring(0, pos + 1);
        last =s.substring(pos + 1);
    }

    public String getInitials() {
        String initial = first.substring(0, 1);
        return initial.concat(last.substring(0, 1));
    }

    public String reverseOrder() {
        return last + ", " + first;
    }

    @Override
    public String toString() {
        return first + " " + last;
    }
}
