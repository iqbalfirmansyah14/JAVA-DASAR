public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 70;
        var nilaiAhkir = 80;

        boolean lulusabsen = absen >=75;
        boolean lulusNilai = nilaiAhkir >= 75;

        var lulus = lulusabsen && lulusNilai;
        System.out.println(lulus);

    }
}
