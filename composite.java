import java.util.*;
public class guvi {
	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
int n=in.nextInt();
int i,count=0;
for(i=1;i<n;i++){
	if(n%i==0){
		count++;
	}
}
if(count>2){
	System.out.println("yes");
}else{
	System.out.println("no");
}

      in.close();
	}
}
