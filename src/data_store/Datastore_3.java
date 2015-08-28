package data_store;

public class Datastore_3 extends DataStore
{
	public float cash;
	public float price;
	public float L;
	public float total;
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
	
	public float get_L()
	{
		return L;
	}
	
	public void set_L()
	{
		L=L+1;
	}
	
	public float get_total()
	{
		return total;
	}
	
	public void set_total()
	{
		total =  price*L;
	}
	
	public float get_price()
	{
		return price;
	}
	
	public void set_price(float t)
	{
		price = t;
	}
	
	public float get_cash()
	{
		return cash;
	}
	
	public void set_cash(float ch)
	{
		cash = ch;	
	}
}
