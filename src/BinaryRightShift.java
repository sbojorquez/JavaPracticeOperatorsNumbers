public class BinaryRightShift {
    public static void main(String[] args) {
        int x = 150;
        String binString;
        System.out.println(Integer.toBinaryString(x));
        x >>=2; // binary is 10010110,right shift 2 is 100101 - decimal equivalent is 37
        System.out.println(Integer.toBinaryString(x));

        int a = 225;
        int b = 1555;
        int c = 32456;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));

        a >>=2; // binary 11100001 shifted is 111000 , decimal 56
        b >>=2; // binary 11000010011 shifted is 110000100, decimal 388
        c >>=2; // binary 111111011001000 shifted is 1111110110010, decimal 8114

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));

    }
}
