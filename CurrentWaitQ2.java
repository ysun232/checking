
public class CurrentWaitQ2 extends door2{
	public CurrentWaitQ2(){
		if(get_position()== "Waiting"){
			System.out.println("Process "+get_process_number()+ 
					", cycle count: "+ get_process_burst_number()+
					" , estimated burst: "+ get_estimated_burst());
		}
	}
}
