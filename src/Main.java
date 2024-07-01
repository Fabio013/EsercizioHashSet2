/*  1 Scrivere una funzione che restituisca un hashset riempito
    2 Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
    3 Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
    4 Svuotare l'hashset, verificarlo e stampare il risultato */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Creo un HashSet utilizzando la funzione
        HashSet<String> ruoliSquadra = creaSquadra();

        // 2.1 Creare un oggetto dello stesso tipo inserito nell'HashSet...
        String nuovoRuolo = "Cc";

        // 2.2 ...e popolarlo
        ruoliSquadra.add(nuovoRuolo);

        // 3/4(??) Ciclo while con Iterator x scorrere il set, fare verifica ed eliminazione
        Iterator<String> iteratore = ruoliSquadra.iterator();
        while (iteratore.hasNext()) {
            String ruolo = iteratore.next();
            if (!ruolo.equals(nuovoRuolo)) { //se ruolo NON(!) è uguale nuovoruolo
                iteratore.remove(); //rimuovilo
            }
        }
        // 4.end Stampa ruolo copia rimasto nel set
        System.out.println("Ho trovato la traccia dell'esercizio davvero poco chiara. Spero di averla interpretata correttamente");
        System.out.println("Ruolo aggiunto e rimasto nel set:");
        for (String ruoloRimasto : ruoliSquadra) {
            System.out.println(ruoloRimasto);
        }
    }
    // 1- Funzione che restituisca un HashSet riempito
    private static HashSet<String> creaSquadra () { //creo funzione che restituisce HashSet
        HashSet<String> squadra = new HashSet<String>(Arrays.asList("Pt", "Dd","Ds", "Dc"));
        return squadra ;
    }
}