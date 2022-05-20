package FinalProjectMirza;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory({GroupTest1.class, GroupTest2.class})
@SuiteClasses({ EatTest.class, RunTest.class, StrengthTest.class, StretchTest.class, TrainTest.class,
		WeightTest.class })

public class AllTests {

}
