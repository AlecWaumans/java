package designPattern.Command;

public class CommandHelps implements Command{
    public CommandHelps(){

    }

    @Override
    public void execute() {
        System.out.println("*******Commande*******");
        System.out.println("if you go right press : d");
        System.out.println("if you go left press: q");
        System.out.println("Si vous voulez allez vers le bas : s");
        System.out.println("Si vous voulez allez vers le haut : z");
        System.out.println("if you will push right rock : e ");
        System.out.println("if you will push left rock : a");
        System.out.println("if you will exit game : x");
        System.out.println("If you want to order again : r");
        System.out.println("if you want to cancel an order :  u");
    }

    @Override
    public void unexecute() {

    }
}
