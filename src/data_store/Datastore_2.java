package data_store;

public class Datastore_2 extends DataStore
{
	public int G;
	public float total;
	public float price;
	public static float datastore_tempa;
	public static float datastore_tempb;
	public int counter;
	
	
	public float get_datastore_tempa()
	{
		return datastore_tempa;
	}
	
	public void set_datastore_tempa(float a)
	{
		datastore_tempa=a;
	}
	
	public float get_datastore_tempb()
	{
		return datastore_tempb;
	}
	
	public void set_datastore_tempb(float b)
	{
		datastore_tempb=b;
	}
	
	public float get_G()
	{
		return G;
	}
	
	public void set_G()
	{
		G=G+1;
	}
	
	public float get_total()
	{
		return total;
	}
	
	public void set_total()
	{
		total =  price*G;
	}
	
	public float get_price()
	{
		return price;
	}
	
	public void set_price(float pr)
	{
		price = pr;
	}	
}