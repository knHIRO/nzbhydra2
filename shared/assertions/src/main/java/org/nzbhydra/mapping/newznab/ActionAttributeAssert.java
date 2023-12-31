package org.nzbhydra.mapping.newznab;

/**
 * {@link ActionAttribute} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractActionAttributeAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class ActionAttributeAssert extends AbstractActionAttributeAssert<ActionAttributeAssert, ActionAttribute> {

    /**
     * Creates a new <code>{@link ActionAttributeAssert}</code> to make assertions on actual ActionAttribute.
     *
     * @param actual the ActionAttribute we want to make assertions on.
     */
    public ActionAttributeAssert(ActionAttribute actual) {
        super(actual, ActionAttributeAssert.class);
    }

    /**
     * An entry point for ActionAttributeAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myActionAttribute)</code> and get specific assertion with code completion.
     *
     * @param actual the ActionAttribute we want to make assertions on.
     * @return a new <code>{@link ActionAttributeAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static ActionAttributeAssert assertThat(ActionAttribute actual) {
        return new ActionAttributeAssert(actual);
    }
}
