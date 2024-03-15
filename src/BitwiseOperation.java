public class BitwiseOperation {
    public static void main(String[] args) {
        int x, y, z;
        x = 7; // binary 111
        y = 17; // binary 10001

        z = x&=y;
        /*
        00111
        10001    bitwise operation, if both 1 returns 1 else 0, 00001 = decimal 1
        -----
        00001
         */
        System.out.println(z);

        z= x^=y; // x is assigned 1 after previous AND operation, y is still 10001 decimal 17
        /*
        00001
        10001  bit operation, if values differ return 1 else 0, 10000 = decimal 16
        -----
        10000

         */

        System.out.println(z);


    }

}
