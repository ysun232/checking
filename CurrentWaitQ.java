
public class CurrentWaitQ extends door{
	public CurrentWaitQ(){
		if(get_position()== "Waiting"){
			System.out.println("Process "+get_process_number()+ 
					", wait time: "+ get_process_burst_number());
		}
	}
}
