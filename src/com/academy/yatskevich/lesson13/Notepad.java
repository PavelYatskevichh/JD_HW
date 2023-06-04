package com.academy.yatskevich.lesson13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Notepad {
    Map<String, Note> entry = new TreeMap<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            SimpleDateFormat format = new SimpleDateFormat();
            format.applyPattern("dd-MM-yyyy");
            Date date = null;
            Date date2 = null;
            try {
                date = format.parse(o1);
                date2 = format.parse(o2);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            if (date.before(date2)) {
                return -1;
            } else if (date.after(date2)) {
                return 1;
            } else {
                return 0;
            }
        }
    });

//    Пробовал сделать вторым способом: используя HashMap, имплементируя интерфейс Comparable<NotePad>, но когда переопределял
//    метод compareTo() не разобрался как взять у записи ключ. Подскажите, пожалуйста, как это можно сделать (в телегу).
//    Метод выглядел так:
//    @Override
//    public int compareTo(NotePad o) {
//        SimpleDateFormat format = new SimpleDateFormat();
//        format.applyPattern("dd-MM-yyyy");
//        Date date = null;
//        Date date2 = null;
//        try {
//            date = format.parse(????что сюда вписать?????);
//            date2 = format.parse(?????что сюда вписать?????);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        if (date.before(date2)) {
//            return -1;
//        } else if (date.after(date2)) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }

    public class Note {
        String surname;

        public Note(String surname) {
            this.surname = surname;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String toString() {
            return surname;
        }
    }

    public void addNote(String date, String surname) {
        try {
            if (entry.containsKey(date)) {
                throw new IllegalDateException("Запись на эту дату невозможна.");
            } else {
                Note noteSurname = new Note(surname);
                entry.put(date, noteSurname);
            }
        } catch (IllegalDateException e) {
            System.out.println(date + " " + e.getMessage());
        }

    }

    public Note getNote(String date) {
        return entry.get(date);
    }

    public List<Note> getAllNotes() {
        return new ArrayList<>(entry.values());
    }
}