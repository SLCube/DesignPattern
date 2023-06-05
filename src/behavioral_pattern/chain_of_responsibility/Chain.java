package behavioral_pattern.chain_of_responsibility;

public interface Chain {
    void setNext(Chain nextInChain);

    void process(Number number);
}
