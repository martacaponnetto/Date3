import java.time.DayOfWeek;
import java.time.OffsetDateTime;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console*/
public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int anno = dateTime.getYear();
        int mese = dateTime.getMonthValue();
        int giorno = dateTime.getDayOfMonth();
        String giornoDellaSett = String.valueOf(dateTime.getDayOfWeek());
        System.out.println("anno : " + anno);
        System.out.println("mese : " + mese);
        System.out.println("giorno : " + giorno);
        System.out.println("giorno della settimana : " + giornoDellaSett);



    }
}