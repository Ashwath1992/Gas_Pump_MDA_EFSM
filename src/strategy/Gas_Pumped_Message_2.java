package strategy;
import data_store.*;

public class Gas_Pumped_Message_2 extends Gas_Pumped_Message 
{
	public void GasPumpedMsg(DataStore dataStore)
	{
		System.out.println("Number of Gallons Pumped = "+ ((Datastore_2)dataStore).get_G());
	}
}

