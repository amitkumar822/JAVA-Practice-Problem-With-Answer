public class ResorsionTower {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if (n == 1){
            System.out.println("Transfer disk "+n+" form "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src , dest, helper);
        System.out.println("Transfer disk "+n+" form "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n =3;
        towerOfHanoi(n, "S" ,"H","D");
    }
}
