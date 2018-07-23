import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	 int n=in.nextInt();
	 int temp=0;
	 int a[]=new int[n];
	 for(int i=0;i<n;i++){
		 a[i]=in.nextInt();
	 }
	 for(int i=0;i<n;i++){
		 for(int j=i+1;j<n;j++){
	 if(a[i]>a[j]){
		 temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
	 }
	  }
	 }
	 int l=n/2;
	System.out.println(a[l]);
 in.close();
 }
}
