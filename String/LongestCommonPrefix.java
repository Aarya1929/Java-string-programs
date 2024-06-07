package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"apple", "ap", "ape", "april"};

        if (words == null || words.length == 0) {
            System.out.println("No common prefix.");
            return;
        }

        int len = words[0].length();
        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {
            int j = 0;
            while (j < len && j < words[i].length() && prefix.charAt(j) == words[i].charAt(j)) {
                j++;
            }
            len = j;
        }

        String commonPrefix = prefix.substring(0, len);

        if (commonPrefix.isEmpty()) {
            System.out.println("No common prefix.");
        } else {
            System.out.printf("Common prefix: %s", commonPrefix);
        }
    }
}
