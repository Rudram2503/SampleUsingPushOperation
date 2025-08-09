package scripts;


import org.testng.annotations.Test;
import genericLibraries.BaseClass;
import genericLibraries.ReadingDataPropertyFile;
import pom.SignUpPage;

public class SignUpTest1 extends BaseClass {
    @Test
    public void verifySignUpProcess() throws Exception {
        ReadingDataPropertyFile prop = new ReadingDataPropertyFile();

        String firstName = prop.readDataFromProperty("firstName");
        String lastName = prop.readDataFromProperty("lastName");
        String dob = prop.readDataFromProperty("dob");
        String email = prop.readDataFromProperty("email");
        String mobile = prop.readDataFromProperty("mobile");
        String gender = prop.readDataFromProperty("gender");
        String password = prop.readDataFromProperty("password");

        SignUpPage signUp = new SignUpPage(driver);
        signUp.clickProfileIcon();
        signUp.clickSignUpLink();
        signUp.fillSignUpForm(firstName, lastName, dob, email, mobile, gender, password);
        signUp.clickCreateAccount();
        
        signUp.verifyAccountCreation();

    }
}
