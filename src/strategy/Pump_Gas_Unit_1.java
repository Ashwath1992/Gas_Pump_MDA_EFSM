package strategy;
import data_store.*;

public class Pump_Gas_Unit_1 extends Pump_Gas_Unit 
{
	public void PumpGasUnit(DataStore dataStore)
	{
		((Datastore_1)dataStore).set_G();
		((Datastore_1)dataStore).set_Total();
	}
}
