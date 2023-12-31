package leetcodehw;

public class ValidParentheses {

	public static boolean isValid(String s) {
        int length;
        do {
            length = s.length();
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        } while (length != s.length());

        return s.isEmpty();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValid("(]"));      // false
        System.out.println(isValid("()[]{}"));  // true
        System.out.println(isValid("(]"));      // false
        System.out.println(isValid("([)]"));    // false
        System.out.println(isValid("{[]}"));    // true
    
    }
        
}
