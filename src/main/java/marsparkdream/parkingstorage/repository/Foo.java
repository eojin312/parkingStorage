package marsparkdream.parkingstorage.repository;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Function;

@Slf4j
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
        final int baseNumber = 10; // 이러면 순수함수가 아님 (문법적으로 가능) final 로 가정
        DoRun doRun = (number) -> {
            return number + baseNumber;
        };
        // baseNumber = 1;  // final 이 선언되지않아도 위에 변수를 final 로 가정하고 선언했기때문에 값 변경 불가
        return doRun.doThat(1);
    }

    // 위 코드를 더 간단히 줄이면
    public int doing() {
        int baseNumber = 10;
        DoRun doRun = number -> number + baseNumber;
        return doRun.doThat(1);
    }

    // Function <T, R> 살펴보기
    public int doGo() {
        Plus10 plus10 = new Plus10();
        Integer apply = plus10.apply(1);
        log.info("+10 : {}", apply);
        return apply;
    }

    // 인터페이스 사용이 아닌 람다로 바로 구현해서 사용
    public int doGoingNow() {
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Integer functionApply = plus10.apply(1);
        log.info("function apply : {}", functionApply);
        return functionApply;
    }
}
