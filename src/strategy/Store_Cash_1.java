package strategy;
import data_store.*;

public class Store_Cash_1 extends Store_Cash 
{
	public void StoreCash(DataStore dataStore)
	{
		((Datastore_1)dataStore).set_cash(((Datastore_1)dataStore).cash);
	}
}
