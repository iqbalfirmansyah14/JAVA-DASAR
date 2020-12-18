public class TipeDataArray {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Iqbal";
        stringArray[1] = "Firmansyah";
        stringArray[2] = "Fansuri";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        //Array Initializer

        String[] nama = {
                "Iqbal","Firmansyah","Fansuri"
        };

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
                10, 90, 80, 20
        };

        System.out.println(arrayLong.length);

        //Array dalam Array

        String[][] members = {
                {"Eko", "Kurniawan"},
                {"Budi", "Nugraha"},
                {"Joko"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);



    }
}
