package Object;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Shield_Wood extends Entity {

    public OBJ_Shield_Wood(GamePanel gp) {
        super(gp);

        type = type_shield;
        name = "Shield Wood";
        down1 = setup("/objects/weapon/shield_wood", gp.tileSize, gp.tileSize);
        defenseValue = 1;
        description = "[" + name + "]\nMade by wood. ";
        price = 35;
    }
}
