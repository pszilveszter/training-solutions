package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        System.out.println("Jegyzet készítése");
        Note note = new Note();

        note.setName("Pintér Szilveszter");
        note.setTopic("Java Backend");
        note.setText("Az összes többi feladatban az attribútumok legyenek private kulcsszóval ellátva a data-hiding elveinek megfelelően");

        System.out.println(note.getNoteText());
    }
}
