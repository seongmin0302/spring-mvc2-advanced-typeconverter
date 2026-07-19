package seongmin0302.typeconverter;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import seongmin0302.typeconverter.converter.IntegerToStringConverter;
import seongmin0302.typeconverter.converter.IpPortToStringConverter;
import seongmin0302.typeconverter.converter.StringToIntegerConverter;
import seongmin0302.typeconverter.converter.StringtoIpPortConverter;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToIntegerConverter());
        registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new StringtoIpPortConverter());
        registry.addConverter(new IpPortToStringConverter());
    }

}
