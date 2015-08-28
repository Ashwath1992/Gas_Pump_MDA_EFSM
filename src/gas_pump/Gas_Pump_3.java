package gas_pump;

import mda_efsm.MDA_EFSM;
import data_store.DataStore;
import data_store.Datastore_3;
import strategy.Set_Price_3;

public class Gas_Pump_3 {
	
	MDA_EFSM mda_efsm = null;
	DataStore datastore = null;
	Set_Price_3 set_p3 ;
	
	public Gas_Pump_3 (MDA_EFSM mda_efsm, DataStore dataStore) 
	{
		this.mda_efsm = mda_efsm;
		this.datastore = dataStore;
		this.Activate(Datastore_3.datastore_tempa, Datastore_3.datastore_tempb);      
	}
	
	
	public void Activate(float a, float b)
	{
		if (a>0 && b>0) 
		{
			Datastore_3.datastore_tempa = a;                            
			Datastore_3.datastore_tempb = b;                           
	    	mda_efsm.activate();
		}
	}
	
	public void Start ()
	{
		mda_efsm.Start();
	}
	
	public void PayCash(float c)
	{
		if(c>0)
		{
			((Datastore_3)datastore).cash = c;
			mda_efsm.PayCash();
		}
	}
		
	public void Cancel()
	{
		mda_efsm.Cancel();
	}
	
	public void Premium()
	{
		mda_efsm.SelectGas(2);
		((Datastore_3)datastore).counter = 2;
	}
	
	public void Regular()
	{
		mda_efsm.SelectGas(1);
		((Datastore_3)datastore).counter = 1;
	}
	
	public void StartPump()
	{
		mda_efsm.StartPump();	
	}
	
	public void PumpLiter()
	{
		if ( ((Datastore_3)datastore).cash >= ((((Datastore_3)datastore).L+1) * ((Datastore_3)datastore).price  ))
		{
			mda_efsm.Pump();
		}
		else if ( ((Datastore_3)datastore).cash < ((((Datastore_3)datastore).L+1) * ((Datastore_3)datastore).price  ))
		{
			mda_efsm.StopPump();
		}
	}
	
	public void StopPump()
	{
		mda_efsm.StopPump();
	}

	public void Receipt()
	{
		mda_efsm.Receipt();
	}
	
	public void NoReceipt()
	{
		mda_efsm.NoReceipt();
	}
}