package MyApp.Util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;

public class JsonHandler {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static void writeJson(Object data, File file) throws IOException {
        objectMapper.writeValue(file, data);
    }

    public static <T> T readJson(Class<T> valueType, File file) throws IOException {
        return objectMapper.readValue(file, valueType);
    }
}