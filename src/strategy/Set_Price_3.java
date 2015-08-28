package strategy;
import data_store.*;

public class Set_Price_3 extends Set_Price 
{
	public void SetPrice(DataStore datastore,int k)
	{		
		if(k==1)
		{
			((Datastore_3)datastore).set_price(Datastore_3.datastore_tempa);	
		}
		else if(k==2)
		{
			((Datastore_3)datastore).set_price(Datastore_3.datastore_tempb);	
		}
	}
}