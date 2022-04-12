package marsparkdream.parkingstorage.repository;

// 함수형 인터페이스
@FunctionalInterface
public interface RunSomthing {

    // 추상메소드
    void doIt();

    static void printName() {
        System.out.println("인터페이스 안에다가도 정의가능");
    }

    default void printAge() {
        System.out.println("21");
    }
}
