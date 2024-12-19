import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
 
  public static void main(String[] args) {

      // Déclaration des variables pour les adresses réseau

      InetAddress LocaleAdresse;

      InetAddress ServeurAdresse;

      try {

          // Récupère l'adresse IP locale (celle de la machine exécutant le programme)

          LocaleAdresse = InetAddress.getLocalHost();

          System.out.println("L'adresse locale est : " + LocaleAdresse);

          // Récupère l'adresse IP associée à un nom de domaine (www.perdu.com ici)

          ServeurAdresse = InetAddress.getByName("www.perdu.com");

          System.out.println("L'adresse du serveur www.perdu.com : " + ServeurAdresse);

      } catch (UnknownHostException e) {

          // Gestion des erreurs si le nom de l'hôte est inconnu ou introuvable

          e.printStackTrace();

      }

  }

}

