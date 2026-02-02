import java.util.*; 
public class Smaxsmin
{ 
 public static void main(String[] args) { 
  Scanner sc=new Scanner(System.in); 
 
  int n=sc.nextInt(); 
  int[] arr=new int[n]; 
  for(int i=0;i<n;i++){ 
      arr[i]=sc.nextInt(); 
  } 
  int max=arr[0]; 
  int smax=arr[0]; 
  for(int i=0;i<n;i++){ 
      if(arr[i]>max){ 
          int temp=max; 
          max=arr[i]; 
          smax=temp; 
      } 
	else if (arr[i] > smax && arr[i] != max) {  
                smax = arr[i];
            }
  } 
  int min=arr[0]; 
  int smin=Integer.MAX_VALUE; 
  for(int i=0;i<n;i++){ 
      if(arr[i]<min){ 
          smin=min; 
          min=arr[i]; 
      } 
	else if (arr[i] < smin && arr[i] != min) {  
                smin = arr[i];
            }
  } 
  System.out.println(" Largest "+max+" and second largest "+smax); 
  System.out.println(" Smallest "+min+" and second smallest "+smin); 
 } 
} 