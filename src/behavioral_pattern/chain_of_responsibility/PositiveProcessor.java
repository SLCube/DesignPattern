package behavioral_pattern.chain_of_responsibility;

public class PositiveProcessor implements Chain {

    private Chain nextInChain;

    @Override
    public void setNext(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void process(Number number) {
        if (number.getNumber() > 0) {
            System.out.println("Positive Processor : " + number.getNumber());
            return;
        }

        nextInChain.process(number);
    }
}
