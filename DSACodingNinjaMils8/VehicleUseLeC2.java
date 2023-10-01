package DSACodingNinjaMils8;

public class VehicleUseLeC2 {
    //this class link VehicleLeC2 class

    public static void main(String[] args) {
        VehicleLeC2 v = new VehicleLeC2();
        v.print();

        VehicleCareUseLeC2 c = new VehicleCareUseLeC2();
        c.numGears = 10;
        c.color = "red";
        c.print();
    }
}
