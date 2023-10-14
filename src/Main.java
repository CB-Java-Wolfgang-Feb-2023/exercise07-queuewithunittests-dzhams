public class Main {
    public static void main(String[] args) {
        // Erstellen einer Warteschlange mit einer Größe von 5
        MyQueue queue = new MyQueue(5);

        // Versuch, ein Element aus der leeren Warteschlange zu entfernen
        if (queue.dequeue() == -1) {
            System.out.println("Die Warteschlange ist leer. Kein Element zum Entfernen.");
        }

        // Elemente 1-5 in die Warteschlange einfügen
        System.out.println("Eingefügte Elemente:");
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
            System.out.println(i);
        }

        // Überprüfen, ob die Warteschlange voll ist
        if (queue.isFull()) {
            System.out.println("Die Warteschlange ist voll.");
        }

        // Elemente aus der Warteschlange entfernen
        System.out.println("Entfernte Elemente:");
        while (!queue.isEmpty()) {
            int element = queue.dequeue();
            System.out.println(element);
        }

        // Überprüfen, ob die Warteschlange leer ist
        if (queue.isEmpty()) {
            System.out.println("Die Warteschlange ist leer.");
        }
    }
}