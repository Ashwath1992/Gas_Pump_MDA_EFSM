package strategy;
import data_store.*;

public class Store_Data_1 extends Store_Data 
{
	public void StoreData(DataStore dataStore)
	{
		((Datastore_1)dataStore).set_datastore_tempa(Datastore_1.datastore_tempa);
	}

	@Override
	public void StoreData(DataStore dataStore, DataStore dataStore1) 
	{
		// TODO Auto-generated method stub
	}
}
