package DSACodingNinjaMils8;

public class StaticKeyword {
    public String name;
    private final int rollNumber;
    private static int numStudent;

    public static int getNumStudent(){
        return numStudent;
    }


    public StaticKeyword(String name,int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        numStudent++;
    }

    public void print(){
        System.out.println(name+" : "+rollNumber);
    }
}
