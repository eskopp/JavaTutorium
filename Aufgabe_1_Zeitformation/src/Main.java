import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Aufgabe: Zeitformatierung
        // Gegeben ist eine lange Zeitdauer in Sekunden.
        // Gesucht ist ein Programm, das diese Zeitdauer in Tage, Stunden, Minuten und Sekunden umrechnet.
        // Beispiel:
        // Eingabe: 284712
        // Ausgabe: 3 Tage, 7 Stunden, 5 Minuten und 12 Sekunden

        Scanner scanner = new Scanner(System.in);

        // Eingabe der Zeitdauer in Sekunden
        System.out.print("Geben Sie die Zeitdauer in Sekunden ein: ");
        long gesamtSekunden = scanner.nextLong();

        // Umrechnung
        long tage = gesamtSekunden / (24 * 3600); // Sekunden pro Tag
        long restSekunden = gesamtSekunden % (24 * 3600);

        long stunden = restSekunden / 3600; // Sekunden pro Stunde
        restSekunden %= 3600;

        long minuten = restSekunden / 60; // Sekunden pro Minute
        long sekunden = restSekunden % 60; // Übrig bleibende Sekunden

        // Ausgabe der umgerechneten Zeit
        System.out.printf("%d Tage, %d Stunden, %d Minuten und %d Sekunden\n", tage, stunden, minuten, sekunden);

        scanner.close();
    }
}
