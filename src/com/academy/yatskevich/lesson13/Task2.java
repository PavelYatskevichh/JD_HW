package com.academy.yatskevich.lesson13;

public class Task2 {
    public static void main(String[] args) throws IllegalDateException {
        Notepad notePad = new Notepad();
        notePad.addNote("01-07-2023", notePad.new Note("Yatskevich"));

        System.out.println(notePad.getNote("01-07-2023"));
        notePad.addNote("02-07-2023", notePad.new Note("Borisevich"));
        notePad.addNote("04-07-2023", notePad.new Note("Cherepan"));
        notePad.addNote("03-07-2023", notePad.new Note("Korovel"));
        notePad.addNote("03-11-2023", notePad.new Note("Kuzmin"));

        System.out.println(notePad.getAllNotes());

        notePad.addNote("02-07-2023", notePad.new Note("Jones"));
    }
}
