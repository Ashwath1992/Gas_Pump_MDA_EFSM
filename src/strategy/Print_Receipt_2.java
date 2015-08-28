package strategy;
import data_store.*;

public class Print_Receipt_2 extends Print_Receipt 
{
	public void PrintReceipt(DataStore dataStore)
	{
		System.out.println("Total : "+ ((Datastore_2)dataStore).get_total());
	}
}