package strategy;
import data_store.*;

public class Pump_Gas_Unit_3 extends Pump_Gas_Unit
{
	public void PumpGasUnit(DataStore dataStore)
	{
		((Datastore_3)dataStore).set_L();
		((Datastore_3)dataStore).set_total();
	}
}
