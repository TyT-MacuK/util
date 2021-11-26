package by.koroza.util;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class StringUtilTest {
    private static StringUtil stringUtil;

    @BeforeAll
    static void setUp() {
        stringUtil = new StringUtil();
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void isPositiveNumberTest(String number, boolean expected) {
        boolean actual = stringUtil.isPositiveNumber(number);
        Assertions.assertEquals(actual, expected);
    }

    private static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("5", true),
                Arguments.of("1258", true),
                Arguments.of("12f4", false),
                Arguments.of("-1", false),
                Arguments.of("0", false),
                Arguments.of("qwe", false),
                Arguments.of(null, false));
    }

    @AfterAll
    static void tearDown() {
        stringUtil          = null;
    }
}
