package com.academy.yatskevich.lesson13;

public class Task2 {
    public static void main(String[] args) throws IllegalDateException {
        Notepad notePad = new Notepad();
        notePad.addNote("01-07-2023", "Yatskevich");

        System.out.println(notePad.getNote("01-07-2023"));
        notePad.addNote("02-07-2023", "Borisevich");
        notePad.addNote("04-07-2023", "Cherepan");
        notePad.addNote("03-07-2023", "Korovel");
        notePad.addNote("03-11-2023", "Kuzmin");

        System.out.println(notePad.getAllNotes());

        notePad.addNote("02-07-2023", "Jones");
    }
}
