package org.nzbhydra.mapping.newznab.json;

/**
 * {@link NewznabJsonChannelResponse} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractNewznabJsonChannelResponseAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class NewznabJsonChannelResponseAssert extends AbstractNewznabJsonChannelResponseAssert<NewznabJsonChannelResponseAssert, NewznabJsonChannelResponse> {

    /**
     * Creates a new <code>{@link NewznabJsonChannelResponseAssert}</code> to make assertions on actual NewznabJsonChannelResponse.
     *
     * @param actual the NewznabJsonChannelResponse we want to make assertions on.
     */
    public NewznabJsonChannelResponseAssert(NewznabJsonChannelResponse actual) {
        super(actual, NewznabJsonChannelResponseAssert.class);
    }

    /**
     * An entry point for NewznabJsonChannelResponseAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myNewznabJsonChannelResponse)</code> and get specific assertion with code completion.
     *
     * @param actual the NewznabJsonChannelResponse we want to make assertions on.
     * @return a new <code>{@link NewznabJsonChannelResponseAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static NewznabJsonChannelResponseAssert assertThat(NewznabJsonChannelResponse actual) {
        return new NewznabJsonChannelResponseAssert(actual);
    }
}
