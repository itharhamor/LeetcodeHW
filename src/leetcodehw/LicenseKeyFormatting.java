package leetcodehw;

public class LicenseKeyFormatting {

	public static String licenseKeyFormatting(String s, int k) {
        s = s.replace("-", "").toUpperCase();
        int firstGroupLength = s.length() % k;
        String result = "";

        if (firstGroupLength > 0) {
            result += s.substring(0, firstGroupLength);
            if (s.length() > firstGroupLength) {
                result += '-';
            }
        }

        for (int i = firstGroupLength; i < s.length(); i += k) {
            result += s.substring(i, i + k);
            if (i + k < s.length()) {
                result += '-';
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test case
        String s = "2-5g-3-J";
        int k = 2;
        System.out.println(licenseKeyFormatting(s, k));  // Output: "2-5G-3J"
    }
}
