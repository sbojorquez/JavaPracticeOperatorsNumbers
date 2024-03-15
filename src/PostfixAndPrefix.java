public class PostfixAndPrefix {
    public static void main(String[] args) {
        int x= 5;
        int y = 8;
        int sum = ++x + y; //increments x then completes the operation, sum =14 (6+8)
        System.out.println(sum);
        x= 5;
        y = 8;
        sum = x++ + y; // completes operation then increments x so sum = 13 (5+8)
        System.out.println(sum);

}
