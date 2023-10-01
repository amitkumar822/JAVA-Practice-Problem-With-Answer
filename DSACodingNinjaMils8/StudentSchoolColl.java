package DSACodingNinjaMils8;
//this class use StudentSchool Property;
public class StudentSchoolColl {
    public static void main(String[] args) {
        StudentSchool s1 = new StudentSchool();
        s1.setdeeji(12);
        System.out.println(s1.getkumar());

        StudentSchool s2 = new StudentSchool();
        s2.Name = "Deeju";
        s2.setdeeji(-12);
        System.out.println(s2.Name);
        System.out.println("Student RollNo");
        System.out.println(s2.getkumar());
    }
}
