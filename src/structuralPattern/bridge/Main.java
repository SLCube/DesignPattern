package structuralPattern.bridge;

import structuralPattern.bridge.brush.Brush;
import structuralPattern.bridge.brush.HBPencil;
import structuralPattern.bridge.brush.Monami;
import structuralPattern.bridge.color.Blue;
import structuralPattern.bridge.color.Red;
import structuralPattern.bridge.phone.AndroidPhone;
import structuralPattern.bridge.phone.IPhone;
import structuralPattern.bridge.phone.Phone;

/**
 * bridge pattern
 *
 * 추상적인 개념과 구현을 분리하기 위해 사용하는 패턴
 *
 * 추상적인 개념과 구현부를 분리했기 때문에 공통된 추상적인 개념을 갖지만 구현부의 개념이 다른 객체를 확장하기 용이하다.
 *
 * 추상부와 구현부 사이의 다리를 둬 확장에 용이하게 만듦.
 */
public class Main {
    public static void main(String[] args) {
        Brush bluePencil = new HBPencil(new Blue());
        System.out.println(bluePencil.draw());

        Brush redPencil = new HBPencil(new Red());
        System.out.println(redPencil.draw());

        Brush redMonami = new Monami(new Red());
        Brush blueMonami = new Monami(new Blue());
        System.out.println(redMonami.draw());
        System.out.println(blueMonami.draw());

        Phone redIPhone = new IPhone(new Red());
        redIPhone.execute();

        Phone blueIPhone = new IPhone(new Blue());
        blueIPhone.execute();

        Phone redAndroidPhone = new AndroidPhone(new Red());
        Phone blueAndroidPhone = new AndroidPhone(new Blue());

        redAndroidPhone.execute();
        blueAndroidPhone.execute();
    }
}
