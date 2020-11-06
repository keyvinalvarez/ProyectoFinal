package Utilities;

import Objects.Product;
import Objects.User;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.DataProvider;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

public class Parser {

    @DataProvider(name = "getProductsFromJson")
    public Object[] getProductsFromJson() throws FileNotFoundException {

        String filePath = "src/main/java/DataSource/products.json";
        JsonElement jsonData = new JsonParser().parse(new FileReader(filePath));
        JsonElement dataSet = jsonData.getAsJsonObject().get("dataset");
        List<Product> products = new Gson().fromJson(dataSet, new TypeToken<List<Product>>() {
        }.getType());

        Object[] result = new Object[products.size()];

        for (int i = 0; i < products.size(); i++) {
            result[i] = products.get(i);
        }

        return result;
    }

    @DataProvider(name = "getUsersFromJson")
    public Object[] getUsersFromJson() throws FileNotFoundException {

        String filePath = "src/main/java/DataSource/users.json";
        JsonElement jsonData = new JsonParser().parse(new FileReader(filePath));
        JsonElement dataSet = jsonData.getAsJsonObject().get("dataset");
        List<User> users = new Gson().fromJson(dataSet, new TypeToken<List<User>>() {
        }.getType());

        Object[] result = new Object[users.size()];

        for (int i = 0; i < users.size(); i++) {
            result[i] = users.get(i);
        }

        return result;
    }


}
