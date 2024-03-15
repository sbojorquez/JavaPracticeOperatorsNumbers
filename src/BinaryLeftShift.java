public class BinaryLeftShift {
    public static void main(String[] args) {
        int x = 2;
        String binString;
        System.out.println(Integer.toBinaryString(x));
        x <<=1; // 2 binary is 10, binary 10 left shift is 100 , binary 100 is decimal 4
        System.out.println(Integer.toBinaryString(x));

        int a = 9;
        int b = 17;
        int c = 88;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));

        a <<=1; // binary 1001 shifted is 10010 , decimal 18
        b <<=1; // binary 10001 shifted is 100010, decimal 34
        c <<=1; // binary 1011000 shifted is 10110000, decimal 176

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));


    }
}
