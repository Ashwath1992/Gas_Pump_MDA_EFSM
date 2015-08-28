package abstract_factory;

import data_store.*;
import strategy.*;

public interface Abstract_Factory 
{
	public DataStore Create_Data_Store();
	public Store_Data Create_Store_Data();
	public Store_Cash Create_Store_Cash();
	public Pump_Gas_Unit Create_Pump_Gas_Unit();
	public Set_Initial_Values Create_Set_Intial_Values();
	public Gas_Pumped_Message Create_Gas_Pumped_Message();
	public Reject_Message Create_Reject_Message();
	public Ready_Message Create_Ready_Message();
	public Pay_Message Create_Pay_Message();
	public Stop_Message Create_Stop_Message();
	public Cancel_Message Create_Cancel_Message();
	public Print_Receipt Create_Print_Receipt();
	public Display_Menu Create_Display_Menu();
	public Set_W Create_SetW(int k);
	public Set_Price Create_SetPrice(int g);
}
