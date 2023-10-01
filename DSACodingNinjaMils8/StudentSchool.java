package DSACodingNinjaMils8;
//This construction use StudentSchoolColl class(link)
public class StudentSchool {
     String Name;
    private int rollNo;

    public void setdeeji(int rn){
        if(rn <= 0){
            return;
        }
        rollNo = rn;
    }
    public int getkumar(){
        return rollNo;
    }
}
