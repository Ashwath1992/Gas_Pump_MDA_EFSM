package strategy;
import data_store.*;

public class Pump_Gas_Unit_2 extends Pump_Gas_Unit 
{
	public void PumpGasUnit(DataStore dataStore)
	{
		((Datastore_2)dataStore).set_G();
		((Datastore_2)dataStore).set_total();
	}
}
