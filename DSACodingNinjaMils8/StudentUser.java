package DSACodingNinjaMils8;

import java.util.Scanner;
//this class use Student Property;
public class StudentUser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student s1 = new Student();
        s1.Name= "Deeju";
        s1.RollNo = 23;
        Student s2 = new Student();
        s2.Name = "Amit";
        s2.RollNo = 55;

        System.out.println("Name : "+s1.Name);
        System.out.println("Roll No : "+s1.RollNo);
        System.out.println("Name : "+s2.Name);
        System.out.println("Roll No : "+s2.RollNo);
        System.out.println(s2);
        System.out.println(s1);
    }


}
