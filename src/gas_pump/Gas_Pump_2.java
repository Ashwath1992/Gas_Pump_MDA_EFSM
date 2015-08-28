package gas_pump;

import mda_efsm.MDA_EFSM;
import data_store.DataStore;
import data_store.Datastore_2;
import strategy.Set_Price_2;

public class Gas_Pump_2 
{
	MDA_EFSM mda_efsm = null;
	DataStore datastore = null;
	Set_Price_2 set_p2;
	
	public Gas_Pump_2 (MDA_EFSM mda_efsm, DataStore dataStore) 
	{
		this.mda_efsm = mda_efsm;
		this.datastore = dataStore;
		this.Activate(Datastore_2.datastore_tempa, Datastore_2.datastore_tempb);     
	}
		
	public void Activate(float a, float b)
	{
		if (a>0 && b>0) 
		{
			Datastore_2.datastore_tempa = a;                           
			Datastore_2.datastore_tempb = b;                           
			((Datastore_2)datastore).counter = 2;
	    	mda_efsm.activate();
		}
	}
	
	public void Start ()
	{
		mda_efsm.Start();
	}
	
	public void PayCredit()
	{
		mda_efsm.PayCredit();
	}
	
	public void Reject()
	{
		mda_efsm.Reject();
	}
	
	public void Cancel()
	{
		mda_efsm.Cancel();
	}
	
	public void Approved()
	{
		mda_efsm.Approved();
	}
	
	public void Super()
	{
		mda_efsm.SelectGas(2);
		((Datastore_2)datastore).counter = 2; 	
	}
	
	public void Regular()
	{
		mda_efsm.SelectGas(1);
		((Datastore_2)datastore).counter = 1;
	}
	
	public void StartPump()
	{
		mda_efsm.StartPump();
	}
	
	public void PumpGallon()
	{
		 mda_efsm.Pump();
	}
	
	public void StopPump()
	{
		mda_efsm.StopPump();
		mda_efsm.Receipt();
	}
}