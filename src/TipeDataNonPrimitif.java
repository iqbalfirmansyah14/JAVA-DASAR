public class TipeDataNonPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 10;
        Long iniLong = 10000L;

        Byte iniByte = 100;
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        //Konversi Dari tipe Primitif

        int iniInt = 100;
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        System.out.println(iniFloat);


    }
}
