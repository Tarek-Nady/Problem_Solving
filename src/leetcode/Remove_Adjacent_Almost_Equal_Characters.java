package leetcode;

public class Remove_Adjacent_Almost_Equal_Characters {
    public int removeAlmostEqualCharacters(String word) {
        int operations = 0;
        StringBuilder sb = new StringBuilder(word);

        int i = 0;
        while (i < sb.length() - 1) {
            if (sb.charAt(i) == sb.charAt(i + 1) || Math.abs(sb.charAt(i) - sb.charAt(i + 1)) == 1) {
                operations++;
                // Remove the two almost-equal characters
                sb.delete(i, i + 2);

            } else {
                i++;
            }
        }

        return operations;
    }
}
