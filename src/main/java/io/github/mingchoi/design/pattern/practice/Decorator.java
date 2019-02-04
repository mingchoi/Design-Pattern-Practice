package io.github.mingchoi.design.pattern.practice;
/*
Decorator

1. Define a interface for the function to be decorate
2. Create object class that:
    - implement the interface
3. Create decorator class that:
    - implement the interface
    - accept the interface in constructor parameter then store them
    - override the interface method and decorate it
4. Call by: new Decorator(new MyObject(), ...);
*/

interface IPrice {
    String print();
}

class Price implements IPrice {
    int amount;

    Price(int number) {
        amount = number;
    }

    @Override
    public String print() {
        return Integer.toString(amount);
    }
}

class PrefixDecorator implements IPrice {
    IPrice price;
    String prefix;

    public PrefixDecorator(String prefix, IPrice price) {
        this.price = price;
        this.prefix = prefix;
    }

    @Override
    public String print() {
        return this.prefix + this.price.print();
    }
}

class AffixDecorator implements IPrice {
    IPrice price;
    String affix;

    public AffixDecorator(IPrice price, String affix) {
        this.price = price;
        this.affix = affix;
    }

    @Override
    public String print() {
        return this.price.print() + this.affix;
    }
}

class Decorator {
    public static void main(String[] args) {
        Price p = new Price(999);
        System.out.println(new PrefixDecorator("HKD$", new AffixDecorator(p, ".00")).print());
    }
}
