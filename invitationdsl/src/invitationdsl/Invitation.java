package invitationdsl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Invitation {

			
		private String nomInvite;
		private String nomConference;
		private String lieuConference;
		private String[] conferenciers;
		private String themeConference;
		private Date dateConference;
		
		
		protected void nomInvite( String nomInv ) { nomInvite = nomInv; }

		protected void conferenciers( String... confs ) {
			conferenciers = confs.clone();
		}
	
		protected void nomConference( String nomConf ) {
			nomConference = nomConf;
		}
		
		protected void themeConference( String themeConf ) {
			themeConference = themeConf;
		}
		
		protected void lieuConference( String lieuConf ) {
			lieuConference = lieuConf;
		}
		protected void dateConference( String dateInString ) {
			
			SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
			try {
				dateConference = format1.parse( dateInString );
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
				
		Invitation( InvitationBuilder d ) {
			d.build( this );
			}
		
		public static void printInvitation(Invitation inv)
		{
			System.out.println("---------------Invitation---------------");
			System.out.println("Nom de l'invite : "+inv.nomInvite);
			System.out.println("Nom de la conference : "+inv.nomConference);
			System.out.println("Theme de la conference : "+inv.themeConference);
			System.out.println("Date de la conference : "+inv.dateConference);
			System.out.println("Lieu de la conference : "+inv.lieuConference);
			for (String c : inv.conferenciers){
			System.out.println("Conferenciers : "+c);
			}
		}
		
		
		public String NomInvite() {
			return nomInvite;
		}
		public String NomConference() {
			return nomConference;
		}
		public String LieuConference() {
			return lieuConference;
		}
		public String[] Conferenciers() {
			return conferenciers;
		}
		public String ThemeConference() {
			return themeConference;
		}
		public Date DateConference() {
			return dateConference;
		}
		
		
		
	
}

