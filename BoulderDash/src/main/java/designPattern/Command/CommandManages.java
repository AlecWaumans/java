package designPattern.Command;

import java.util.Stack;

public class CommandManages {
    private Stack<Command> undo;
    private Stack<Command> redo;

    public CommandManages(Stack<Command> undo, Stack<Command> redo){
        this.undo = undo;
        this.redo = redo;
    }

    public void doCommande(Command command){
        this.undo.push(command);
        this.redo.push(command);
        command.execute();
    }

    public void undo(){
        this.undo.peek().unexecute();
        this.undo.pop();
    }

    public void redo(){
        this.redo.peek().execute();
        this.redo.pop();
    }
}
