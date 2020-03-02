package dhi;

public class HouseDefining1 {
	double pp=0;
	public double it_is_cost(String s,double pr,String y)
	{
		if (s.equals("StandardMaterials"))
		{
			
			pp=pp+(1200*pr);
			
			
		}
		
		else if (s.equals(" standard materials"))
		{
			
			pp=pp+(1500*pr);
			
			
		}
		else
		{
			if (y.equals(" automated fully home" ))
			{pp=pp+(2500*pr);
			}
			else
			{
				pp=pp+(1800*pr);
			}
			
		}
		
		
	return(pp);	
	}

}
