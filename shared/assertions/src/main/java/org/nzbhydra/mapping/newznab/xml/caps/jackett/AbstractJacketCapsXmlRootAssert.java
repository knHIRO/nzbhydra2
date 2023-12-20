package org.nzbhydra.mapping.newznab.xml.caps.jackett;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;

/**
 * Abstract base class for {@link JacketCapsXmlRoot} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractJacketCapsXmlRootAssert<S extends AbstractJacketCapsXmlRootAssert<S, A>, A extends JacketCapsXmlRoot> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractJacketCapsXmlRootAssert}</code> to make assertions on actual JacketCapsXmlRoot.
     *
     * @param actual the JacketCapsXmlRoot we want to make assertions on.
     */
    protected AbstractJacketCapsXmlRootAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual JacketCapsXmlRoot's indexers contains the given JacketCapsXmlIndexer elements.
     *
     * @param indexers the given elements that should be contained in actual JacketCapsXmlRoot's indexers.
     * @return this assertion object.
     * @throws AssertionError if the actual JacketCapsXmlRoot's indexers does not contain all given JacketCapsXmlIndexer elements.
     */
    public S hasIndexers(JacketCapsXmlIndexer... indexers) {
        // check that actual JacketCapsXmlRoot we want to make assertions on is not null.
        isNotNull();

        // check that given JacketCapsXmlIndexer varargs is not null.
        if (indexers == null) {
            failWithMessage("Expecting indexers parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getIndexers(), indexers);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual JacketCapsXmlRoot's indexers contains the given JacketCapsXmlIndexer elements in Collection.
     *
     * @param indexers the given elements that should be contained in actual JacketCapsXmlRoot's indexers.
     * @return this assertion object.
     * @throws AssertionError if the actual JacketCapsXmlRoot's indexers does not contain all given JacketCapsXmlIndexer elements.
     */
    public S hasIndexers(java.util.Collection<? extends JacketCapsXmlIndexer> indexers) {
        // check that actual JacketCapsXmlRoot we want to make assertions on is not null.
        isNotNull();

        // check that given JacketCapsXmlIndexer collection is not null.
        if (indexers == null) {
            failWithMessage("Expecting indexers parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getIndexers(), indexers.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual JacketCapsXmlRoot's indexers contains <b>only</b> the given JacketCapsXmlIndexer elements and nothing else in whatever order.
     *
     * @param indexers the given elements that should be contained in actual JacketCapsXmlRoot's indexers.
     * @return this assertion object.
     * @throws AssertionError if the actual JacketCapsXmlRoot's indexers does not contain all given JacketCapsXmlIndexer elements.
     */
    public S hasOnlyIndexers(JacketCapsXmlIndexer... indexers) {
        // check that actual JacketCapsXmlRoot we want to make assertions on is not null.
        isNotNull();

        // check that given JacketCapsXmlIndexer varargs is not null.
        if (indexers == null) {
            failWithMessage("Expecting indexers parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getIndexers(), indexers);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual JacketCapsXmlRoot's indexers contains <b>only</b> the given JacketCapsXmlIndexer elements in Collection and nothing else in whatever order.
     *
     * @param indexers the given elements that should be contained in actual JacketCapsXmlRoot's indexers.
     * @return this assertion object.
     * @throws AssertionError if the actual JacketCapsXmlRoot's indexers does not contain all given JacketCapsXmlIndexer elements.
     */
    public S hasOnlyIndexers(java.util.Collection<? extends JacketCapsXmlIndexer> indexers) {
        // check that actual JacketCapsXmlRoot we want to make assertions on is not null.
        isNotNull();

        // check that given JacketCapsXmlIndexer collection is not null.
        if (indexers == null) {
            failWithMessage("Expecting indexers parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getIndexers(), indexers.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual JacketCapsXmlRoot's indexers does not contain the given JacketCapsXmlIndexer elements.
     *
     * @param indexers the given elements that should not be in actual JacketCapsXmlRoot's indexers.
     * @return this assertion object.
     * @throws AssertionError if the actual JacketCapsXmlRoot's indexers contains any given JacketCapsXmlIndexer elements.
     */
    public S doesNotHaveIndexers(JacketCapsXmlIndexer... indexers) {
        // check that actual JacketCapsXmlRoot we want to make assertions on is not null.
        isNotNull();

        // check that given JacketCapsXmlIndexer varargs is not null.
        if (indexers == null) {
            failWithMessage("Expecting indexers parameter not to be null.");
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getIndexers(), indexers);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual JacketCapsXmlRoot's indexers does not contain the given JacketCapsXmlIndexer elements in Collection.
     *
     * @param indexers the given elements that should not be in actual JacketCapsXmlRoot's indexers.
     * @return this assertion object.
     * @throws AssertionError if the actual JacketCapsXmlRoot's indexers contains any given JacketCapsXmlIndexer elements.
     */
    public S doesNotHaveIndexers(java.util.Collection<? extends JacketCapsXmlIndexer> indexers) {
        // check that actual JacketCapsXmlRoot we want to make assertions on is not null.
        isNotNull();

        // check that given JacketCapsXmlIndexer collection is not null.
        if (indexers == null) {
            failWithMessage("Expecting indexers parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getIndexers(), indexers.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual JacketCapsXmlRoot has no indexers.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual JacketCapsXmlRoot's indexers is not empty.
     */
    public S hasNoIndexers() {
        // check that actual JacketCapsXmlRoot we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have indexers but had :\n  <%s>";

        // check
        if (actual.getIndexers().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getIndexers());
        }

        // return the current assertion for method chaining
        return myself;
    }


}
