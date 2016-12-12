package invitationdsl;

public class Main {

	public static void main(String[] args) {
		Invitation invitation = new Invitation( inv -> {
			inv.nomInvite("James Bond");
			inv.nomConference("Java One");
			inv.themeConference("Internal DSL in Java 8");
			inv.lieuConference("Montreal - CANADA");
			inv.conferenciers("M. Charles Nutter, M. James Ward"); 
			inv.dateConference("30-03-2017 09:00:00");
			} );

		Invitation.printInvitation(invitation);
	}

}
