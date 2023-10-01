package RecursionApnaCollege;

public class HanoiTower {
    public static void printHanoiTower(int n, String src, String helper, String dest){
        if (n==1) {
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        printHanoiTower(n-1,src,dest,helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        printHanoiTower(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        int n=3;
        printHanoiTower(n," S "," H "," D ");
    }
}
