# Schleifen in Java

## Aufgaben

Aufgaben sind als Branches gespeichert. Um die Aufgabe zu finden, bitte den Branch auswählen.

## Theorie

### Warum brauchen wir Schleifen?

Wir brauchen Schleifen, dammit wir unsere Programme/Algorithmen wiederholen
können.

### Welche Schleifen gibt es in Java?

- while
- do-while
- for
- for-each

### Wie sehen diese Schleifen in der Wilderness aus?

    for (int i = 0; i < 10; i++) {
        System.out.println(i);
    }
    
    int i = 0;
    while (i < 10) {
        System.out.println(i);
        i++;
    }
    
    int i = 0;
    do {
        System.out.println(i);
        i++;
    } while(i < 10);
    
    String[] words = new String[]{ "Ein", "Zwei", "Drei", "Vier", "Fünf" };
    for (String word : words) {
        System.out.println(word);
    }

### Wie werden Schleifen von Profis verwendet?

Schleifen Anwendungen können in folgende Kategorien eingeordnet werden:

- Find
- Map
- Filter
- Reduce
- Sort
- Sonstiges? Sollte im Webentwicklung-Umfeld nicht oft vorkommen.