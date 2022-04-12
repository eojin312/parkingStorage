package marsparkdream.parkingstorage.repository;

public class Foo {

    public static void main(String[] args) {
        // 익명 내부 클래스 annoymus inner class
        RunSomthing runSomthing = new RunSomthing() {
            @Override
            public void doIt() {
                System.out.println("봄여름가을겨울");
            }
        };
    }

    public static void functionalLamdaJava8(String[] args) {
        RunSomthing runSomthing = () -> {System.out.println("위 코드를 함수형 인터페이스 람다로 줄여 사용가능!");};
    }
}
