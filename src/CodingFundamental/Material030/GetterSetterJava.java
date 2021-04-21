package CodingFundamental.Material030;

class PeopleJava {
    int id;
    String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class GetterSetterJava {
    public static void main(String[] args) {
        PeopleJava people = new PeopleJava();

        people.setId(373); // set ID
        System.out.println("id : "+people.getId()); // get ID
        people.setName("Algokelvin"); // set Name
        System.out.println("name : "+people.getName()); // get Name
    }
}
