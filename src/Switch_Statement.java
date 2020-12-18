public class Switch_Statement {
    public static void main(String[] args) {
        var nilai = "E";

        switch (nilai) {
            case "A":
                System.out.println("Wow Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
        }

        //SWITCH LAMBDA

        switch (nilai) {
            case "A" -> System.out.println("Wow Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai Anda cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda salah jurusan");
            }
        }


        //KATA KUNCI YIELD
        String ucapan = switch (nilai) {
            case "A":
                yield "Wow, Anda lulus dengan baik";
            case "B", "C":
                yield "Nilai Anda cukup Baik";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Mungkin Anda salah jurusan";

        };
        System.out.println(ucapan);

    }

}