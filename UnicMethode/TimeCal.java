package UnicMethode;

public class TimeCal {
    public static void main(String[] args) {
        String str = "10:9:8";  //ans -> 3658
        String[] rs=str.split(":");

        for (int i=0; i<rs.length; i++){
            int h= Integer.parseInt(rs[0]);
            int m= Integer.parseInt(rs[1]);
            int s= Integer.parseInt(rs[2]);
            int ans=h*3600+m*60+s;
            System.out.println(ans);
            break;
        }
    }
}
