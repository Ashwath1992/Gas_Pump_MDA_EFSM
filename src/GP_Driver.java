import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import abstract_factory.Concrete_Factory_1;
import abstract_factory.Concrete_Factory_2;
import abstract_factory.Concrete_Factory_3;
import gas_pump.Gas_Pump_1;
import gas_pump.Gas_Pump_2;
import gas_pump.Gas_Pump_3;
import mda_efsm.MDA_EFSM;
import results.GP_Output;

/*
 * CLASS : Driver (Program's Main Function)
 */

public class GP_Driver
{
    public static void main( String[] args) throws IOException
    { 	    
    	BufferedReader buffer_reader = new BufferedReader(new InputStreamReader(System.in));
    	String read = null;
    	int user_ch = 1;
    	String digit_expr = "\\d+";
    	
    	System.out.println("\n\n ************** CS 586 - SOFTWARE SYSTEM ARCHITECTURE *************" );
    	System.out.println("           ************** PROJECT - GAS PUMP *************" );
    	System.out.println("\n Press any key to continue");
    	read = buffer_reader.readLine();
    	while (true)
    	{
			System.out.println(" ******************** Select Required GAS PUMP *********************\n" );
			System.out.println("          1. GAS PUMP - 1" );
			System.out.println("          2. GAS PUMP - 2" );
			System.out.println("          3. GAS PUMP - 3" );
			System.out.println("          Q. EXIT GAS PUMP");
			System.out.println("\n Please select one of the three GAS PUMP."); 
			
			read = buffer_reader.readLine();
			if(read.equalsIgnoreCase("Q"))
			{
				System.out.println(" Thank You for using GAS PUMP Operations !!");
				System.exit(0);
			}
	   
			if(read.equalsIgnoreCase("1"))
			{
		    	Concrete_Factory_1 con_fac = new Concrete_Factory_1();
		    	GP_Output write = new GP_Output(con_fac,con_fac.Get_Data_Store());
		    	MDA_EFSM mda_efsm = new MDA_EFSM(con_fac,write);
		    	Gas_Pump_1 gas_pump1 = new Gas_Pump_1(mda_efsm,con_fac.Get_Data_Store());
		    	
		    	int a,cash;
	    	
		    	System.out.println("\n *******************************************************************");
		        System.out.println("  List of GAS PUMP - 1 Operations" );
		        System.out.println("  Please make a note of these operations" );
		        System.out.println("          0. Activate(int)" );
		        System.out.println("          1. Start()" );
		        System.out.println("          2. PayCredit()" );
		        System.out.println("          3. Reject()" );
		        System.out.println("          4. Cancel()" );
		        System.out.println("          5. Approved()" );
		        System.out.println("          6. PayCash(int)" );
		        System.out.println("          7. StartPump()" );
		        System.out.println("          8. PumpGallon()" );
		        System.out.println("          9. StopPump()" );
		        System.out.println("          X. Quit the GAS PUMP - 1 Operations\n" );		  	    	
		        System.out.println("           Executing GAS PUMP - 1" );
		          
		        while (true) 
		        {      	
		        	System.out.println("\n  Select Operation: ");
		        	System.out.println("\t\t0. Activate\t\t1. Start\t\t2. PayCredit\n\t\t3. Reject\t\t4. Cancel\t\t5. Approved\n\t\t6. PayCash\t\t7. StartPump\t\t8. PumpGallon\n\t\t9. StopPump\t\tX. Quit");
		             
					read = buffer_reader.readLine();
		
		            if(read.isEmpty()) 
		            	continue;
		            if(read.equalsIgnoreCase("X"))
		            	break;
		            
		            if(!read.matches(digit_expr))
		            {
		            	System.out.println(" Choice is a Digit, not a character !");
		            	continue;
		            }
		            
		            user_ch = Integer.parseInt(read);
		            
		            switch(user_ch)
		            {
		             	case 0:  
		             		System.out.println("\n   Operation:  Activate(int a)");
		             		System.out.println("   Enter value of the Activate parameter (a):");
		             		read = buffer_reader.readLine();
		             		a = Integer.parseInt(read);
		             		gas_pump1.Activate(a);
		      				break;
		      			
		             	case 1:   
			      			System.out.println("\n   Operation:  Start()");
			      			System.out.println("   Select Payment:");
			      			System.out.println("   1. Cash");
			      			System.out.println("   2. Credit");
			      			read = buffer_reader.readLine();
			      			int pay = Integer.parseInt(read);
			      			gas_pump1.Start();
			      			break;
		
			      	   	case 2: 
			      			System.out.println("  Operation:  PayCredit()");
			      			System.out.println("  Waiting for Approval");
			      			gas_pump1.PayCredit();
			      			break;
		
			      	    case 3: 
			      			System.out.println("  Operation:  Reject()");
			      			gas_pump1.Reject();
			      			break;
			      				
			      	    case 4: 
			      			System.out.println("  Operation:  Cancel()");
			      			gas_pump1.Cancel();
			      			break;
		
			      	    case 5:  
			      			System.out.println("  Operation:  Approved()");
			      			gas_pump1.Approved();
			      			break;
		
			      	    case 6: 
			      			System.out.println("  Operation:  PayCash(int c)");
			      			System.out.println(" Enter the PayCash Amount:");
			      			read = buffer_reader.readLine();
			      			cash = Integer.parseInt(read);
			      			gas_pump1.PayCash(cash);
			      			break;
		
			      	    case 7:  
			      			System.out.println("  Operation:  StartPump()");		
			      			gas_pump1.StartPump();
			      			break;
		
			      	    case 8:  
			      			System.out.println("  Operation:  PumpGallon()");
			      			gas_pump1.PumpGallon();
			      			break;
			      		
			      	    case 9:  
			      			System.out.println("  Operation:  StopPump()");
			      			gas_pump1.StopPump();
			      			break;
			      			
			      		default:
			      			System.out.println(" Select a Valid Gas Pump Operation.");
			      			break;
		            }
		        }
		        System.out.println(" Thank you for using GAS PUMP - 1\n" );
			}
			else if(read.equalsIgnoreCase("2"))
			{
				Concrete_Factory_2 con_fac = new Concrete_Factory_2();
		    	GP_Output write = new GP_Output(con_fac,con_fac.GetDataStore());
		    	MDA_EFSM mda_efsm = new MDA_EFSM(con_fac,write);
		    	Gas_Pump_2 gas_pump2 = new Gas_Pump_2(mda_efsm,con_fac.GetDataStore());
		    	
		    	float a,b;
	    	
		    	System.out.println("\n *******************************************************************");
		        System.out.println("  List of GAS PUMP - 2 Operations" );
		        System.out.println("  Please make a note of these operations" );
		        System.out.println("          0. Activate(float, float)" );
		        System.out.println("          1. Start()" );
		        System.out.println("          2. PayCredit()" );
		        System.out.println("          3. Reject()" );
		        System.out.println("          4. Cancel()" );
		        System.out.println("          5. Approved()" );
		        System.out.println("          6. Super()" );
		        System.out.println("          7. Regular()" );
		        System.out.println("          8. StartPump()" );
		        System.out.println("          9. PumpGallon()" );
		        System.out.println("          10. StopPump()" );
		        System.out.println("          X. Quit the GAS PUMP - 2 Operations\n" );		  	    	
		        System.out.println("           Executing GAS PUMP - 2" );
		          
		        while (true) 
		        {
		        	
		        	System.out.println("\n  Select Operation: ");
		        	System.out.println("\n\t\t0. Activate\t\t1. Start\t\t2. PayCredit\n\t\t3. Reject\t\t4. Cancel\t\t5. Approved\n\t\t6. Super\t\t7. Regular\t\t8. StartPump\n\t\t9. PumpGallon\t\t10. StopPump\t\tX. Quit");
		             
					read = buffer_reader.readLine();
		            if(read.isEmpty()) 
		            	continue;
		            if(read.equalsIgnoreCase("X"))
		            	break;
		            
		            if(!read.matches(digit_expr))
		            {
		            	System.out.println(" Choice is a Digit, not a character !");
		            	continue;
		            }
		            
		            user_ch = Integer.parseInt(read);
		            
		            switch(user_ch)
		            {
		             	case 0:   
		             		System.out.println("\n   Operation:  Activate(float a, float b)");
		      				System.out.println("   Enter value of the Activate parameter (a):");
		      				read = buffer_reader.readLine();
		      				a = Float.parseFloat(read);
		      				System.out.println("   Enter value of the Activate parameter (b):");
		      				read = buffer_reader.readLine();
		      				b = Float.parseFloat(read);
		      				gas_pump2.Activate(a,b);
		      				break;
		      			
		             	case 1:   
			      			System.out.println("\n  Operation:  Start()");
			      			System.out.println("   Select Payment:");
			      			System.out.println("   1. Credit");
			       			gas_pump2.Start();
			      			break;
		
		             	case 2:  
			      			System.out.println("  Operation:  PayCredit()");
			      			System.out.println("  Waiting for approval");
			      			gas_pump2.PayCredit();
			      			break;
		
			      	    case 3:  
			      			System.out.println("  Operation:  Reject()");
			      			gas_pump2.Reject();
			      			break;
			      				
			      	    case 4:  
			      			System.out.println("  Operation:  Cancel()");
			      			gas_pump2.Cancel();
			      			break;
		
			      	    case 5:  
			      			System.out.println("  Operation:  Approved()");
			      			gas_pump2.Approved();
			      			break;
		
			      	    case 6:  
			      			System.out.println("  Operation:  Super()");
			      			gas_pump2.Super();
			      			break;
			      			
			      	    case 7:  
			      		  	System.out.println("  Operation:  Regular()");
			      		  	gas_pump2.Regular();
			      		  	break;
			     
			      	    case 8:  
			      			System.out.println("  Operation:  StartPump()");		
			      			gas_pump2.StartPump();
			      			break;
		
			      	    case 9:  
			      			System.out.println("  Operation:  PumpGallon()");
			      			gas_pump2.PumpGallon();
			      			break;
			      		
			      	    case 10: 
			      			System.out.println("  Operation:  StopPump()");
			      			gas_pump2.StopPump();
			      			break;
			      			
			      		default:
			      			System.out.println(" Select a Valid Gas Pump Operation.");
			      			break;
		            }
		        }
		        System.out.println(" Thanks for using Gas Pump - 2\n" );
			}
			else if(read.equalsIgnoreCase("3"))
			{
				Concrete_Factory_3 con_fac = new Concrete_Factory_3();
		    	GP_Output write = new GP_Output(con_fac,con_fac.GetDataStore());
		    	MDA_EFSM mda_efsm = new MDA_EFSM(con_fac,write);
		    	Gas_Pump_3 gas_pump3 = new Gas_Pump_3(mda_efsm,con_fac.GetDataStore());
		    	
		    	float cash,a,b;
	    	
		    	System.out.println("\n *******************************************************************");
		        System.out.println("  List of GAS PUMP - 3 Operations" );
		        System.out.println("  Please make a note of these operations" );
		        System.out.println("          0. Activate(float, float)" );
		        System.out.println("          1. Start()" );
		        System.out.println("          2. PayCash(float c)" );
		        System.out.println("          3. Cancel()" );
		        System.out.println("          4. Premium()" );
		        System.out.println("          5. Regular()" );
		        System.out.println("          6. StartPump()" );
		        System.out.println("          7. PumpLiter()" );
		        System.out.println("          8. StopPump()" );
		        System.out.println("          9. Receipt()" );
		        System.out.println("          10. No-Receipt()" );
		        System.out.println("          X. Quit the GAS PUMP - 3 Operations\n" );		  	    	
		        System.out.println("           Executing GAS PUMP - 3" );
		          
		        while (true) 
		        {
		        	System.out.println("\n  Select Operation: ");
		        	System.out.println("\n\t\t0. Activate\t\t1. Start\t\t2. PayCash\n\t\t3. Cancel\t\t4. Premium\t\t5. Regular\n\t\t6. StartPump\t\t7. PumpLiter\t\t8. StopPump\n\t\t9. Receipt\t\t10. No-Receipt\t\tX. Quit");
		             
					read = buffer_reader.readLine();
		            if(read.isEmpty()) 
		            	continue;
		            if(read.equalsIgnoreCase("X"))
		            	break;
		            
		            if(!read.matches(digit_expr))
		            {
		            	System.out.println(" Choice is a Digit, not a character !");
		            	continue;
		            }
		            
		            user_ch = Integer.parseInt(read);
		            
		            switch(user_ch)
		            {
		             	case 0:   
		             		System.out.println("\n   Operation:  Activate(float a, float b)");
		             		System.out.println("   Enter value of the Activate parameter (a):");
		             		read = buffer_reader.readLine();
		             		a = Float.parseFloat(read);
		             		System.out.println("   Enter value of the Activate parameter (b):");
		             		read = buffer_reader.readLine();
		             		b = Float.parseFloat(read);
		             		gas_pump3.Activate(a,b);
		             		break;
		      			
		             	case 1:   
			      			System.out.println("\n  Operation:  Start()");
			      			System.out.println("   Select Payment:");
			      			System.out.println("   1.Cash");
			      			gas_pump3.Start();
			      			break;
		
			      	   	case 2:  
			      			System.out.println("  Operation:  PayCash(float c)");
			      			System.out.println(" Enter the Amount:");
			      			read = buffer_reader.readLine();
			      			cash = Float.parseFloat(read);
			      			gas_pump3.PayCash(cash);
			      			break;
				
			      	   	case 3:  
			      			System.out.println("  Operation:  Cancel()");
			      			gas_pump3.Cancel();
			      			break;
		
			      	   	case 4:  
			      			System.out.println("  Operation:  Premium()");
			      			gas_pump3.Premium();
			      			break;
			      			
			      	   	case 5:  
			      		  	System.out.println("  Operation:  Regular()");
			      		  	gas_pump3.Regular();
			      		  	break;
			     
			      	    case 6:  
			      			System.out.println("  Operation:  StartPump()");		
			      			gas_pump3.StartPump();
			      			break;
		
			      	    case 7:  
			      			System.out.println("  Operation:  PumpLiter()");
			      			gas_pump3.PumpLiter();
			      			break;
			      		
			      	    case 8:  
			      			System.out.println("  Operation:  StopPump()");
			      			gas_pump3.StopPump();
			      			break;
			      			
			      	    case 9:  
			      			System.out.println("  Operation:  Receipt()");
			      			gas_pump3.Receipt();
			      			break;
			      	 
			      	    case 10: 
			      			System.out.println("  Operation:  NoReceipt()");
			      			gas_pump3.NoReceipt();
			      			break;
			      		
			      	    default:
			      			System.out.println(" Select a Valid Gas Pump Operation.");
			      			break;
		            }
		        }
		        System.out.println(" Thanks for using Gas Pump - 3\n" );
			}
			else
			{
				System.out.println(" Select Valid Gas Pump from the above options.");
			}
    	}
    }
}