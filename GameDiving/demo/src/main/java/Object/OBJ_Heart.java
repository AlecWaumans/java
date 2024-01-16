package Object;

import Entity.Entity;
import Main.GamePanel;

public class OBJ_Heart extends Entity {
    GamePanel gp;

    public OBJ_Heart(GamePanel gp){
        super(gp);
        this.gp = gp;
        type = type_pickupOnly;
        name = "heart";
        value = 2;
        down1 = setup("/objects/health/heart_full", gp.tileSize,gp.tileSize);
        image = setup("/objects/health/heart_full",gp.tileSize,gp.tileSize);
        image2 = setup("/objects/health/heart_half",gp.tileSize,gp.tileSize);
        image3 = setup("/objects/health/heart_blank",gp.tileSize,gp.tileSize);
    }
    public boolean use(Entity entity){
        gp.playSE(2);
        gp.ui.addMessage("life +" + value);
        entity.life += value;
        return true;
    }
}
