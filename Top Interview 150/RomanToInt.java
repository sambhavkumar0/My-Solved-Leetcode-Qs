public class RomanToInt {
    public static int romanToInt(String s) {
          int ans = 0, num = 0;
         for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

    public static int romanToInt1(String s) {
        int ans = 0, num = 0, prev = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            // Check if we need to subtract
            if (num < prev)
                ans -= num;
            else
                ans += num;
            // Update prev
            prev = num;
        }
        return ans;
    }


    public static void main(String[] args) {
        String s="III";
        int result=romanToInt(s); 
        int result1=romanToInt1(s);   
        System.out.println("the result is " + result);
        System.out.println("the second optimized result is " + result1);
    }
}
