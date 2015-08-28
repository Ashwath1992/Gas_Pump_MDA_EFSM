package mda_efsm;

import abstract_factory.Abstract_Factory;
import results.GP_Output;

public class MDA_EFSM 
{
	GP_States idle_state = new Idle_State(this);
	
	GP_States state_s0 = new State_S0(this);
	GP_States state_s1 = new State_S1(this);
	GP_States state_s2 = new State_S2(this);
	GP_States state_s3 = new State_S3(this);
	GP_States state_s4 = new State_S4(this);
	GP_States state_s5 = new State_S5(this);
	GP_States state_s6 = new State_S6(this);
	
	GP_States mda_efsm = null;
	
	Abstract_Factory ab_fac =null;
	GP_Output gas_Pump_result = null;
	
	public MDA_EFSM (Abstract_Factory factory, GP_Output gP_Output)
	{
		mda_efsm = idle_state;
        this.ab_fac = factory;
        this.gas_Pump_result = gP_Output;
	}
	
	public void activate()
	{
		mda_efsm.Activate();
		printCurrentState();
	}
	
	public void Start ()
	{
		mda_efsm.Start();
		printCurrentState();
	}
	
	public void PayCredit()
	{
		mda_efsm.PayCredit();
		printCurrentState();
	}
	
	public void Reject()
	{
		mda_efsm.Reject();
		printCurrentState();
	}
	
	public void Cancel()
	{
		mda_efsm.Cancel();
		printCurrentState();
	}
	
	public void Approved()
	{
		mda_efsm.Approved();
		printCurrentState();
	}
	
	public void PayCash()
	{
		mda_efsm.PayCash();
		printCurrentState();
	}
	
	public void StartPump()
	{
		mda_efsm.StartPump();
		printCurrentState();
	}
	
	public void Pump()
	{
		mda_efsm.Pump();
		printCurrentState();
	}
	
	public void StopPump()
	{
		mda_efsm.StopPump();
		printCurrentState();
	}
	
	public void SelectGas(int i)
	{
		mda_efsm.SelectGas(i);
		printCurrentState();
	}
	
	public void Receipt()
	{
		mda_efsm.Receipt();
		printCurrentState();
	}
	
	public void NoReceipt()
	{
		mda_efsm.NoReceipt();
		printCurrentState();
	}
	
    public void setState(GP_States efsmState) 
    {
        this.mda_efsm = efsmState;
    }
    
    public GP_States getGasPumpState() 
    {
        return mda_efsm;
    }
    
    public GP_States getS0State() 
    {
        return state_s0;
    }
    
    public GP_States getS1State() 
    {
        return state_s1;
    }
    
    public GP_States getS2State() 
    {
        return state_s2;
    }
    
    public GP_States getS3State() 
    {
        return state_s3;
    }
    
    public GP_States getS4State() 
    {
        return state_s4;
    }
    
    public GP_States getS5State() 
    {
        return state_s5;
    }
    
    public GP_States getS6State() 
    {
        return state_s6;
    }
	
    public void printCurrentState()
	{
		System.out.println("********* Current State :"+ mda_efsm.getClass().getName() + " *********");
	}
}