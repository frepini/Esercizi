package exercises.collections.lists;

import java.util.Iterator;
import java.util.List;

public class DownSize {
    public static void downsize(List<String> list, int n) {
        int index = 0;                                  // indice per controllare la posizione dell'elemento
        Iterator<String> iterator = list.iterator();    // oggetto Iterator per scorrere ogni elemento della lista

        while (iterator.hasNext()) {                    // fino a quando ci sono elementi nella lista
            iterator.next();                            // andiamo all'elemento corrente
            index++;                                    // incrementiamo l'indice
            if (index % n == 0) {                       // se l'indice è un multiplo di n
                iterator.remove();                      // rimuoviamo l'elemento corrente
            }
        }
    }
}