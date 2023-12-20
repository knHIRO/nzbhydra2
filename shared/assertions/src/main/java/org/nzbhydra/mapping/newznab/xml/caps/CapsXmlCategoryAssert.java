package org.nzbhydra.mapping.newznab.xml.caps;

/**
 * {@link CapsXmlCategory} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractCapsXmlCategoryAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class CapsXmlCategoryAssert extends AbstractCapsXmlCategoryAssert<CapsXmlCategoryAssert, CapsXmlCategory> {

    /**
     * Creates a new <code>{@link CapsXmlCategoryAssert}</code> to make assertions on actual CapsXmlCategory.
     *
     * @param actual the CapsXmlCategory we want to make assertions on.
     */
    public CapsXmlCategoryAssert(CapsXmlCategory actual) {
        super(actual, CapsXmlCategoryAssert.class);
    }

    /**
     * An entry point for CapsXmlCategoryAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myCapsXmlCategory)</code> and get specific assertion with code completion.
     *
     * @param actual the CapsXmlCategory we want to make assertions on.
     * @return a new <code>{@link CapsXmlCategoryAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static CapsXmlCategoryAssert assertThat(CapsXmlCategory actual) {
        return new CapsXmlCategoryAssert(actual);
    }
}
