package uk.ac.cornwallcollege.james;

public class Hello {
    public static void main(String[] args) {
        int[] something = {5, 6, 2};
        String[] name = {"first second", "third fourth", "fifth sixth"};
        int spacePosition;
        String firstname;
        String lastname;
        String initials;
        String secondInitial;
        int i;
        for (i = 0; i < name.length; i++) {
            spacePosition = name[i].indexOf(' ');
            firstname = name[i].substring(0, spacePosition);
            lastname = name[i].substring(spacePosition + 1, name[i].length());
            initials = String.valueOf(name[i].charAt(0));
            secondInitial = String.valueOf(name[i].charAt(spacePosition + 1));
            initials = initials.concat(secondInitial);
            System.out.println(lastname + ' ' + firstname);
            System.out.println(initials);
        }
        something[0] = something[1] * something[2];
        System.out.println("Hello world! " + args[0] + " " + args[1]);
        System.out.println(something[0]);
    }
}
