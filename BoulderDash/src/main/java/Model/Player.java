package Model;

public class Player {
    private String name;
    private Color color;
    public Player(Color color){
        this.color = color;
    }
    /**
     * accessor that will allow us to retrieve the private Color attribute.
     *
     * @return the value of the row attribute.
     */
    public Color getColor() {
        return color;
    }
    /**
     * accessor that will allow us to retrieve the private Name attribute.
     *
     * @return the value of the row attribute.
     */
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }


}
