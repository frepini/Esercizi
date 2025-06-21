package exercises.oop_old.basic;

public class Letter {
    private final String from;
    private final String to;
    private final StringBuilder lines;

    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        this.lines = new StringBuilder();
    }

    /**
     * Metodo che aggiunge una linea alla lettera
     * @param line testo da aggiungere alla lettera
     */
    public void addLine(String line) {
        lines.append(line + "\n");
    }

    /**
     * Metodo che stampa il testo della lettera con una determinata struttura
     * @return testo della lettera con una determinata struttura
     */
    public String getText() {
        return
                "Dear " + to + "\n" +
                "\n" +
                lines.toString() +
                "\n" +
                "Sincerely,\n" +
                "\n" +
                from;
    }

    public static void main(String[] args) {
        Letter l = new Letter("bicocchi", "grana");
        l.addLine("giovedì il laboratorio linfa è occupato!!!");
        System.out.println(l.getText());
    }
}