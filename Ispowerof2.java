import java.util.*;

public class Ispowerof2 {
    public static boolean ispower2(int n) {
return (n&(n-1)) == 0;
    }
    public static void main(String args[]) {
        System.out.print(ispower2(10));
    }
}