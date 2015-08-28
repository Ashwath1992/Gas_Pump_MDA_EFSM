package strategy;
import data_store.*;

public class Store_Data_3 extends Store_Data 
{
	public void StoreData(DataStore dataStore)
	{
		
	}

	@Override
	public void StoreData(DataStore dataStore, DataStore dataStore1) 
	{
		// TODO Auto-generated method stub
		((Datastore_3)dataStore).set_datastore_tempa(Datastore_3.datastore_tempa);
		((Datastore_3)dataStore).set_datastore_tempb(Datastore_3.datastore_tempb);
	}
}
