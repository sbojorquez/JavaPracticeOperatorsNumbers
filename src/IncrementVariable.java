public class IncrementVariable {
    public static void main(String[] args) {
        int x = 1;
        x++; // post-fix increment
        System.out.println(x);
        x+=1; //addition assignment
        System.out.println(x);
        x = x+1; //addition
        System.out.println(x);
        x = ++x; //prefix increment
        System.out.println(x);

    }
}
