package gas_pump;

import data_store.DataStore;
import data_store.Datastore_1;
import mda_efsm.MDA_EFSM;

public class Gas_Pump_1 
{
	MDA_EFSM mda_efsm = null;
	DataStore datastore = null;
	
	public Gas_Pump_1 (MDA_EFSM mda_efsm, DataStore dataStore) 
	{
		this.mda_efsm = mda_efsm;
		this.datastore = dataStore;
		this.Activate(Datastore_1.datastore_tempa);         
	}
		
	public void Activate(int a)
	{
		if (a>0) 
		{
			Datastore_1.datastore_tempa = a;               
	    	mda_efsm.activate();
		}
	}
	
	public void Start ()
	{
		mda_efsm.Start();
	}
	
	public void PayCredit()
	{
		((Datastore_1)datastore).datastore_tempw = 1;
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
	
	public void PayCash(int c)
	{
		if (c>0) 
		{
			((Datastore_1)datastore).cash = c;
			((Datastore_1)datastore).datastore_tempw = 0;
			mda_efsm.PayCash();
		}
	}
	
	public void StartPump()
	{
		mda_efsm.SelectGas(1);
		mda_efsm.StartPump();		
	}
	
	public void PumpGallon()
	{
		if ( ((((Datastore_1)datastore).datastore_tempw ==1) || (((Datastore_1)datastore).datastore_tempw ==0)) && (((Datastore_1)datastore).cash >= ((((Datastore_1)datastore).G+1) * ((Datastore_1)datastore).price))  )
		{
			mda_efsm.Pump();
		}
		else if( (((Datastore_1)datastore).datastore_tempw ==0) && (((Datastore_1)datastore).cash < ((((Datastore_1)datastore).G+1) * ((Datastore_1)datastore).price)) )
		{
			mda_efsm.StopPump();
			mda_efsm.Receipt();
		}
		else if(((Datastore_1)datastore).datastore_tempw ==1)
		{
			mda_efsm.Pump();
		}
	}
	
	public void StopPump()
	{
		mda_efsm.StopPump();
		mda_efsm.Receipt();
	}
}