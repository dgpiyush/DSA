package A0_BASIC;

public class Strings {

    public static void main(String[] args) {

        // Concatenation
        String firstName = "Tony";

        String lastName = "Stark";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // String Length

        String s = "Piyush Mishra";
        System.out.println(s.length());

        // charAt

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        // compare

        String name1 = "tony";
        String name2 = "tony";

        // 1 s1>s2: +ve value
        // 2 s1=s2: 0 value
        // 3 s1<s2: -ve value

        if (name1.compareTo(name2) == 0)
            System.out.println("Name1 is Equal to Name2");
        else
            System.out.println("Name1 is Not Equal to Name2");

        // substring

        String sentance = "I am Iron Man";
        String name = sentance.substring(5);
        System.out.println(name);
    }
}
