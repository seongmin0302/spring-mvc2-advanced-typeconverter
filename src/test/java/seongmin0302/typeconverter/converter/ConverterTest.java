package seongmin0302.typeconverter.converter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import seongmin0302.typeconverter.type.IpPort;

public class ConverterTest {


    @Test
    void stringToInteger() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    void integerToString() {
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String result = converter.convert(10);
        Assertions.assertThat(result).isEqualTo("10");
    }

    @Test
    void StringToIpPort() {
        StringtoIpPortConverter converter = new StringtoIpPortConverter();
        IpPort result = converter.convert("127.0.0.1:8080");
        Assertions.assertThat(result).isEqualTo(new IpPort("127.0.0.1", 8080));
    }


    @Test
    void IpPortToString() {
        IpPortToStringConverter converter = new IpPortToStringConverter();
        String result = converter.convert(new IpPort("127.0.0.1", 8080));
        Assertions.assertThat(result).isEqualTo("127.0.0.1:8080");
    }
}
