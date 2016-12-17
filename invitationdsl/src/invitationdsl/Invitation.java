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
			generateTextFile(inv);
			}
		}
		
		public static void generateTextFile(Invitation inv){
			 try{
				    PrintWriter writer = new PrintWriter("Invitation-"+inv.nomInvite+".txt", "UTF-8");
					writer.println("---------------Invitation---------------");
				    writer.println("Nom de l'invite : "+inv.nomInvite);
				    writer.println("Nom de la conference : "+inv.nom);
					writer.println("Theme de la conference : "+inv.theme);
					writer.println("Date de la conference : "+inv.date);
					writer.println("Lieu de la conference : "+inv.lieu);
					for (String c : inv.conferenciers){
					writer.println("Conferenciers : "+c);
					}
				    writer.close();
				} catch (IOException e) {
				   System.out.println("Création échouée du fichier texte!!");
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

