import java.util.*;
public class guvi {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String s=in.next();
	char a[]=s.toCharArray();
	int b = 0,c = 0,sum=0;
for(int i=0;i<a.length;i++){
	if((a[i]>=48 && a[i]<=57) ){
		b=1;
	}
	if((a[i]>=65 && a[i]<=122)){
		c=1;
	}
}
sum=c+b;
if(sum==2){
		System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	in.close();
 }
}
