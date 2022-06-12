package Eqn;

public class TClasses {

    // :: Count Vowel
    public int CountVowel(String s) {
        int count = 0;
        int index = s.length() - 1;
        for (int i = 0; i <= index; i++ ) {
            if (
            s.charAt(i) == 'a' ||
            s.charAt(i) == 'e' ||
            s.charAt(i) == 'i' ||
            s.charAt(i) == 'o' ||
            s.charAt(i) == 'u' ||
            s.charAt(i) == 'A' ||
            s.charAt(i) == 'E' ||
            s.charAt(i) == 'I' ||
            s.charAt(i) == 'O' ||
            s.charAt(i) == 'U'
            ) {
                count++;
            }
        }
        return count;
    }

    // :: Factorial 
    public static double Fact(int N) {
        int M = 1;
        for (int i = N; i > 1; i--) {
            M = M*i;
        }
        return M;
    }

    // :: Nth Root
    public static double thRoot(double b, int p) {
        double R = Math.pow(b, 1.0/(double)p);
        return R;
    }

    //  Advance
}