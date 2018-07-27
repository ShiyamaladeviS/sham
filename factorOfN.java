import java.util.*;
public class guvi {
	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
int n=in.nextInt();
int i;
for(i=1;i<=n;i++){
	if(n%i==0){
		
	System.out.print(i +" ");
}
	}
  in.close();
	}
}
