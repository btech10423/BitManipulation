import java.util.*;
public class ClearIbits {
 public static void clearithbit(int n,int i) {
    int bitmask = ~(0)<<i;
    System.out.print(n&bitmask);
 }
 public static void main(String args[]){
    clearithbit(15,2);
 }
 }