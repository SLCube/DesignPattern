package structuralPattern.proxy;

/**
 * proxy pattern
 * 객체에 가벼운 용량의 정보, 무거운 용량의 정보, 두 종류의 정보가 있다 했을때 가벼운 용량의 정보는 대리인 객체를 통해 빠르게 사용자에게 나타내주고
 * 무거운 정보는 실제 객체를 생성 후 호출해서 불러내는 방식이다.
 *
 *
 */
public class Main {
    public static void main(String[] args) {

        ProxyImage proxyImage = new ProxyImage();
        proxyImage.show();
    }
}
