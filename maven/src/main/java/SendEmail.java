import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

class SendEmail {
    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("poczta.interia.pl");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("dariusz.szmycinski@interia.pl", "daro3467"));
        email.setSSLOnConnect(true);
        email.setFrom("dariusz.szmycinski@interia.pl");
        email.setSubject("Siemaa");
        email.setMsg("Witam, robię super kurs programowania!");
        email.addTo("szmytek89@gmail.com");
        System.out.println("Rozpoczęto wysyłanie wiadomości email");
        email.send();
        System.out.println("Wiadomość wysłana");
    }
}