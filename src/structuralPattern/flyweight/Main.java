package structuralPattern.flyweight;

import java.lang.management.MemoryManagerMXBean;
import java.security.SecureRandom;
import java.util.Random;

/**
 * flyweight pattern
 *
 * 공통적인 인스턴스를 많이 생성해야되며, 공통적인 부분은 재사용이 가능한경우
 * application 메모리 사용량을 줄일 수 있음.
 *
 */
public class Main {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "orange", "green"};
        Random random = new SecureRandom();


        for (int i = 0; i < 10000; i++) {
            TreeFactory.getInstance(colors[random.nextInt(4)]);
        }

        System.out.println((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1000 + "KB");
    }
}
