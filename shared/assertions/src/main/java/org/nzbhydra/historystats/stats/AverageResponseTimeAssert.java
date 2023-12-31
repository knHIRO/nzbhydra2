package org.nzbhydra.historystats.stats;

/**
 * {@link AverageResponseTime} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractAverageResponseTimeAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class AverageResponseTimeAssert extends AbstractAverageResponseTimeAssert<AverageResponseTimeAssert, AverageResponseTime> {

    /**
     * Creates a new <code>{@link AverageResponseTimeAssert}</code> to make assertions on actual AverageResponseTime.
     *
     * @param actual the AverageResponseTime we want to make assertions on.
     */
    public AverageResponseTimeAssert(AverageResponseTime actual) {
        super(actual, AverageResponseTimeAssert.class);
    }

    /**
     * An entry point for AverageResponseTimeAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myAverageResponseTime)</code> and get specific assertion with code completion.
     *
     * @param actual the AverageResponseTime we want to make assertions on.
     * @return a new <code>{@link AverageResponseTimeAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static AverageResponseTimeAssert assertThat(AverageResponseTime actual) {
        return new AverageResponseTimeAssert(actual);
    }
}
