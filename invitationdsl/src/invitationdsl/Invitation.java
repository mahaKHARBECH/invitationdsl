package invitationdsl;

import java.io.IOException;
import java.io.PrintWriter;
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
		
		
		public void nomInvite( String nomInv ) { nomInvite = nomInv; }

		public void conferenciers( String... confs ) {
			conferenciers = confs.clone();
		}
	
		public void nom( String nomConf ) {
			nom = nomConf;
		}
		
		public void theme( String themeConf ) {
			theme = themeConf;
		}
		
		public void lieu( String lieuConf ) {
			lieu = lieuConf;
		}
		
		public void date( String dateInString ) {
			
			SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
			try {
				date = format1.parse( dateInString );
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
				
		public Invitation( InvitationBuilder d ) {
			d.build( this );
			}
		
		 @Override
	public String toString() {
		String conferences = "Conferenciers : ";
		for (String c : this.conferenciers) {
			conferences = conferences + "" + c;
		}

		return "---------------Invitation---------------" 
		        + "\n Nom de l'invite : " + this.nomInvite
				+ "\n Nom de la conference : " + this.nom
				+ "\n Theme de la conference : " + this.theme
				+ "\n Date de la conference : " + conferences + this.date
				+ "\n Lieu de la conference : " + this.lieu;
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

