package Object;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Axe extends Entity {
    public OBJ_Axe(GamePanel gp) {
        super(gp);

        type = type_axe;
        name = "Woodcutter's Axe";
        down1 = setup("/objects/weapon/axe",gp.tileSize, gp.tileSize);
        attackValue = 2;
        attackArea.width = 30;
        attackArea.height = 30;

        description = "[Woodcutter's Axe]\nA bit rusty but still \ncan cut some trees.";
        price = 75;
        knockBackPower = 10;

    }
}
