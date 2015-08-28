package strategy;
import data_store.*;

public class Store_Data_2 extends Store_Data 
{
	public void StoreData(DataStore dataStore)
	{
		
	}

	@Override
	public void StoreData(DataStore dataStore, DataStore dataStore1) 
	{
		// TODO Auto-generated method stub
		((Datastore_2)dataStore).set_datastore_tempa(Datastore_2.datastore_tempa);
		((Datastore_2)dataStore).set_datastore_tempb(Datastore_2.datastore_tempb);
	}
}
