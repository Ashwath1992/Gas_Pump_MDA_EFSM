package mda_efsm;

public class State_S5 implements GP_States 
{
	MDA_EFSM mda_efsm = null;

	public State_S5(MDA_EFSM mda_efsm)
	{
		this.mda_efsm=mda_efsm;
	}

	@Override
	public void Activate() 
	{
		// TODO Auto-generated method stub	
	}

	@Override
	public void Start() 
	{
		// TODO Auto-generated method stub	
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
		mda_efsm.gas_Pump_result.PumpGasUnit();
		mda_efsm.gas_Pump_result.GasPumpedMsg();
		mda_efsm.setState(mda_efsm.getS5State());
	}

	@Override
	public void StopPump() 
	{
		// TODO Auto-generated method stub
		mda_efsm.gas_Pump_result.StopMsg();	
		mda_efsm.setState(mda_efsm.getS6State());
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
}