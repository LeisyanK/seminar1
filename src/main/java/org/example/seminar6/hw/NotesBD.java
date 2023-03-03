package org.example.seminar6.hw;

import java.util.ArrayList;
import java.util.List;

public class NotesBD {
    public static void main(String[] args) {
        System.out.println(addNotes());
    }

    public static List<Notebook> addNotes() {
        Notebook note1 = new Notebook(1, "Asus", "AS-2", 12, 1024, "Windows10", "красный", 15200.0, false);
        Notebook note2 = new Notebook(2, "hp", "MG-10", 8, 512, "Windows10", "черный", 11500.0, false);
        Notebook note3 = new Notebook(3, "Apple", "NT-25", 16, 1024, "MacOS", "серый", 25000.0, false);
        Notebook note4 = new Notebook(4, "Asus", "AS-2", 12, 1024, "Windows10", "красный", 15200.0, true);
        Notebook note5 = new Notebook(5, "Samsung", "AK-8", 12, 256, "Windows10", "черный", 16600.0, false);
        Notebook note6 = new Notebook(6, "Apple", "AT-20", 16, 1000, "MacOS", "белый", 23000.0, false);
        Notebook note7 = new Notebook(7, "Asus", "AS-3", 16, 1024, "Windows10", "черный", 17300.0, false);
        List<Notebook> notes = new ArrayList<>();
        notes.add(note1);
        notes.add(note2);
        notes.add(note3);
        notes.add(note4);
        notes.add(note5);
        notes.add(note6);
        notes.add(note7);
        return notes;
    }
}
