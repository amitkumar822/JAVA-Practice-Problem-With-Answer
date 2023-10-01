package UnicMethode;

public class SpecialCharacterRemove {
    public static void main(String[] args) {
        String str ="Tap@%32";
        str = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
    }
}
