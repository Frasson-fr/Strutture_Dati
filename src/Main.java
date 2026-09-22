import static java.lang.IO.println;

void main() {
//
//    int nElementi = 100_000;
//
//    List<Integer> arrayList = new ArrayList<>();
//    List<Integer> linkedList = new LinkedList<>();
//
//    long start = System.nanoTime();
//
//    for (int i = 0; i < nElementi; i++) {
//        arrayList.add(i);
//    }
//
//    long end = System.nanoTime();
//    println("Tempo Array List - Inserimento in coda: " + (end-start)/1_000_000.0 + " ns");
//
//    start = System.nanoTime();
//
//    for (int i = 0; i < nElementi; i++) {
//        linkedList.add(i);
//    }
//
//    end = System.nanoTime();
//    println("Tempo Linked List - Inserimento in coda: " + (end-start)/1_000_000.0 + " ns");
//
//    ///// Accesso casuale
//    start = System.nanoTime();
//
//    for (int i = 0; i < 1_000; i++) {
//        arrayList.get(nElementi/2);
//    }
//
//    end = System.nanoTime();
//    println("Tempo Array List - Accessi al centro: " + (end-start)/1_000_000.0 + " ns");
//
//    start = System.nanoTime();
//
//    for (int i = 0; i < 1_000; i++) {
//        linkedList.get(nElementi/2);
//    }
//
//    end = System.nanoTime();
//    println("Tempo Linked List - Accessi al centro: " + (end-start)/1_000_000.0 + " ns");
//
//
//    /// Hash
//    String chiave = "Utente_Barin_2008";
//    int numeroBucket = 16;
//
//    int hashCode = chiave.hashCode();
//    int indiceBucket = Math.abs(hashCode) % numeroBucket;
//    println("chiave " + chiave + " hashCode " +  hashCode + " indiceBucket " + indiceBucket);

    int nElementi = 1_000_000;
    int target = nElementi - 1;

    List<Integer> arrayList = new ArrayList<>();
    Set<Integer> treeSet = new TreeSet<>();
    Set<Integer> hashSet = new HashSet<>();

    for (int i = 0; i < nElementi; i++) {
        // arrayList.add(i);
        treeSet.add(i);
        // hashSet.add(i);
    }

////  TODO arrayList
//    long start = System.nanoTime();
//    boolean trovatoElemento = arrayList.contains(target);
//    long end = System.nanoTime();
//    double tempo = (end - start) / 1_000_000.0;
//    println("ArrayList O(n) Trovato: " + trovatoElemento + " Tempo: " + tempo + " ns");

//// TODO treeSet
    long start = System.nanoTime();
    boolean trovatoElemento = treeSet.contains(target);
    long end = System.nanoTime();
    double tempo = (end - start) / 1_000_000.0;
    println("treeSet O(log n) Trovato: " + trovatoElemento + " Tempo: " + tempo + " ns");

//// TODO hashSet
    start = System.nanoTime();
    trovatoElemento = hashSet.contains(target);
    end = System.nanoTime();
    tempo = (end - start) / 1_000_000.0;
    println("hashSet O(1) Trovato: " + trovatoElemento + " Tempo: " + tempo + " ns");
}