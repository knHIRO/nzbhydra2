package org.nzbhydra.config.searching;

/**
 * {@link SearchType} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractSearchTypeAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class SearchTypeAssert extends AbstractSearchTypeAssert<SearchTypeAssert, SearchType> {

    /**
     * Creates a new <code>{@link SearchTypeAssert}</code> to make assertions on actual SearchType.
     *
     * @param actual the SearchType we want to make assertions on.
     */
    public SearchTypeAssert(SearchType actual) {
        super(actual, SearchTypeAssert.class);
    }

    /**
     * An entry point for SearchTypeAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(mySearchType)</code> and get specific assertion with code completion.
     *
     * @param actual the SearchType we want to make assertions on.
     * @return a new <code>{@link SearchTypeAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static SearchTypeAssert assertThat(SearchType actual) {
        return new SearchTypeAssert(actual);
    }
}
