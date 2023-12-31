package org.nzbhydra.config.searching;

/**
 * {@link AffectedValue} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractAffectedValueAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class AffectedValueAssert extends AbstractAffectedValueAssert<AffectedValueAssert, AffectedValue> {

    /**
     * Creates a new <code>{@link AffectedValueAssert}</code> to make assertions on actual AffectedValue.
     *
     * @param actual the AffectedValue we want to make assertions on.
     */
    public AffectedValueAssert(AffectedValue actual) {
        super(actual, AffectedValueAssert.class);
    }

    /**
     * An entry point for AffectedValueAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myAffectedValue)</code> and get specific assertion with code completion.
     *
     * @param actual the AffectedValue we want to make assertions on.
     * @return a new <code>{@link AffectedValueAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static AffectedValueAssert assertThat(AffectedValue actual) {
        return new AffectedValueAssert(actual);
    }
}
