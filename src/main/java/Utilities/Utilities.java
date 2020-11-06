package Utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class Utilities {

    public String generateRandomEmail() {

        String randomString = RandomStringUtils.randomAlphabetic(12);
        String email = randomString.concat("@gmail.com");

        return email;
    }

    public String removeSpecialCaractersFromText(String text){
        String result = text.replaceAll("[^ .,0-9]","");
        return result;
    }
}
