package strategy;
import data_store.*;

public class Set_Price_1 extends Set_Price 
{
	public void SetPrice(DataStore datastore,int k)
	{
		System.out.println(" Entered Set_Price 1\n");
		
		if(k==1)
		{
			((Datastore_1)datastore).set_price(Datastore_1.datastore_tempa);	
		}
	}

}