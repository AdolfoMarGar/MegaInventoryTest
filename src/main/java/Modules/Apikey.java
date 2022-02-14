package Modules;

import com.google.gson.Gson;

public abstract class Apikey implements ToJson {
    String APIKEY = "53f477a210776068@m128069";
    public Apikey() {

    }

    public String ToJson(){
        Gson gson = new Gson();

        return gson.toJson(this);
    }
}
