package data_store;

public class Datastore_1 extends DataStore
{
	public int G;
	public int total;
	public int cash;
	public int price = datastore_tempa;
	public static int datastore_tempa;
	public int datastore_tempw;
	public int counter;
	
	public int get_datastore_tempa()
	{
		return datastore_tempa;
	}
	
	public void set_datastore_tempa(int a)
	{
		datastore_tempa=a;
		datastore_temp=1;
	}
	
	public int get_datastore_tempw()
	{
		return datastore_tempw;
	}
	
	public void set_datastore_tempw(int w)
	{
		datastore_tempw=w;
	}
	
	public int get_cash()
	{
		return cash;
	}
	
	public void set_cash(int ch)
	{
		cash = ch;
	}
	
	public int get_price()
	{
		return price;
	}
	
	public void set_price(int pr)
	{
		price = pr;
	}
	
	public int get_G()
	{
		return G;
	}
	
	public void set_G()
	{
		G = G+1;
	}
	
	public int get_Total()
	{
		return total;
	}
	
	public void set_Total()
	{
		total = price*G;
	}
}
