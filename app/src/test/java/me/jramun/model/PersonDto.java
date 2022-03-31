package me.jramun.model;

public class PersonDto {

    private Integer id;
    private String name;

    public PersonDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonDto{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
