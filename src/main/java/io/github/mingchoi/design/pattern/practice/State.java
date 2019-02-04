package io.github.mingchoi.design.pattern.practice;

interface IState {
    String run(StateContext ctx);
}

class InitState implements IState {
    @Override
    public String run(StateContext ctx) {
        ctx.SetState(new WalkState());
        return "Init";
    }
}

class RunState implements IState {
    @Override
    public String run(StateContext ctx) {
        ctx.SetState(new WalkState());
        return "Run";
    }
}

class WalkState implements IState {
    int count = 0;

    @Override
    public String run(StateContext ctx) {
        if (count > 0) {
            ctx.SetState(new RunState());
        }
        count++;
        return "Walk";
    }
}

class StateContext {
    IState state;

    public StateContext() {
        this.state = new InitState();
    }

    public void SetState(IState state) {
        this.state = state;
    }

    public String Next() {
        return state.run(this);
    }
}

class State {
    public static void main(String[] args) {
        StateContext ctx = new StateContext();
        System.out.println(ctx.Next());
        System.out.println(ctx.Next());
        System.out.println(ctx.Next());
        System.out.println(ctx.Next());
        System.out.println(ctx.Next());
        System.out.println(ctx.Next());
        System.out.println(ctx.Next());
        System.out.println(ctx.Next());
        System.out.println(ctx.Next());
        System.out.println(ctx.Next());
    }
}
