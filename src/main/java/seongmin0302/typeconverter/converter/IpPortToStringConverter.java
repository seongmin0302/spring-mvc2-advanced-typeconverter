package seongmin0302.typeconverter.converter;

import org.jspecify.annotations.Nullable;
import org.springframework.core.convert.converter.Converter;

import lombok.extern.slf4j.Slf4j;
import seongmin0302.typeconverter.type.IpPort;

@Slf4j
public class IpPortToStringConverter implements Converter<IpPort, String> {

   @Override
   public String convert(IpPort source) {
        log.info("convert source = {}", source);
        return source.getIp() + ":" + source.getPort();
   }
}
