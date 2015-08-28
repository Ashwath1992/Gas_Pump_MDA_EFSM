package strategy;
import data_store.*;

public class Store_Cash_3 extends Store_Cash 
{
	public void StoreCash(DataStore dataStore)
	{
		((Datastore_3)dataStore).set_cash(((Datastore_3)dataStore).cash);
	}
}
