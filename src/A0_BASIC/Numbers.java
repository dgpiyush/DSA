package A0_BASIC;

public class Numbers {
    // Array
    int[] arr = new int[10];

    String addChar(String str, char ch, int position) {
        return str.substring(0, position) + ch + str.substring(position);
    }

}
