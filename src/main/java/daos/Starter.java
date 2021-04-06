package daos;

public class Starter {

    public int id;
    public String name;
    public String type;
    public String ability;
    public int height;
    public int weight;

    public Starter(int id, String name, String type, String ability, int height, int weight){
        this.id = id;
        this.name = name;
        this.type = type;
        this.ability = ability;
        this.height = height;
        this.weight = weight;
    }

    public String toString(){
        return "" + this.id + " " + this.name + " " + this.type + " " + this.ability + " " + this.height + " " + this.weight + "\n";
    }

}
