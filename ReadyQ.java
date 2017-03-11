
public class ReadyQ extends door{
	public ReadyQ(){
		if(get_position()=="ready" ){
			System.out.println("Process "+get_process_number()+
					", cycle count: "+get_process_burst_number());
		}
	}
}
