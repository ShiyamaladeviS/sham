import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int a[]=new int[n];
	int temp=0;
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
	System.out.print(a[0]+" "+a[n-1]);
 in.close();
 }
}
