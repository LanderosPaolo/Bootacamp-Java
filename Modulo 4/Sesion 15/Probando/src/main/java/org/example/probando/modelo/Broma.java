package org.example.probando.modelo;

public class Broma {
    private String type;
    private String setup;
    private String punshline;
    private Long id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPunshline() {
        return punshline;
    }

    public void setPunshline(String punshline) {
        this.punshline = punshline;
    }

    @Override
    public String toString() {
        return "Broma{" +
                "type='" + type + '\'' +
                ", setup='" + setup + '\'' +
                ", punshline='" + punshline + '\'' +
                ", id=" + id +
                '}';
    }
}
