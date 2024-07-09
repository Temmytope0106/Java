import java.util.Scanner;
public class NokiaApp{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);



	System.out.println("Hello!!!");	
	System.out.print("Enter your password to start");
	String password = input.nextLine();


	
	String welcomeMessage =           """
					 WELCOME TO MY NOKIA
				   Menu Functions
				 1. Phone book
				 2. Messages
				 3. Chat
				 4. Call register
				 5. Tones
				 6. Settings
				 7. Call divert
				 8. Games
				 9. Calculator
				 10. Reminders
				 11. Clock
				 12. Profiles
				 13. SIM services
				 14. To Switch Off

					  """;
	
	System.out.print(welcomeMessage);
	int menuNumber = input.nextInt();

	switch(menuNumber){

	case 1:	String phoneBookMenu =   	"""
					   Enter a menu
					     1. Search
					     2. Service Nos
					     3. Add name
					     4. Erase
					     5. Edit
					     6. Assign tone
					     7. Send b'card
					     8. Options
					     9. Speed dials
					     10. Voice tags
					     11. Go Back

						    """;

			System.out.print(phoneBookMenu);
			int phoneBookList = input.nextInt();

			switch(phoneBookList){
			case 1: System.out.print("Search");
				break;
		
			 case 2: System.out.print("Service Nos");
				 break;

		 	case 3: System.out.print("Add name");
			 	break;

		 	case 4: System.out.print("Erase");
				 break;
		 
		 	case 5: System.out.print("Edit");
			 	break;

		 	case 6: System.out.print("Assign tone");
			 	break;

		  	case 7: System.out.print("Send b'card");
			  	break;

		   	case 8: String optionsMenu =        """
						  	Enter a menu
							1. Type of view
							2. Memory status
							3. Go Back
				
				        		       """;

				System.out.print(optionsMenu);
				int optionsMenuList = input.nextInt();

				switch(optionsMenuList){
				case 1: System.out.print("Type of menu");
				break;
		
				 case 2: System.out.print("Memory status");
				 break;
				
				 case 3: System.out.print(phoneBookMenu);
					 break;

		 		default: System.out.print("whyyyyyy now.");

				}

			  	 break;

		 	 case 9: System.out.print("Speed dials");
			  	 break;
		
		 	 case 10: System.out.print("Voice tags");
			   	 break;
			
			 case 11: System.out.print(welcomeMessage);
				  break;

		  	 default: System.out.print("Whyyyy now.");
			   
			   	  }
					break; 
	
	case 2:  String messageMenu =        """
					Enter a menu
					1. Write messages
					2. Inbox
					3. Outbox
					4. Picture messages
					5. Templates
					6. Smileys
					7. Message settings
					8. Info service
					9. Voice mailbox number
					10. Service command editor
					11. Go Back
				
				        	 """;

			System.out.print(messageMenu);
			int messageMenuList = input.nextInt();

			switch(messageMenuList){
			case 1: System.out.print("Write messages");
				break;
		
			case 2: System.out.print("Inbox");
			 	break;

			case 3: System.out.print("Outbox");
			 	break;

			case 4: System.out.print("Picture messages");
			 	break;
		 
			case 5: System.out.print("Templates");
			 	break;

			case 6: System.out.print("Smileys");
				 break;

			case 7: String messageSettingMenu =  """
							    Enter a menu
				    		 	    1. Set 1
				    		 	    2. Common
							    3. Go Back

				        	    	        """;

				System.out.print(messageSettingMenu);
			int messageSettingMenuList = input.nextInt();

				switch(messageSettingMenuList){
			case 1: String set1Menu =        """
						     Enter a menu
					           1. Message centre number
					            2. Message sent as
					             3. Message validity
						    4. Go Back
				
				        	              """;

						System.out.print(set1Menu);
					int set1MenuList = input.nextInt();

					switch(set1MenuList){
			  case 1: System.out.print("Message centre number");
			  	  break;
		
			  case 2: System.out.print("Message sent as");
				  break;

			  case 3: System.out.print("Message validity");
				  break;
		
			  case 4: System.out.print(messageSettingMenu);
				  break;


		   	 default: System.out.print("whyyyyyy now.");

				  }

				   break;
		
		 	case 2: String commonMenu =        """
							Enter a menu
					     	    1. Delivery report
					     	    2. Reply via same centre
					    	    3. Character support
						    4. Go Back
				
				      		               """;

				System.out.print(commonMenu);
				int commonMenuList = input.nextInt();

				switch(commonMenuList){
				case 1: System.out.print("Delivery report");
					break;
		
		 	case 2: System.out.print("Reply via same centre");
			 	break;

			 case 3: System.out.print("Character support");
			 	break;

			 case 4: System.out.print(messageSettingMenu);
				 break;

			 default: System.out.print("whyyyyyy now.");

					}

			 break;

		 default: System.out.print("whyyyyyy now.");

		}

			  break;

			case 8: System.out.print("Info service");
			  	break;

			case 9: System.out.print("Voice mailbox number");
			 	break;

			case 10: System.out.print("Service command editor");
			  	break;
	
			case 11: System.out.print(messageMenu);
				 break;

			default: System.out.print("whyyyyyy now.");

				}
					break;
	
	case 3: System.out.print("Chat");
		break;

	case 4:  String callRegisterMenu =        """
						Enter a menu
						1. Missed calls
						2. Received calls
						3. Dialled numbers
						4. Erase recent call lists
						5. Show call duration
						6. Show call costs
						7. Call cost settings
						8. Prepaid credit
						9. Go Back
				         
							 """;

			System.out.print(callRegisterMenu);
			int callRegisterMenuList = input.nextInt();

			switch(callRegisterMenuList){
			case 1: System.out.print("Missed calls");
			break;
		
			case 2: System.out.print("Received calls");
			 	break;

			case 3: System.out.print("Dialled numbers");
				 break;

			case 4: System.out.print("Erase recent call lists");
				 break;
		 
		case 5: String callDurationMenu =        """
					    		 Enter a menu
					    	1. Last call duration
				     	    	2. All calls' duration
					    	3. Received calls' duration
					    	4. Dialled calls'duration
					    	5. Clear timers
						6. Go Back
				
				         	    		""";

				System.out.print(callDurationMenu);
				int callDurationMenuList = input.nextInt();

				switch(callDurationMenuList){
			case 1: System.out.print("Last call duration");
				break;
		
		 	case 2: System.out.print("All calls' duration");
			 	break;

		 case 3: System.out.print("Received calls' duration");
				 break;

		 	case 4: System.out.print("Dialled calls'duration");
			 	break;
		 
		 	case 5: System.out.print("Clear timers");
					 break;

			case 6: System.out.print(callRegisterMenu);
				break;

			 default: System.out.print("whyyyyyy now.");

				}

			 break;

			case 6: String callCostMenu =          """
					   		Enter a menu
							1. Last call cost
							2. All calls' cost
							3. Clear counters
							4. Go Back
				
				         			""";

				System.out.print(callCostMenu);
				int callCostMenuList = input.nextInt();

				switch(callCostMenuList){
				case 1: System.out.print("Last call cost");
					break;
		
		 		case 2: System.out.print("All calls' cost");
			 		break;

		 		case 3: System.out.print("Clear counters");
			 		break;

				case 4: System.out.print(callRegisterMenu);
					break;

		 		default: System.out.print("whyyyyyy now.");

						}
					break;

			case 7: String callCostSettingMenu =        """
						  	      Enter a menu
							  1. Call cost limit
							      2. Show costs
							   3. Go Back
				
				         			""";

				System.out.print(callCostSettingMenu);
			int callCostSettingMenuList = input.nextInt();

				switch(callCostSettingMenuList){
				case 1: System.out.print("Call cost limit");
					break;
		
		 		case 2: System.out.print("Show costs");
			 		break;

				case 3: System.out.print(callRegisterMenu);
					break;

		 		default: System.out.print("whyyyyyy now.");

					}

					break;
		
				case 8: System.out.print("Prepaid credit");
			 		 break;

				case 9: System.out.print(welcomeMessage);
					break;
		
				default: System.out.print("Why now.");	

						}
						break;
		
	case 5: String tonesMenu =      		  """
							Enter a menu
						1. Ringing tone
						2. Ringing volume
						3. Incoming call alert
						4. Composer
						5. Message alert tone
						6. Keypad tones
						7. Warning and game tones
						8. Vibrating alert
						9. Screen saver
						10. Go Back
				         		 """;

				System.out.print(tonesMenu);
				int toneMenuList = input.nextInt();

				switch(toneMenuList){
				case 1: System.out.print("Ringing tone");
					break;
		
		 		case 2: System.out.print("Ringing volume");
					 break;

		 	case 3: System.out.print("Incoming call alert");
					 break;

				 case 4: System.out.print("Composer");
					 break;
		 
		 	case 5: System.out.print("Message alert tone");
			 	break;

				 case 6: System.out.print("Keypad tones");
			 		break;

		  	case 7: System.out.print("Warning and game tones");
			  	break;
		
		  		case 8: System.out.print("Vibrating alert");
			 		 break;
		
				 case 9: System.out.print("Screen saver");
					 break;

				 case 10: System.out.print(welcomeMessage);
					  break;
		
				 default: System.out.print("Why now.");	

						}
		
						break;
	
	case 6:   String settingsMenu =   		     """
							Enter a menu
							1. Call settings
							2. Phone settings
							3. Security settings
						4. Restore factory settings
							5. Go Back	
			             				  """;

				System.out.print(settingsMenu);
				int settingsMenuList = input.nextInt();

				switch(settingsMenuList){
		case 1: String callSettingMenu =               """
						   		Enter a menu
					    		1. Automatic Redial
					   		 2. Speed dialling
					    	3. Call waiting options
					    	4. Own number sending
					    		5. Phone line in use
					   		 6. Automatic answer
							7. Go Back
			
				        	       		 """;

					System.out.print(callSettingMenu);
				int callSettingMenuList = input.nextInt();

				switch(callSettingMenuList){
			case 1: System.out.print("Automatic redial");
				break;
		
		 		case 2: System.out.print("Speed dialling");
			 		break;

		 	case 3: System.out.print("Call waiting options");
				 break;

		 	case 4: System.out.print("Own number sending");
			 	break;
		 
		 	case 5: System.out.print("Phone line in use");
			 	break;

			case 6: System.out.print("Automatic answer");
				break;

			case 7: System.out.print(settingsMenu);
				break;

		 	default: System.out.print("whyyyyyy now.");

					}

				break;
		
		    case 2: String phoneSettingMenu =       """
					   		 Enter a menu
					     		1. Language
					    		2. Cell info display
					     		 3. Welcome note
					     		4. Network selection
					        		 5. Light
					    6. Confirm SIM service actions
							7. Go Back
				
				       		    		""";

				System.out.print(phoneSettingMenu);
				int phoneSettingMenuList = input.nextInt();

			switch(phoneSettingMenuList){
			case 1: System.out.print("Language");
					break;
		
		 	case 2:	System.out.print("Cell info display");
			 	break;

		 	case 3: System.out.print("Welcome note");
			 	break;

		 	case 4: System.out.print("Network selection");
			 	break;
		 
			case 5: System.out.print("Lights");
			 	break;

		case 6: System.out.print("Confirm SIM service actions");
			break;

			case 7: System.out.print(settingsMenu);
				break;

		 	default: System.out.print("whyyyyyy now.");

			}
			 	break;

	case 3: String securitySettingMenu =         """
							Enter a menu
					      		1. PIN code request
					     	 2. Call baring service
					     		 3. Fixed dialling
					     	 4. Closed user group
					      		5. Phone security
					      	6. Change access codes
							7. Go back
				
				          	       """;

			System.out.print(securitySettingMenu);
			int securitySettingMenuList = input.nextInt();

			switch(securitySettingMenuList){
			case 1: System.out.print("PIN code request");
				break;
		
		 	case 2: System.out.print("Call baring service");
				 break;

		 	case 3: System.out.print("Fixed dialling");
			 	break;

		 	case 4: System.out.print("Closed user group");
			 	break;
		 
		 	case 5: System.out.print("Phone security");
			 	break;

			case 6: System.out.print("Change access codes");
				break;

			case 7: System.out.print(settingsMenu);
				break;

		 	default: System.out.print("whyyyyyy now.");

				}

			 	break;

		case 4: System.out.print("Restore factory settings");
			 	break;

		case 5: System.out.print(welcomeMessage);
			break;
		 
			default: System.out.print("Why now.");	

				}
		
				break;
	case 7: System.out.print("Call divert");
		
		break;
	case 8: System.out.print("Games");
		
		break;
	case 9: System.out.print("Calculator");
		
		break;
	case 10:System.out.print("Reminders");
		
		break;
	case 11:String clockMenu = 	       """
					Enter a menu
					1. Alarm clock
					2. Clock settings
					3. Date setting
					4. Stopwatch
					5. Countdown timer
				       6. Auto update of date and time
					7. Go Back
				
				         	""";

				System.out.print(clockMenu);
				int clockMenuList = input.nextInt();

				switch(clockMenuList){
				case 1: System.out.print("Alarm clock");
					break;
		
		 		case 2: System.out.print("Clock settings");
					 break;

				 case 3: System.out.print("Date setting");
					 break;

		 		case 4: System.out.print("Stopwatch");
			 		break;
		 
		 		case 5: System.out.print("Countdown timer");
					 break;

		 case 6: System.out.print("Auto update of date and time");
			 break;

				case 7: System.out.print(welcomeMessage);

		 		default: System.out.print("why now.");

					}
					break;
	
	case 12:System.out.print("Profiles");
		
		break;
	case 13:System.out.print("SIM services");
		
		break;
	default: System.out.print("Why nowwww.");

	}
}
}