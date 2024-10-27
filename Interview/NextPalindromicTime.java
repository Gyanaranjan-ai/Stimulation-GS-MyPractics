package Interview;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class NextPalindromicTime {


	    public static void main(String[] args) {
	        String currentTime = "12:21";
	        LocalTime time = LocalTime.parse(currentTime, DateTimeFormatter.ofPattern("HH:mm"));

	        LocalTime nextPalindrome = findNextPalindrome(time);
	        System.out.println("Next Palindromic Time: " + nextPalindrome.format(DateTimeFormatter.ofPattern("HH:mm")));
	    }

	    public static LocalTime findNextPalindrome(LocalTime time) {
	        while (true) {
	            time = time.plusMinutes(1); // Increment the time by one minute
	            String timeStr = time.format(DateTimeFormatter.ofPattern("HH:mm"));
	            if (isPalindrome(timeStr)) {
	                return time;
	            }
	        }
	    }

	    public static boolean isPalindrome(String s) {
	        int n = s.length();
	        for (int i = 0; i < n / 2; i++) {
	            if (s.charAt(i) != s.charAt(n - 1 - i)) {
	                return false;
	            }
	        }
	        return true;
	    }
	}


