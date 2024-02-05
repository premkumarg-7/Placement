package Placement;

/*
Reverse a String without any Special Characters
the special characters should be on the place!
 */
public class specialArray_reversal {
    public static void main(String[] args) {
    String s="a&X#";
    System.out.println(reversal(s));
    }
    private static String reversal(String str) {
        char[] s = str.toCharArray();
        int i = 0, j = s.length - 1;
        while (i < j) {
            if (!(s[i] >= 'a' && s[i] <= 'z') && !(s[i] >= 'A' && s[i] <= 'Z')) {
                i++;
            } else if (!(s[j] >= 'a' && s[j] <= 'z') && !(s[j] >= 'A' && s[j] <= 'Z')) {
                j--;
            } else {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;

            }
        }
        return String.valueOf(s);
    }
}
