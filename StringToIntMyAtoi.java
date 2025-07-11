public class StringToIntMyAtoi {

    public int myAtoi(String s) {
        if (s==null) return 0;

        s = s.trim();

        if (s.length()==0) return 0;

        int sign = +1;
        long ans = 0;
        if(s.charAt(0) == '-') sign = -1;

        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;

        // Starting Popinter
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;

        while (i < s.length()) {
            if (s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
            ans = ans * 10 + s.charAt(i)-'0';

            // check Conditions

            if (sign == -1 && -1*ans < MIN) return MIN;
            if (sign == 1 && ans > MAX) return MAX;

            i++;
        }
        return (int)(sign*ans);
    }


    public static void main(String[] args) {
        StringToIntMyAtoi converter = new StringToIntMyAtoi();
        String s = "45fghjk";
        String q = "-3443fgbhvdgg4433";
        int result = converter.myAtoi(q);
        System.out.println("Result: " + result);  // Output: 45
    }


}
