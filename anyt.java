import java.util.Random;
import java.util.Scanner;


public class anyt {
	
	private static boolean all_done=false;
	public static void main (String[] args){
		System.out.println("Please enter the number of process that you want to run: ");
		Scanner akeyboard= new Scanner(System.in);
		int ak=akeyboard.nextInt();
		
		//i need to set up a loop so that as long as not all the processes are finished, then it will keep looping.
		for(int i=0;i<ak;i++){
			door a= new door();
			a.FCFS();
		}
		
		//First come first served scheduler
		System.out.println("** FCFS Scheduler **\n\n");
		 
		//while(){
				/*	while(){
					if(){
					System.out.println("Current ReadyQ: "\n);
					a.ReadyQ();
					}
					
					while(){
					System.out.println("Current WaitQ: \n");
					a.CurrentWaitQ();
					}
					
					while(){
					System.out.println("Running process: "+)
					if(a.RunningprocessQ()==true){
					System.out.println(a.get_process_number());
					}
					a.RunningprocessQ();
					}
					
					while(){
					System.out.println("Checking WaitQ...");
					a.CheckingWaitQ();
					}
					
					System.out.println("** Scheduling Iteration Complete **");
					}
					else{
						System.out.println("\n\nWe are done, all processes have terminated **");
					}
				}
			}*/
		
		
		//Shortest job first scheduler
		System.out.println("** SJF Scheduler **\n\n");
		
		//while(){
		/*	while(){
			if(){
			System.out.println("Current ReadyQ: "\n);
			a.ReadyQ2();
			}
			
			while(){
			System.out.println("Current WaitQ: \n");
			a.CurrentWaitQ2();
			}
			
			while(){
			System.out.println("Running process: "+)
			if(a.RunningprocessQ()==true){
			System.out.println(a.get_process_number());
			}
			a.RunningprocessQ2();
			}
			
			while(){
			System.out.println("Checking WaitQ...");
			a.CheckingWaitQ2();
			}
			
			System.out.println("** Scheduling Iteration Complete **");
			}
			else{
				System.out.println("\n\nWe are done, all processes have terminated **");
			}
		}
	}*/
	}
}
