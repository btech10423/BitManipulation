import java.util.*;
public class Clearbitsinrange {
 public static void clearbitsinrange(int n,int i,int j) {
    int a = ~(0)<<(j+1);
    int b = 1<<i - 1;
    int bitmask = a|b;
    System.out.print(n&bitmask);
 }
 public static void main(String args[]){
    clearbitsinrange(10,2,4);
 }
 }