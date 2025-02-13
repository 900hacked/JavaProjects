package Models;

public class Member extends Base {
	
	
	
	public Member(String theMemberName, int theMemberId) {
		memberName = theMemberName;
		memberId = theMemberId;
	}
	
	public String getName() {
		return memberName;
		
	}
	
	public void setName(String newName) {
		this.memberName = newName;
	}
	
	public int getId() {
		return memberId;
	}
	
	public void setId(int newId) {
		this.memberId = newId;
	}

	public static void main(String[] args) {
		
		Member myMember = new Member("Dorian kalisa ", 778910);

	}

}
