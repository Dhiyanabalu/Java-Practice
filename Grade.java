import java.util.*;
public class Grade{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a>=90){
System.out.println("A");
}
else if(a>=75){
System.out.println("B");
}
else if(a>=60){
System.out.println("C");
}
else if(a>=59){
System.out.println("D");
}
else{
System.out.println("fail");
}}
}