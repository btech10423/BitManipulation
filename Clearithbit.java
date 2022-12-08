import java.util.*;
public class Clearithbit {
 public static void clearithbit(int n,int i) {
    int bitmask = ~(1<<i);
    System.out.println(n&bitmask);
 }
 public static void main(String args[]){
    clearithbit(10,1);
 }
 }