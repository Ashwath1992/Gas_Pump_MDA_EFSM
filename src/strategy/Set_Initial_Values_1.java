package strategy;
import data_store.*;

public class Set_Initial_Values_1 extends Set_Initial_Values 
{
	public void SetInitialValues(DataStore dataStore)
	{
		 ((Datastore_1)dataStore).G = 0;
	}
}
