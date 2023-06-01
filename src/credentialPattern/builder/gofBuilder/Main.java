package credentialPattern.builder.gofBuilder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();

        Director director = new Director(computerBuilder);
        director.makeComputer();
        Computer computer = director.getComputer();

        System.out.println("computer.getName() = " + computer.getName());
        System.out.println("computer.getPrice() = " + computer.getPrice());
    }
}
