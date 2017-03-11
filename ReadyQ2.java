
public class ReadyQ2 extends door2{
	public ReadyQ2(){
		if(get_position()=="ready" ){
			System.out.println("Process "+get_process_number()+
					", cycle count: "+get_process_burst_number()+ 
					" , estimated burst: "+ get_estimated_burst());
		}
	}
}
