package strategy;
import data_store.*;

public class Gas_Pumped_Message_1 extends Gas_Pumped_Message 
{
	public void GasPumpedMsg(DataStore dataStore)
	{
		System.out.println("Number of Gallons Pumped = "+ ((Datastore_1)dataStore).get_G());
	}
}

