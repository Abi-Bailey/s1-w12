public class BlackBoxMain {
    public static void main(String[] args) {
        BlackBox b = new BlackBox();

        int result = b.findIndexofLetter("witch", "t");
        int result1 = b.findIndexofLetter("witch", "w");
        int result2 = b.findIndexofLetter("witch", "h");
        int result3 = b.findIndexofLetter("witch", "!");

        System.out.println(result + ": 2");
        System.out.println(result1 + ": 0");
        System.out.println(result2 + ": 4");
        System.out.println(result3 + ": -1");
    }
}
