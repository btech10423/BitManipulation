import java.util.*;
public class Setithbit {
 public static void setithbit(int n,int i) {
    int bitmask = 1<<i;
    System.out.println(n|bitmask);
 }
 public static void main(String args[]){
    setithbit(10,2);
 }
 }

