package Model;

public enum LifeStyle {
    Sédentaire(1.2, "Sédentaire"),
    Peu_Actif(1.375, "Peu Actif"),
    Actif(1.55, "Actif"),
    Fort_Actif(1.725, "Fort Actif"),
    Extrêmement_Actif(1.9, "Extrêmement Actif");

    private double activity;
    private String lifeStyle;


    LifeStyle(double activity, String lifeStyle) {
        this.activity = activity;
        this.lifeStyle = lifeStyle;
    }

    public double getActivityLevel() {
        return this.activity;
    }

}
