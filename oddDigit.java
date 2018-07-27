import java.util.*;
public class guvi {
	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
int n=in.nextInt();
int i=0,count=0;
int b[]=new int[100];
while(n>0){
	b[i]=n%10;
	n/=10;
	i++;
	count++;
}

for(i=count;i>=0;i--){
	if( b[i] % 2!=0 ){
		System.out.print(b[i] +" ");
}
	}
  in.close();
	}
}
