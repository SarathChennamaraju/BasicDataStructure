package loopsPractice;
//class NegativeDimensionException extends Exception{
	
	   // public String toString()
	   // {
	   //     return "Dimensions of a Rectangle cannot be Negative";
	   // }
	//}
public class Exceptionhandling {

		// TODO Auto-generated method stub
		 static int area(int l,int b) throws Exception
		    {
		        if(l<0 || b<0)
		            throw new Exception();
		        return l*b;
		    }
		    static void meth1() throws Exception
		    {
		        System.out.println("Area is "+area(-10,5));
		    }
		    
		    public static void main(String[] args) 
		    {
		       try
		        {
		      meth1();
		        }
		        catch(Exception e)
		        {
		            System.out.println("Dimensions of a Rectangle cannot be Negative");
		            //System.out.println(e);
		        }
		    //    System.err.println("hi");
		    } 
		}
	

	


