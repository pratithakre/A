class demo9
{
 public static void main(String arg[])
 {
    int i,j;
	for(i=1;i<=11;i++)
	{
    for(j=1;j<=11;j++)
	{
		  if(i==1 || j==1 || i==11 || j==11 || i==j || i+j==12 || i+j==7
		  || i+j==17)
		  {
		 
			  System.out.print("* ");
		  }
		  else
		  {
			   System.out.print("  ");
		  }
	}
	  System.out.println();
	}

	}}