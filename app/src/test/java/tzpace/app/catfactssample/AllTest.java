package tzpace.app.catfactssample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SmokeUnitTest.class,
        CommunicationTest.class,
        CatDataModuleTest.class
})
public final class AllTest {

}
