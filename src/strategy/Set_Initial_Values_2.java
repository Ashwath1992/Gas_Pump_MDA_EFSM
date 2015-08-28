package strategy;
import data_store.*;

public class Set_Initial_Values_2 extends Set_Initial_Values 
{
	public void SetInitialValues(DataStore dataStore)
	{
		 ((Datastore_2)dataStore).G = 0;
	}
}
