import base.BasePage;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.ser.Serializers;
import config.Config;
import org.testng.annotations.Test;
import pages.Search;

public class test_searchbar extends BasePage {
    @Test
    public void testNavigation(){
        Search sear = new Search();

        sear.inputTextonSearchbar("anis");


    }

}
