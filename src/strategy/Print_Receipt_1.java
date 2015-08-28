package strategy;
import data_store.*;

public class Print_Receipt_1 extends Print_Receipt 
{	
	public void PrintReceipt(DataStore dataStore)
	{
		System.out.println(" Total : "+ ((Datastore_1)dataStore).get_Total());
	}
}