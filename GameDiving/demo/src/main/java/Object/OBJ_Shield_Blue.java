package Object;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Shield_Blue extends Entity {
    public OBJ_Shield_Blue(GamePanel gp) {
        super(gp);

        type = type_shield;
        name = "Blue shield";
        down1 = setup("/objects/weapon/shield_blue", gp.tileSize, gp.tileSize);
        defenseValue = 2;
        description = "[" + name + "]\nA shine blue shield.";
        price = 250;
    }
}
