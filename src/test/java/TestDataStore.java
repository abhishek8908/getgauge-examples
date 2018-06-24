import com.thoughtworks.gauge.datastore.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDataStore {

    @Test
    public void testDataStore(){
        DataStore scenarioStore = DataStoreFactory.getScenarioDataStore();
        scenarioStore.put("element-id", "455678");
        assertEquals(scenarioStore.get("element-id"),"455678");

    }




}
