public class StringsLoopsMain{
    public static void main(String[] args) {
        new StringsLoops();
        StringsLoops n = new StringsLoops();
        String c = n.copy("abi", 8);
        System.out.println(c);
        String d = n.interweaving("abi", "red");
        System.out.println(d);
    }
}