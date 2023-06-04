package com.academy.yatskevich.lesson13;

public class Task2 {
    public static void main(String[] args) {
        Notepad notePad = new Notepad();
        notePad.addNote("01-07-2023", "Yatskevich");
        notePad.addNote("02-07-2023", "Borisevich");
        notePad.addNote("04-07-2023", "Cherepan");
        notePad.addNote("03-07-2021", "Korovel");
        notePad.addNote("03-11-2000", "Kuzmin");
        notePad.addNote("02-07-2023", "Jones");

        System.out.println(notePad.getNote("01-07-2023"));

        System.out.println(notePad.getAllNotes());
    }
}
