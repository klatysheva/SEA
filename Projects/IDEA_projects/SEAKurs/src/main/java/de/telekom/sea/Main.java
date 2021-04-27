package de.telekom.sea;

import de.telekom.sea.seminar.SeminarApp;

public class Main {
    public static void main(String[] args) {
        SeminarApp app = new SeminarApp();
        System.out.println(app);
        app.run(args, "Ann");
        app.run(args, "Sasha");

    }
}
