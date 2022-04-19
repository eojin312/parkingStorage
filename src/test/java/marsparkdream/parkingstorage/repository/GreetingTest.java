package marsparkdream.parkingstorage.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class GreetingTest {


    @Test
    void 메소드참조 () {
        // given

        Greeting greeting = new Greeting();
        UnaryOperator<String> prevMethodRef = (s) -> "hi" + s; // 메소드 레퍼런스 사용 이전엔
        UnaryOperator<String> hi = Greeting::sayHi; // 메소드 레퍼런스 사용  UnaryOperator 는 인자와 값의 타입이 같을 때 사용 실제로는 <Stirng, String> 임
        log.info("메소드 레퍼런스 사용 이전 : {}", prevMethodRef);
        log.info("메소드 레퍼런스 사용 이후 : {}", hi.apply("ejlee"));  // apply 까지 해야함

        // then
        assertNotNull(hi.apply("ejlee"));
    }


    @Test
    void 메소드레퍼런스를_이용해_객체생성 () {
        // given
        Function<String, Greeting> ejleeGreeting = Greeting::new; // 객체 생성인데, Supplier<Greeting> 과 같은데 서로 다른 생성자를 참조
        Supplier<Greeting> ejlee = Greeting::new;
        // when

        Greeting functionName = ejleeGreeting.apply("ejlee");
        log.info("내이름 : {}", functionName.getName());

        log.info("supplier 사용한 내 이름 : {}", ejlee.get().getName());
    }
}