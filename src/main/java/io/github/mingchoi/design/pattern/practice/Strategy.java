package io.github.mingchoi.design.pattern.practice;

interface IMoveBehavior {
    void Move();
}

class Walk implements IMoveBehavior {
    @Override
    public void Move() {
        System.out.println("Walk");
    }
}

class Jump implements IMoveBehavior {
    @Override
    public void Move() {
        System.out.println("Jump");
    }
}

abstract class Bird {
    IMoveBehavior movement;

    public Bird() {
        this.movement = new Walk();
    }

    public void Move() {
        this.movement.Move();
    }
}

class Sparrow extends Bird {
    public Sparrow() {
        this.movement = new Jump();
    }
}

class Chicken extends Bird {

}

class Strategy {
    public static void main(String[] args) {
        new Sparrow().Move();
        new Chicken().Move();
    }
}
