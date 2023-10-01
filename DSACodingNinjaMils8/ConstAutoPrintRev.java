package DSACodingNinjaMils8;

public class ConstAutoPrintRev {
    public static void main(String[] args) {
        ConstAutoPrint s1 = new ConstAutoPrint("Arjun",22);
        System.out.println(s1.Name +" => "+s1.age);
//        System.out.println(s1.age);

        System.out.println("Auto Print");
        s1.kk();
        ConstAutoPrint s2 = new ConstAutoPrint("Neha",21);
        System.out.println(s2.Name);
        System.out.println(s2.age);

        System.out.println("Auto s2 Print");
        s2.kk();
    }
}
