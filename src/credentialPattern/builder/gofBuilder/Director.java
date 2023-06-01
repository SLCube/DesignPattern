package credentialPattern.builder.gofBuilder;

public class Director {

    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer getComputer() {
        return this.builder.getComputer();
    }

    public void makeComputer() {
        this.builder.buildName();
        this.builder.buildPrice();
    }
}
