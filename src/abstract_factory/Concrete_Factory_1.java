package abstract_factory;

import data_store.DataStore;
import data_store.Datastore_1;
import strategy.*;

public class Concrete_Factory_1 implements Abstract_Factory
{
	DataStore data_store = new Datastore_1();
	Store_Data store_data = new Store_Data_1();
	Store_Cash store_cash = new Store_Cash_1();
	Set_Initial_Values set_initial_values = new Set_Initial_Values_1();
	Pump_Gas_Unit pump_gas_unit = new Pump_Gas_Unit_1();
	Display_Menu display_menu = new Display_Menu_1();
	Print_Receipt print_receipt = new Print_Receipt_1();
	Reject_Message reject_message = new Reject_Message_1();
	Ready_Message ready_message = new Ready_Message_1();
	Gas_Pumped_Message gas_pumped_message = new Gas_Pumped_Message_1();
	Pay_Message pay_message = new Pay_Message_1();
	Cancel_Message cancel_message = new Cancel_Message_1();
	Stop_Message stop_message = new Stop_Message_1();
	Set_W set_w1 = new Set_W_1();
	Set_Price set_price1 = new Set_Price_1();
	
	
	public void ConcreteFactory()
	{
		
	}
	
	public DataStore Create_Data_Store()
	{
		return this.data_store;
	}
	
	public DataStore Get_Data_Store()
	{
		return this.data_store;
	}
	
	public Store_Data Create_Store_Data()
	{
		return this.store_data;
	}
	
	public Pay_Message Create_Pay_Message()
	{
		return this.pay_message;
	}
	
	public Store_Cash Create_Store_Cash()
	{
		return this.store_cash;
	}
	
	public Display_Menu Create_Display_Menu()
	{
		return this.display_menu;
	}
	
	public Reject_Message Create_Reject_Message()
	{
		return this.reject_message;
	}
	
	public Set_Initial_Values Create_Set_Initial_Values()
	{
		return this.set_initial_values;
	}
	
	public Pump_Gas_Unit Create_Pump_Gas_Unit()
	{
		return this.pump_gas_unit;
	}
	
	public Gas_Pumped_Message CreateGasPumpedMsg()
	{
		return this.gas_pumped_message;
	}
	
	public Stop_Message Create_Stop_Message()
	{
		return this.stop_message;
	}
	
	public Print_Receipt Create_Print_Receipt()
	{
		return this.print_receipt;
	}
	
	public Cancel_Message Create_Cancel_Message()
	{
		return this.cancel_message;
	}

	@Override
	public Set_W Create_SetW(int k) 
	{
		// TODO Auto-generated method stub
		return this.set_w1;
	}

	@Override
	public Set_Price Create_SetPrice(int g) 
	{
		// TODO Auto-generated method stub
		return this.set_price1;
	}

	@Override
	public Ready_Message Create_Ready_Message() 
	{
		// TODO Auto-generated method stub
		return this.ready_message;
	}

	@Override
	public Set_Initial_Values Create_Set_Intial_Values() 
	{
		// TODO Auto-generated method stub
		return this.set_initial_values;
	}

	@Override
	public Gas_Pumped_Message Create_Gas_Pumped_Message() 
	{
		// TODO Auto-generated method stub
		return gas_pumped_message;
	}
}
