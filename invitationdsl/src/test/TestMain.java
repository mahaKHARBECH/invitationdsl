package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import invitationdsl.Invitation;

public class TestMain {
	
	
	private static final String NOM_INVITE = "Leonardo Lopez";
    private static final String NOM = "Ruby";
    private static final String LIEU = "Ottwaa";
    private static final String THEME = "Importance du Ruby";
    Invitation invitation;


    @Before
	public void initInvitationTest(){
    invitation = new Invitation( inv -> {
		inv.nomInvite(NOM_INVITE);
		inv.nom(NOM);
		inv.theme(THEME);
		inv.lieu(LIEU);
		} );
	}

	@Test
	public void testNomInvite() {
		assertEquals("Nom invite :", "Leonardo Lopez", invitation.nomInvite());
	}
	
	@Test
	public void testNom() {
		assertEquals("Nom :", "Ruby", invitation.nom());
	}

	@Test
	public void testLieu() {
		assertEquals("Lieu :", "Ottwaa", invitation.lieu());
	}

	@Test
	public void testTheme() {
		assertEquals("Theme :", "Importance du Ruby", invitation.theme());
	}


}
