package credentialPattern.builder.gofBuilder;

public class ComputerBuilder implements Builder {

    private Computer computer;

    public ComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildName() {
        computer.setName("my computer!!");
    }

    @Override
    public void buildPrice() {
        computer.setPrice(1000000);
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
