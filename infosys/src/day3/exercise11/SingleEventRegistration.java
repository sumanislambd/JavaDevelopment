package day3.exercise11;

public class SingleEventRegistration extends EventRegistration{
	private int participantNo;
	
	public SingleEventRegistration(String name, String nameOfEvent, int participantNo){
		super(name,nameOfEvent);
		this.participantNo=participantNo;
	}

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}

	public void registerEvent(){
		
	}
}
