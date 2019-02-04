package io.github.mingchoi.design.pattern.practice;

public final class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Creating instance.");
    }

    public static Singleton Get() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.Get().toString());
    }
}
