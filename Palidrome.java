public class Palidrome {

    public boolean isPalindrome(int x) {
            if(x<0) return false;
            int rev = 0;
            int original = x;

            while (x>0) {
                int digit = x % 10;
                x = x / 10;

                if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return false;
                rev = rev * 10 + digit;
            }
            return rev == original;

    }
}
