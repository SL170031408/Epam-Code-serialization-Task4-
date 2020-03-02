package dhi;
public class Defining1 {
	
	
	
	public double It_is_method(double price,double  ipu,double  it_is_pe )
	{
		double is_y=(price*ipu*it_is_pe)/100;
		
		return is_y;
	}
	public double  It_is_method1(double p,double  ipu,double  it_is_pe )
	{
		double  is_y=p*(Math.pow((1+(ipu/100)),it_is_pe));
		is_y=is_y-p;
		return is_y;
	}
	

}
