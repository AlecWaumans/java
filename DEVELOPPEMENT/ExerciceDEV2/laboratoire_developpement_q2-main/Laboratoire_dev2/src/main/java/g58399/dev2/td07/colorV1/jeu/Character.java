package g58399.dev2.td07.colorV1.jeu;

import java.util.Objects;

/**
 *
 * @author alecw
 */
public class Character {

    private String name;
    private int hp;
    private boolean drunk;
    private boolean invisible;

    public Character(String name) {
        this.name = name;
        this.hp = 40;
        this.drunk = false;
        this.invisible = false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isDrunk() {
        return this.drunk;
    }

    public void setDrunk(boolean drunk) {
        this.drunk = drunk;
    }

    public boolean isInvisible(boolean invisible) {
        return this.invisible;
    }

    public void setInvisible(boolean invisible) {
        this.invisible = invisible;
    }

    // L'annotation Override permet d'informer le compileur qu'on réécrit une méthode de la classe parent, ce qui permet 
    // d'informer le compileur correctement en cas d'erreur de nom ou de signature.
    @Override
    public String toString() {
        return "Character{"
                + "name=" + name
                + ", hp=" + hp
                + ", drunk=" + drunk
                + ", invisible=" + invisible
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + this.hp;
        hash = 11 * hash + (this.drunk ? 1 : 0);
        hash = 11 * hash + (this.invisible ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (this.hp != other.hp) {
            return false;
        }
        if (this.drunk != other.drunk) {
            return false;
        }
        if (this.invisible != other.invisible) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    public static void main(String[] args) {
        Character[] personnages = {
            new Character("foo"),
            new Character("foo"),
            new Character("bar"),};

        for (Character p : personnages) {
            System.out.println(p.hashCode());
        }

    }
}
