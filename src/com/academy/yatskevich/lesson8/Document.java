package com.academy.yatskevich.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Document {
    private final String text = """
            For example, food which is high in carbohydrates can make us feel more
            relaxed. It also makes us feel happy. Research has shown that people on
            diets often begin to feel a little depressed after two weeks because they
            are eating fewer carbohydrates.
            On the other hand, food which is rich in protein makes us feel awake
            and focused. Research has shown that schoolchildren who eat a high-
            protein breakfast often do better at school than children whose
            breakfast is lower in protein. Also, eating the right kind of meal
            at lunchtime can make a difference if you have an exam in the
            afternoon or a business meeting where you need to make some
            quick decisions. In an experiment for a BBC TV programme two
            chess players. both former British champions, had different
            meals before playing each other. Paul had a plate of prosciutto
            and salad (f ull of protein from the red meat), and his opponent
            Terry had pasta with a creamy sauce (full of carbohydrate). In the
            chess match Terry felt sleepy, and took much longer than Paul to
            make decisions about what moves to make. The experiment
            was repeated several times with the same result.
            Another powerful mood food could become a secret
            weapon in th e fight against crime. In Bournemouth in
            the south of England, where late-night violence can be
            a problem, some nightclub owners have come up with
            a solution. They give t heir clients free chocolate at th e end
            of the night. The results have been dramatic, with a 60%
            reduction in violent incidents.
            Why does chocolate make people less aggressive? First , it
            causes the brain to release feel-good chemicals called endorphins. It
            also contains a lot of sugar, which gives you energy, and can help stop
            late-night tired ness turning into aggression. These two things, together
            with a delicious taste, make chocolate a powerful mood changer.""";

    public String getText() {
        return text;
    }

    public String replaceLetters(String t) {
        StringBuilder text = new StringBuilder(t);
        Pattern pattern1 = Pattern.compile("\\s[A-z]{4,}");
        Pattern pattern2 = Pattern.compile("[A-z]{7,}");
        Matcher matcher1 = pattern1.matcher(text);
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher2.find()) {
            int start = matcher2.start();
            text.replace(start + 3, start + 4, "#");
            text.replace(start + 6, start + 7, "#");
        }
        while (matcher1.find()) {
            int start = matcher1.start();
            text.replace(start + 4, start + 5, "#");
        }
        return text.toString();
    }

    public void printWords() {
        StringBuilder text = new StringBuilder(this.text);
        Pattern pattern = Pattern.compile("\\b(?i)[aeiouy][a-z]*[bcdfghjklmnpqrstvwxz]\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
