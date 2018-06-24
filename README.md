# getgauge-examples
Gauge vs Cucumber


### Comparison

| GAUGE | CUCUMBER |Examples in Guage(Refer project)|
| ------ | ------ |------ |
| Run test suites on multiple env with ease. | No such built-in feature availbale.|> gauge run --env int specs|
| Has the ability to combine  re-usable logical groups of steps into a single unit scenarios known as concepts | No such built-in feature available.|Example1 (step *login to the url)|
|Both Start up (or Background steps) steps and tear down step available at specification/feature level)|Only Background steps are available at feature level.|Example3|
| Data driven testing can be achieved by both inline tables and csv files. | It only provides data driven test though inline tables|Example3|
| Parallel execution is very simple with extra plugin  | Requires extra plugins to achive that.|gauge run --parallel specs|
| In built facility to store run time context data.| No inbuilt object to store run time data  |TestDataStore (Tests)|
|In build Facility to read data from external file.|No  built-in Facility to read data from external file. |Example4|
|In build Facility to start capturing screen shots.|No built-in Facility to start capturing screen shots.|See reports|
|A lot More hooks like BeforeSuite/AfterSuite/BeforeSpec/AfterSpec/BeforeScenario/AfterScenario/BeforeStep/AfterStep|Limited Hooks Before/After/BeforeStep/AfterStep.|public class ExecutionHooks{    [BeforeSuite]    public void BeforeSuite() {    // Code for before suite    }    [AfterSuite]    public void AfterSuite() {    // Code for after suite    }    [BeforeSpec]    public void BeforeSpec() {    // Code for before spec    }    [AfterSpec]    public void AfterSpec() {    // Code for after spec    }    [BeforeScenario]    public void BeforeScenario() {    // Code for before scenario    }    [AfterScenario]    public void AfterScenario() {    // Code for after scenario    }    [BeforeStep]    public void BeforeStep() {    // Code for before step    }    [AfterStep]    public void AfterStep() {    // Code for after step    }}|
| Built-In feature to rerun failed tests. | No Built-In feature to rerun failed tests.|> gauge run --failed|
|Built-In feature to continue on failures. |No Such feature available in cucumber.|Example5|