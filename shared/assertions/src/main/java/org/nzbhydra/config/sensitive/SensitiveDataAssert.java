package org.nzbhydra.config.sensitive;

/**
 * {@link SensitiveData} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractSensitiveDataAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class SensitiveDataAssert extends AbstractSensitiveDataAssert<SensitiveDataAssert, SensitiveData> {

    /**
     * Creates a new <code>{@link SensitiveDataAssert}</code> to make assertions on actual SensitiveData.
     *
     * @param actual the SensitiveData we want to make assertions on.
     */
    public SensitiveDataAssert(SensitiveData actual) {
        super(actual, SensitiveDataAssert.class);
    }

    /**
     * An entry point for SensitiveDataAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(mySensitiveData)</code> and get specific assertion with code completion.
     *
     * @param actual the SensitiveData we want to make assertions on.
     * @return a new <code>{@link SensitiveDataAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static SensitiveDataAssert assertThat(SensitiveData actual) {
        return new SensitiveDataAssert(actual);
    }
}
