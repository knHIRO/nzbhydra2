package org.nzbhydra.config.downloading;

/**
 * {@link NzbAddingType} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractNzbAddingTypeAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class NzbAddingTypeAssert extends AbstractNzbAddingTypeAssert<NzbAddingTypeAssert, NzbAddingType> {

    /**
     * Creates a new <code>{@link NzbAddingTypeAssert}</code> to make assertions on actual NzbAddingType.
     *
     * @param actual the NzbAddingType we want to make assertions on.
     */
    public NzbAddingTypeAssert(NzbAddingType actual) {
        super(actual, NzbAddingTypeAssert.class);
    }

    /**
     * An entry point for NzbAddingTypeAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myNzbAddingType)</code> and get specific assertion with code completion.
     *
     * @param actual the NzbAddingType we want to make assertions on.
     * @return a new <code>{@link NzbAddingTypeAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static NzbAddingTypeAssert assertThat(NzbAddingType actual) {
        return new NzbAddingTypeAssert(actual);
    }
}
