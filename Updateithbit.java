import java.util.*;
public class Updateithbit{
 public static int clearithbit(int n,int i) {
    int bitmask = ~(1<<i);
    return n&bitmask;
 }
 public static void setithbit(int n,int i) {
   int bitmask = 1<<i;
   System.out.println(n|bitmask);
}
public static void update(int n,int i,int newbit){
  n= clearithbit(n,i);
int bitmask = newbit<<i;
System.out.println(n|bitmask);
   }


 public static void main(String args[]){
    update(10,2,1);
 }
 }