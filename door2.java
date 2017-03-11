import java.util.Random;
import java.util.Scanner;


public class door2 extends Thread{
	private int process_number;
	private int process_burst_number;
	private int process_max_burst;
	private int time_needed;
	private int wait_time;
	private int estimated_burst=500;
	private boolean done;
	private String position;

	
	public void SJF() {
		
		//Lets the user enter the number of the process
		System.out.println("Please enter the number of the process: ");
		Scanner keyboard=new Scanner(System.in);
		int a=keyboard.nextInt();
		set_process_number(a);
		
		
		//Lets the user define the number of burst cycles
		//dont forget to correct these loops
		System.out.println("Please enter the number of burst cycles of this process: ");
		int b= keyboard.nextInt();
		boolean r1=true;
		while(r1=true){
			if( 2>b || b>20){
				System.out.println("Invalid value, please try again");
				break;
			}
			else{
				set_process_burst_number(b);
				break;
			}
		}
		
		
		//Lets the user define the max limit of burst cycles
		System.out.println("Please enter the max length of burst cycles: ");
		int c= keyboard.nextInt();
		boolean r2=true;
		while(r2=true){
			if(2>c || c>1000){
				System.out.println("Invalid value, please try again");
				break;
			}
			else{
				set_process_burst_number(c);
				break;
			}
		}
		
		//Lets the user define how much running time the process needs until it finishes its task
		System.out.println("Please enter the time needed to finish this process: ");
		int d= keyboard.nextInt();
		set_time_needed(d);
		
		System.out.println("Implemented process "
				 + get_process_number() + " with "+ 
							get_process_burst_number() + " burst cycles, with " + 
							get_process_max_burst()+ " as maximum burst per cycle "+ ", and it needs "+ 
							get_time_needed()+ " to finish.\n");
		
	}
	
	//random number generator for the first part of the actual burst time
	public int root(){
		Random r1=new Random();
		int r2= r1.nextInt((9) + 1) + 1;
		return r2*100;
	}
	//random number generator for the second part of actual burst time
	public int root2(){
			Random r1=new Random();
			int r2= r1.nextInt((9) + 1) + 1;
			return r2;
	}
	
	//random number generator for the wait cycle of each process
	public int wait_cycle(){
		Random r1=new Random();
		int r2=r1.nextInt((999)+1)+1;
		return r2;
	}
	

	//getter and setters of the private variables
	public int get_process_number() {
		return process_number;
	}

	public void set_process_number(int process_number) {
		this.process_number = process_number;
	}

	public int get_process_burst_number() {
		return process_burst_number;
	}



	public void set_process_burst_number(int process_burst_number) {
		this.process_burst_number = process_burst_number;
	}



	public int get_process_max_burst() {
		return process_max_burst;
	}

	public void set_process_max_burst(int process_max_burst) {
		this.process_max_burst = process_max_burst;
	}

	public void set_done(boolean done) {
		this.done = done;
	}
	
	public boolean get_done(){
		return done;
	}

	public int get_time_needed() {
		return time_needed;
	}

	public void set_time_needed(int time_needed) {
		this.time_needed = time_needed;
	}

	public int get_wait_time() {
		return wait_time;
	}

	
	public void set_wait_time() {
		int x= wait_cycle();
		this.wait_time = x;
	}

	public String get_position() {
		return position;
	}

	public void set_position(String position) {
		this.position = position;
	}

	public int get_estimated_burst() {
		return estimated_burst;
	}

	public void set_estimated_burst(int estimated_burst) {
		this.estimated_burst = estimated_burst;
	}

}
