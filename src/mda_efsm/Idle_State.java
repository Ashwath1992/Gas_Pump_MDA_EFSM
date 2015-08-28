package mda_efsm;

public class Idle_State implements GP_States
{
	MDA_EFSM mda_efsm = null;
	
	public Idle_State(MDA_EFSM mda_efsm)
	{
		// TODO Auto-generated method stub
		this.mda_efsm= mda_efsm;
	}
	
	@Override
	public void Activate() 
	{
		// TODO Auto-generated method stub
		mda_efsm.gas_Pump_result.StoreData();
		mda_efsm.setState(mda_efsm.getS0State());
	}

	@Override
	public void PayCredit() 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void PayCash() 
	{
		// TODO Auto-generated method stub	
	}

	@Override
	public void Reject() 
	{
		// TODO Auto-generated method stub	
	}

	@Override
	public void Cancel() 
	{
		// TODO Auto-generated method stub	
	}

	@Override
	public void Approved() 
	{
		// TODO Auto-generated method stub	
	}

	@Override
	public void StartPump() 
	{
		// TODO Auto-generated method stub	
	}

	@Override
	public void Pump() 
	{
		// TODO Auto-generated method stub	
	}

	@Override
	public void StopPump() 
	{
		// TODO Auto-generated method stub	
	}

	@Override
	public void SelectGas(int g) 
	{
		// TODO Auto-generated method stub		
	}

	@Override
	public void Receipt() 
	{
		// TODO Auto-generated method stub		
	}

	@Override
	public void NoReceipt() 
	{
		// TODO Auto-generated method stub	
	}


	@Override
	public void Start() 
	{
		// TODO Auto-generated method stub	
	}
}