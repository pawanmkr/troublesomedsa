public class Miss {

    public int countMissing(String line) {
        int count =0;
        for (int i =0; i < line.length(); i++) {
            if (!Character.isDigit(line.charAt(i)) || !Character.isWhitespace(line.charAt(i)) || !Character.isLetter(line.charAt(i))) {
                System.out.println(line.charAt(i));
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }

}
