package com.sda.dpMosh.memento;

public class Main {
    public static void main(String[] args) {

        var editor = new Editor();
        var history = new History();

        editor.setContent("AAA");
        history.push(editor.createState());

        editor.setContent("BBB");
        history.push(editor.createState());

        editor.setContent("CCC");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
