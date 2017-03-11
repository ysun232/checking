
public class CheckingWaitQ2 extends door2{
	public CheckingWaitQ2(){
	if(get_position()== "wait queue"){
	System.out.println("process "+ get_process_number()+ " wait time: "+ get_wait_time());	
	}
	else {
		
		System.out.println("This process is not ready to be moved to readyQ");
	}
	}
}
