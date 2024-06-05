
public class Triangle {

    public static void main(String[] args) {
        int a = 8;
        int b = 8;
        int c = 8;

        if (a == b && a == c && b == c) {
            System.out.println("この三角形は正三角形");
        } else if (a == b || a == c || b == c) {
            System.out.println("この三角形は二等辺三角形");
        } else {
            System.out.println("この三角形は不等辺三角形");

        }
    }

}
