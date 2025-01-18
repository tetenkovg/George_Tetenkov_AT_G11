package runners;

import utils.JsonParser;

import java.io.IOException;

public class JsonMain {
    public static void main(String[] args) throws IOException {
        JsonParser json = new JsonParser();
        json.toJson();
        json.fromJson();
    }
}
