package strategy;
import data_store.*;

public class Set_Price_2 extends Set_Price 
{
	public void SetPrice( DataStore datastore,int k)
	{	
		if(k==1)
		{
			((Datastore_2)datastore).set_price(Datastore_2.datastore_tempa);	
		}
		else if(k==2)
		{
			((Datastore_2)datastore).set_price(Datastore_2.datastore_tempb);	
		}
	}
}