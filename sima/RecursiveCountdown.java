package sima;

public class RecursiveCountdown{
public static void main(String[] args){
countDown(5);
}
public static void countDown(int num){
if (num <=0){
System.out.println();
}
else{
System.out.print(num);
countDown(num - 2);
}
}
}