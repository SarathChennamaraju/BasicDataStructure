package loopsPractice;

public class Arraypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int A[]=new int[10];
	        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
	        
	        int n=5;
	        
	        for(int i=0;i<n;i++)
	            System.out.print(A[i]+",");
	        System.out.println("");
	     
	        int x=7;
	        int index=2;
	        
	        for(int i=index+1;i<=n;i++)
	            A[i]=A[i-1];
	      //  A[index]=x;
	        
	        for(int i=0;i<n;i++)
	            System.out.print(A[i]+",");
	        System.out.println("");
	     
	        
	}
}


