package UnicMethode;

public class TimeSecondtoDaysHouSecConvert {
    //given second (129600) convert days hours minute second

    static void ConvertSectoDay(int n){
        int day = n/(24*3600);
        n=n%(24*3600);
        int hour = n/3600;
        n %=3600;

        int minutes = n/60;
        n %=60;
        int seconds = n;

        System.out.println(day+" days, "+hour+" hours"+minutes+" minutes"+seconds+" seconds");

    }
    public static void main(String[] args) {
        int n=1321856;
        ConvertSectoDay(n);
    }
}
