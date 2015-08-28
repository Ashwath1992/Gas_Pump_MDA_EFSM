package strategy;
import data_store.*;

/* 
 *  CLASS : SetW1 (STRAGTEGY PATTERN)
 */

public class Set_W_1 extends Set_W {
	
	public void SetW(DataStore dataStore)
	{
		((Datastore_1)dataStore).set_datastore_tempw(((Datastore_1)dataStore).datastore_tempw);
	}

}