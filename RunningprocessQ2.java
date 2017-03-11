
public class RunningprocessQ2 extends door2{
	public RunningprocessQ2(){
		//if the process is not done, then it will print out everything in the 
		//running for the current process
		
		//also if the burst burst time planned for this process is larger than the max
		//burst time set, then it will print the max burst time
		//else, it will print the max burst time set
		if(get_done()==false){
		System.out.println("/nwait time in the readyQ (ms): "+ get_wait_time());
		if (get_process_max_burst()>get_time_needed()){
		System.out.println("/nburst time (ms): "+get_time_needed());
		System.out.println("/nremaining cycles: "+ get_process_burst_number());
		set_process_burst_number(0);
		System.out.println("process has terminated");
		set_done(true);
		}
		
		else{
			System.out.println("/nburst time (ms): "+ get_process_max_burst());
			int x=get_time_needed()-get_process_max_burst();
			set_time_needed(x);
			System.out.println("/nremaining cycles: "+ get_process_burst_number());
			int y=get_process_burst_number();
			set_process_burst_number(y-1);
			set_wait_time();
			System.out.println("process moved to wait Q for "+ get_wait_time());
			
			}
		}
	}
}
