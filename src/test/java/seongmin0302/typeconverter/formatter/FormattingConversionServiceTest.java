package seongmin0302.typeconverter.formatter;

import static org.assertj.core.api.Assertions.assertThat;

import org.jspecify.annotations.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.format.support.DefaultFormattingConversionService;

import seongmin0302.typeconverter.converter.IpPortToStringConverter;
import seongmin0302.typeconverter.converter.StringtoIpPortConverter;
import seongmin0302.typeconverter.type.IpPort;

public class FormattingConversionServiceTest {

    @Test
    void formattingConversionService() {

        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
        //컨버터 등록
        conversionService.addConverter(new IpPortToStringConverter());
        conversionService.addConverter(new StringtoIpPortConverter());

        //포멧터 등록
        conversionService.addFormatter(new MyNumberFormatter());



        //문자를 ipPort로
        @Nullable
        IpPort result = conversionService.convert("127.0.0.1:8080", IpPort.class);
        assertThat(result).isEqualTo(new IpPort("127.0.0.1",8080));


        // 숫자를 문자로
        @Nullable
        Number result1 = conversionService.convert("1,000",Number.class);
        assertThat(result1).isEqualTo(1000L);

        //문자를 숫자로
        @Nullable
        String result2 = conversionService.convert(1000, String.class);
        assertThat(result2).isEqualTo("1,000");
    }

}
