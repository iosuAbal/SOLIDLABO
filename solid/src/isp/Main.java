package isp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emailable ga = new GmailAccount("Alex", "alejo.amenabar@gmail.com");
		
		EmailSender.sendEmail(ga, "emailMessage");
	}

}
