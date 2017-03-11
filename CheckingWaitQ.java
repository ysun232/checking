
public class CheckingWaitQ extends door {
	public CheckingWaitQ(){
		if(get_position()== "wait queue"){
		System.out.println("process "+ get_process_number()+ " wait time: "+ get_wait_time());	
		}
		else {
			
			System.out.println("This process is not ready to be moved to readyQ");
		}
		}
}
