public class LengthOfLastWord {
    public int length(String string) {
        int totalLength = string.length() - 1;
        while (totalLength >= 0 && string.charAt(totalLength) != ' ') {
            totalLength--;
        }
        return string.length() - (totalLength + 1);
    }

    public static void main(String[] args) {
        Revision revision = new Revision();
        String s = "An apple is a fruit that is generally red";
        System.out.println(revision.length(s));
    }
}
