public class DTO implements UpperDTO{

    int id;
    String name;
    String type;
    String ability;
    public int height;
    public int weight;

    public DTO(int id, String name, String type, String ability, int height, int weight){
        this.id = id;
        this.name = name;
        this.type = type;
        this.ability = ability;
        this.height = height;
        this.weight = weight;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getAbility() {
        return this.ability;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

}
