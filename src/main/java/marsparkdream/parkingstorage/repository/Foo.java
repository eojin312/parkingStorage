package marsparkdream.parkingstorage.repository;

public class Foo {


    // 익명 내부 클래스 annoymus inner class
    public void main() {

        RunSomthing runSomthing = new RunSomthing() {
            @Override
            public void doIt() {
                System.out.println("봄여름가을겨울");
            }
        };
        runSomthing.doIt();
    }

    // 위 코드를 람다로 변경해주고
    public void functionalLamdaJava8() {
        RunSomthing runSomthing = () -> {System.out.println("위 코드를 함수형 인터페이스 람다로 줄여 사용가능!");};
        runSomthing.doIt();
    }


    // 만약 내부 코드가 1줄만 사용한다면.. 더 간단하게 가능
    public void simpleLamda() {
        RunSomthing runSomthing = () -> System.out.println("더 심플하게");
        runSomthing.doIt();
    }

    // 순수함수
    public int doThat() {
        DoRun doRun = (number) -> {
            return number + 1;
        };
        return doRun.doThat(1);
    }

    public int doNow() {
        int baseNumber = 10; // 이러면 순수함수가 아님 (문법적으로 가능)
        DoRun doRun = (number) -> {
            return number + baseNumber;
        };
        return doRun.doThat(1);
    }
}
