package classAssignment2;

public class series {

	public static void main(String[] args) 
	{
		int i, number = 1, count; 
		
		System.out.println(" Prime Numbers from  are : ");	
		while(number <= 50)
		{
			count = 0;
			i = 2;
		    while(i <= number/2 )
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    	i++;
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }
		    number++;
		}
	}

}
