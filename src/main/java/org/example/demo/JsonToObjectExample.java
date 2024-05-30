package org.example.demo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JsonToObjectExample {

    public static void main(String[] args) {
        String jsonString = "[\n" +
                "    {\n" +
                "        \"FieldId\" : \"dataType\",\n" +
                "        \"Type\" : \"text\",\n" +
                "        \"Value\" : \"test\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"FieldId\" : \"Data\",\n" +
                "        \"Type\" : \"Datagrid\",\n" +
                "        \"Value\" : [\n" +
                "            {\n" +
                "                \"name\" : \"simon\",\n" +
                "                \"Gender\" : 1,\n" +
                "                \"Country\" : \"cn\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\" : \"Titus\",\n" +
                "                \"Gender\" : 2,\n" +
                "                \"Country\" : \"us\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "]";
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Object>>(){}.getType();
        ArrayList<Object> arrayList = gson.fromJson(jsonString, listType);
        System.out.println(arrayList);
    }
}
