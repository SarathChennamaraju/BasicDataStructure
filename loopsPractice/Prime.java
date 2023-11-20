package loopsPractice;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=15,count=0;
for(int i=1;i<=num;i++) {
	if(num%i==0) {
		count=count+1;
	}
}
	if(count==2) {
		System.out.print("Number is prime");
	}
	else {
			System.out.print("Number is not prime");
		}
}
	}


