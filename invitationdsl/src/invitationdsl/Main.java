package invitationdsl;

public class Main {

	public static void main(String[] args) {
		Invitation invitation = new Invitation( inv -> {
			inv.nomInvite("James Bond");
			inv.nom("Java One");
			inv.theme("Internal DSL in Java 8");
			inv.lieu("Montreal - CANADA");
			inv.conferenciers("M. Charles Nutter, M. James Ward"); 
			inv.date("30-03-2017 09:00:00");
			} );

		System.out.print(invitation);
	}

}
