package strategy;
import data_store.*;


public class Print_Receipt_3 extends Print_Receipt 
{
	public void PrintReceipt(DataStore dataStore)
	{
		System.out.println("Total : "+ ((Datastore_3)dataStore).get_total());
	}
}