package Object;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Chest extends Entity {
    GamePanel gp;

    public OBJ_Chest(GamePanel gp){
        super(gp);
        this.gp = gp;

        type = type_obstacle;
        name = "Chest";
        image = setup("/objects/chest",gp.tileSize,gp.tileSize);
        image2 = setup("/objects/chest_opened", gp.tileSize,gp.tileSize);
        down1 = image;
        collision = true;

        solidArea.x = 4;
        solidArea.y = 16;
        solidArea.width = 40;
        solidArea.height = 32;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }
    public void setLoot(Entity loot){
        this.loot = loot;
    }
    public void interact(){
        gp.gameState = gp.dialogueState;

        if(opened == false){
            gp.playSE(3);

            StringBuilder sb = new StringBuilder();
            sb.append("You open the chest and find a " + loot.name + "!");

            if(gp.player.canOptainItem(loot) == false){
                sb.append("\n... But you cannot carry any more!");
            }else{
                sb.append("\nYou optain the "+ loot.name + "!");
                down1 = image2;
                opened = true;
            }
            gp.ui.currentDialogue = sb.toString();
        }else{
            gp.ui.currentDialogue = "It's empty";
        }
    }
}
