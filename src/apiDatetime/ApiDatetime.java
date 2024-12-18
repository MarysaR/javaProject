package apiDatetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ApiDatetime {

  /* 
  Classes principales de l'API java.time

    LocalDate : Représente une date (sans heure), par exemple : 2024-12-18.
    LocalTime : Représente une heure (sans date), par exemple : 14:30:15.
    LocalDateTime : Combine une date et une heure.
    ZonedDateTime : Représente une date et une heure dans un fuseau horaire spécifique.
    Duration et Period : Pour représenter des durées (temps) et des périodes (jours, mois, années).
    DateTimeFormatter : Pour formater et analyser des dates/heures selon des motifs personnalisés. 
*/

  public static void main(String[] args) {
        // 1. Obtenir la date et l'heure actuelles
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Date actuelle : " + currentDate);
        System.out.println("Heure actuelle : " + currentTime);
        System.out.println("Date et heure actuelles : " + currentDateTime);

        // 2. Créer une date ou heure spécifique
        LocalDate specificDate = LocalDate.of(2023, Month.DECEMBER, 25);
        LocalTime specificTime = LocalTime.of(10, 30, 45);
        System.out.println("Date spécifique : " + specificDate);
        System.out.println("Heure spécifique : " + specificTime);

        // 3. Ajouter ou soustraire des jours, mois, années
        LocalDate tomorrow = currentDate.plusDays(1);
        LocalDate lastMonth = currentDate.minusMonths(1);
        System.out.println("Demain : " + tomorrow);
        System.out.println("Le mois dernier : " + lastMonth);

        // 4. Calculer la différence entre deux dates
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Jours entre le début et la fin de l'année : " + daysBetween);

        // 5. Formater une date/heure
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Date et heure formatées : " + formattedDateTime);

        // 6. Analyser une chaîne en date/heure
        String dateString = "25/12/2023 10:30:45";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
        System.out.println("Date et heure analysées : " + parsedDateTime);

        // 7. Fuseaux horaires
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("Date et heure à Paris : " + zonedDateTime);

        // 8. Durées et périodes
        Duration duration = Duration.ofHours(5); // 5 heures
        Period period = Period.ofMonths(2); // 2 mois
        LocalDate newDate = currentDate.plus(period);
        LocalTime newTime = currentTime.plus(duration);
        System.out.println("Date après 2 mois : " + newDate);
        System.out.println("Heure après 5 heures : " + newTime);
    }
}


