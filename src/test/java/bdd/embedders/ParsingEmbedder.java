package bdd.embedders;

import bdd.steps.ParsingSteps;
import bdd.steps.SharedSteps;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Class determines the step files and specific configuration for tests related to the core Java Parser
 */
public class ParsingEmbedder extends BasicJapaEmbedder {

    @Override
    public InjectableStepsFactory stepsFactory() {
        Map<String, Object> state = new HashMap<>();

        return new InstanceStepsFactory(configuration(),
                new SharedSteps(state),
                new ParsingSteps(state));
    }
}
