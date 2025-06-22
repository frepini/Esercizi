package exercises.oop.basic;

public class Letter {
    private final String from;
    private final String to;
    private final StringBuilder lines;

    /**
     * Costruttore che crea l'oggetto di tipo Letter e inizializza il mittente (from) e il destinatario (to)
     * @param from mittente della lettera
     * @param to destinatario della lettera
     */
    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        this.lines = new StringBuilder();
    }

    /**
     * Aggiunge la linea line alla lettera
     * @param line linea da aggiungere alla lettera
     */
    public void addLine(String line) {
        lines.append(line);
        lines.append("\n");
    }

    /**
     * Restituisce la lettera
     * @return la lettera
     */
    public String getText() {
        return "Dear " + to + ":\n\n" + lines.toString() + "\nSincerely,\n\n" + from;
    }
}