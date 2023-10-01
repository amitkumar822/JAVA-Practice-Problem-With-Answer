package PreplnstaOnlineQuiestionAndCodeProvide;

public class FactorsNumber1 {
    public static void main(String[] args) {
        int n=10;
        System.out.println("Final factor number "+n+" is here : ");
        for(int i=1; i<=n; i++){
            if(n%i==0) {
                System.out.print(i + " ");
            }
        }
    }
}
