package structuralPattern.composite;

/**
 * composite pattern
 *
 * client가 복합객체와 단일객체 모두 동일하게 취급하려는데에 목적이 있는 패턴이다.
 * ex) 컴퓨터의 폴더와 파일의 구조
 * 포함하는것과 포함되는것을 같은 선상에서 취급할때 사용하면 좋다.
 *
 * 트리구조가 아닌 형태에서 사용하게 된다면 너무 일반화를 해야되기 때문에 런타임중 타입을 체크해야될 수도 있다.
 * 구현하고자 하는 시스템중 트리구조를 갖게되고, 단일객체 복합객체를 동일하게 취급할 수 있다면 사용하자.
 */
public class Main {
    public static void main(String[] args) {
        FileSystem student1 = new File("홍길동", 10);
        FileSystem student2 = new File("철수", 11);

        Folder class1 = new Folder("1반");
        class1.add(student1);
        class1.add(student2);

        FileSystem student3 = new File("영희", 12);
        FileSystem student4 = new File("기영이", 13);

        Folder class2 = new Folder("2반");
        class2.add(student3);
        class2.add(student4);

        Folder grade = new Folder("1학년");
        grade.add(class1);
        grade.add(class2);

        System.out.println(grade.getSize());
        grade.remove();
    }
}
