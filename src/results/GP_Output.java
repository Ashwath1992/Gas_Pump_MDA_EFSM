package results;

import data_store.*;
import strategy.*;
import abstract_factory.Abstract_Factory;

public class GP_Output 
{
	Abstract_Factory ab_fac =null;
	DataStore dataStore = null;
	
	public GP_Output(Abstract_Factory factory,DataStore dataStore) 
	{
        this.ab_fac = factory;
        this.dataStore = dataStore;
    }

	public void StoreData()
	{
		String data_string = dataStore.getClass().getName();
		
		System.out.println("*********** " + data_string + " ***********");
		System.out.println("\n OUTPUT :- Action StoreData\n");
		Store_Data store_data = ab_fac.Create_Store_Data();
		
		if(data_string == "data_store.DataStore1")
		{
			store_data.StoreData(dataStore);
			SetPrice(Datastore_1.datastore_tempa);
		}
		else
		{
			store_data.StoreData(dataStore, dataStore);
		}
	}
	
	public void Pay_Msg()
	{
		System.out.println("\n OUTPUT :- Action Pay_Msg\n");
		Pay_Message pay_msg = ab_fac.Create_Pay_Message();
		pay_msg.PayMsg();
	}
	
	public void StoreCash()
	{
		System.out.println("\n OUTPUT :- Action StoreCash\n");
		Store_Cash store_cash = ab_fac.Create_Store_Cash();
		store_cash.StoreCash(dataStore);
	}
	
	public void DisplayMenu()
	{
		System.out.println("\n OUTPUT :- Action DisplayMenu\n");
		Display_Menu disp_menu = ab_fac.Create_Display_Menu();
		disp_menu.DisplayMenu();
	}
	
	public void RejectMsg()
	{
		System.out.println("\n OUTPUT :- Action RejectMsg\n");
		Reject_Message reject_msg = ab_fac.Create_Reject_Message();
		reject_msg.RejectMsg();
	}
	
	public void SetW(int k)
	{
		System.out.println("\n OUTPUT :- Action SetW\n");
		Set_W set_w = ab_fac.Create_SetW(k);
	}
	
	public void SetPrice(int g)
	{
		System.out.println("\n OUTPUT :- Action SetPrice\n");
		Set_Price set_pr = ab_fac.Create_SetPrice(g);
		set_pr.SetPrice(dataStore,g);
	}
	
	public void ReadyMsg()
	{
		System.out.println("\n OUTPUT :- Action ReadyMsg\n");
		Ready_Message ready_msg = ab_fac.Create_Ready_Message();
		ready_msg.ReadyMsg();
	}
	
	public void SetInitialValues()
	{
		System.out.println("\n OUTPUT :- Action SetInitialValues\n");
		Set_Initial_Values set_init_val = ab_fac.Create_Set_Intial_Values();
		set_init_val.SetInitialValues(dataStore);
	}
	
	public void PumpGasUnit()
	{
		System.out.println("\n OUTPUT :- Action PumpGasUnit\n");
		Pump_Gas_Unit pumpgas_unit = ab_fac.Create_Pump_Gas_Unit();
		pumpgas_unit.PumpGasUnit(dataStore);
	}
	
	public void GasPumpedMsg()
	{
		System.out.println("\n OUTPUT :- Action GasPumpedMsg\n");
		Gas_Pumped_Message gas_pumped_msg = ab_fac.Create_Gas_Pumped_Message();
		gas_pumped_msg.GasPumpedMsg(dataStore);
	}
	
	public void StopMsg()
	{
		System.out.println("\n OUTPUT :- Action StopMsg\n");
		Stop_Message stop_msg = ab_fac.Create_Stop_Message();
		stop_msg.StopMsg();
	}
	
	public void PrintReceipt()
	{
		System.out.println("\n OUTPUT :- Action PrintReceipt\n");
		Print_Receipt print_receipt = ab_fac.Create_Print_Receipt();
		print_receipt.PrintReceipt(dataStore);
	}
	
	public void CancelMsg()
	{
		System.out.println("\n OUTPUT :- Action CancelMsg  ");
		Cancel_Message cancel_msg = ab_fac.Create_Cancel_Message();
		cancel_msg.CancelMsg();
	}
}
