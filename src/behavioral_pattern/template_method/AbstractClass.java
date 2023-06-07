package behavioral_pattern.template_method;

public abstract class AbstractClass {

    public void template() {
        System.out.println("template의 시작입니다.");
        primitiveOperation();
        System.out.println("template의 끝입니다.");
    }

    protected abstract void primitiveOperation();
}
