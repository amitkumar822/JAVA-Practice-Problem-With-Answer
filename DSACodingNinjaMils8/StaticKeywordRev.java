package DSACodingNinjaMils8;

public class StaticKeywordRev {
    public static void main(String[] args) {
        StaticKeyword s1 = new StaticKeyword("Rahul Kumar",22);
        s1.print();

        StaticKeyword s2 = new StaticKeyword("Neha Kumari",20);
        s2.print();


        System.out.println("Total Number of Student: ");
        System.out.println(StaticKeyword.getNumStudent());
    }
}


//public class StaticKeywordRev {
//    public static void main(String[] args) {
//        StaticKeyword s1 = new StaticKeyword("Rahul",21);
//        s1.print();
//
//        StaticKeyword s2 = new StaticKeyword("Komal",20);
//        s2.print();
//
//        System.out.println(StaticKeyword.getNumStudent());
//    }
//}
