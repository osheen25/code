//program 1 : 1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
import java.util.Arrays;
import java.util.Random;

public class ShuffleArr {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			int randomIndex = rand.nextInt(arr.length);
			int temp = arr[randomIndex];
			arr[randomIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}

//program 2 : 2. Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
public class RomanToInteger {
public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int n = s.length();
        int num = romanMap.get(s.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            // bigger or smaller
            if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
                num += romanMap.get(s.charAt(i));
            } else {
                num -= romanMap.get(s.charAt(i));
            }
        }
        return num;
    }
}

//program 3 : 3. Check if the input is pangram or not.
// A Java Program to check if the given
// string is a pangram or not
public class pangran {
	static boolean checkPangram(String str) {
		Set<Character> set = new HashSet<>();
    for (char ch : str.toCharArray()) {
      //for lower case alphabets
			if (ch >= 'a' && ch <= 'z')
				set.add(ch);
      //for upper case alphabets
      if (ch >= 'A' && ch <= 'Z') {
				// convert to lowercase
				ch = Character.toLowerCase(ch);
				set.add(ch);
			}
		}

		// check if the size is 26 or not
		return set.size() == 26;
	}
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		if (checkPangram(str))
			System.out.println("It is a Pangram");
		else
			System.out.println("It is Not a Pangram");
	}
}

