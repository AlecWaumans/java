package Object;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Potion_Red extends Entity {

    GamePanel gp;


    public OBJ_Potion_Red(GamePanel gp) {
        super(gp);

        this.gp = gp;

        type = type_consumable;
        name = "Red Potion";
        value = 5;
        down1 = setup("/objects/health/potion_red",gp.tileSize,gp.tileSize);
        description = "[Red Potion]\nHeals you life by " + value + ".";
        price = 25;
        stackable = true;
    }
    public boolean use(Entity entity){
        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "You drink the " + name + "!\n"
                + "Your life has been recovered by " + value + ".";
        entity.life += value;
        gp.playSE(2);
        return true;

    }
}