package invitationdsl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Invitation {

			
		private String nomInvite;
		private String nom;
		private String lieu;
		private String[] conferenciers;
		private String theme;
		private Date date;
		
		
		protected void nomInvite( String nomInv ) { nomInvite = nomInv; }

		protected void conferenciers( String... confs ) {
			conferenciers = confs.clone();
		}
	
		protected void nom( String nomConf ) {
			nom = nomConf;
		}
		
		protected void theme( String themeConf ) {
			theme = themeConf;
		}
		
		protected void lieu( String lieuConf ) {
			lieu = lieuConf;
		}
		protected void date( String dateInString ) {
			
			SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
			try {
				date = format1.parse( dateInString );
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
				
		Invitation( InvitationBuilder d ) {
			d.build( this );
			}
		
		public static void print(Invitation inv)
		{
			System.out.println("---------------Invitation---------------");
			System.out.println("Nom de l'invite : "+inv.nomInvite);
			System.out.println("Nom de la conference : "+inv.nom);
			System.out.println("Theme de la conference : "+inv.theme);
			System.out.println("Date de la conference : "+inv.date);
			System.out.println("Lieu de la conference : "+inv.lieu);
			for (String c : inv.conferenciers){
			System.out.println("Conferenciers : "+c);
			}
		}
		
		
		public String nomInvite() {
			return nomInvite;
		}
		public String nom() {
			return nom;
		}
		public String lieu() {
			return lieu;
		}
		public String[] conferenciers() {
			return conferenciers;
		}
		public String theme() {
			return theme;
		}
		public Date date() {
			return date;
		}
		
		
		
	
}

