package com.sparta.ee.OtherFiles;

import java.util.Arrays;

public enum PianoNotes {

        C("Normal"),
        Db("Accidental"),
        D("Normal"),
        Eb("Accidental"),
        E("Normal"),
        F("Normal"),
        Gb("Accidental"),
        G("Normal"),
        Ab("Accidental"),
        A("Normal"),
        Bb("Accidental"),
        B("Normal");

        private String noteType;

        private String tonic;

    PianoNotes(String normal) {


    }


    public String getNote() {
        return noteType;
    }

    public void setNote(String note) {
        this.noteType = note;
    }



    public static void main(String[] args) {

        PianoNotes[] happyBirthday = {G, G, A, G, C, B, G, G, A, G, D, C,
        G, G, G, E, C, B, A, F, F, E, C, D, C};
        System.out.println(Arrays.toString(happyBirthday));

        System.out.println(C.getNote());
    }

}
