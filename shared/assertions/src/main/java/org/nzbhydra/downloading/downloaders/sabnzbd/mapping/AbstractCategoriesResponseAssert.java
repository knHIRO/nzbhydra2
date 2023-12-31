package org.nzbhydra.downloading.downloaders.sabnzbd.mapping;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;

/**
 * Abstract base class for {@link CategoriesResponse} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractCategoriesResponseAssert<S extends AbstractCategoriesResponseAssert<S, A>, A extends CategoriesResponse> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractCategoriesResponseAssert}</code> to make assertions on actual CategoriesResponse.
     *
     * @param actual the CategoriesResponse we want to make assertions on.
     */
    protected AbstractCategoriesResponseAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual CategoriesResponse's categories contains the given String elements.
     *
     * @param categories the given elements that should be contained in actual CategoriesResponse's categories.
     * @return this assertion object.
     * @throws AssertionError if the actual CategoriesResponse's categories does not contain all given String elements.
     */
    public S hasCategories(String... categories) {
        // check that actual CategoriesResponse we want to make assertions on is not null.
        isNotNull();

        // check that given String varargs is not null.
        if (categories == null) {
            failWithMessage("Expecting categories parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getCategories(), categories);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CategoriesResponse's categories contains the given String elements in Collection.
     *
     * @param categories the given elements that should be contained in actual CategoriesResponse's categories.
     * @return this assertion object.
     * @throws AssertionError if the actual CategoriesResponse's categories does not contain all given String elements.
     */
    public S hasCategories(java.util.Collection<? extends String> categories) {
        // check that actual CategoriesResponse we want to make assertions on is not null.
        isNotNull();

        // check that given String collection is not null.
        if (categories == null) {
            failWithMessage("Expecting categories parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getCategories(), categories.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CategoriesResponse's categories contains <b>only</b> the given String elements and nothing else in whatever order.
     *
     * @param categories the given elements that should be contained in actual CategoriesResponse's categories.
     * @return this assertion object.
     * @throws AssertionError if the actual CategoriesResponse's categories does not contain all given String elements.
     */
    public S hasOnlyCategories(String... categories) {
        // check that actual CategoriesResponse we want to make assertions on is not null.
        isNotNull();

        // check that given String varargs is not null.
        if (categories == null) {
            failWithMessage("Expecting categories parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getCategories(), categories);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CategoriesResponse's categories contains <b>only</b> the given String elements in Collection and nothing else in whatever order.
     *
     * @param categories the given elements that should be contained in actual CategoriesResponse's categories.
     * @return this assertion object.
     * @throws AssertionError if the actual CategoriesResponse's categories does not contain all given String elements.
     */
    public S hasOnlyCategories(java.util.Collection<? extends String> categories) {
        // check that actual CategoriesResponse we want to make assertions on is not null.
        isNotNull();

        // check that given String collection is not null.
        if (categories == null) {
            failWithMessage("Expecting categories parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getCategories(), categories.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CategoriesResponse's categories does not contain the given String elements.
     *
     * @param categories the given elements that should not be in actual CategoriesResponse's categories.
     * @return this assertion object.
     * @throws AssertionError if the actual CategoriesResponse's categories contains any given String elements.
     */
    public S doesNotHaveCategories(String... categories) {
        // check that actual CategoriesResponse we want to make assertions on is not null.
        isNotNull();

        // check that given String varargs is not null.
        if (categories == null) {
            failWithMessage("Expecting categories parameter not to be null.");
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getCategories(), categories);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CategoriesResponse's categories does not contain the given String elements in Collection.
     *
     * @param categories the given elements that should not be in actual CategoriesResponse's categories.
     * @return this assertion object.
     * @throws AssertionError if the actual CategoriesResponse's categories contains any given String elements.
     */
    public S doesNotHaveCategories(java.util.Collection<? extends String> categories) {
        // check that actual CategoriesResponse we want to make assertions on is not null.
        isNotNull();

        // check that given String collection is not null.
        if (categories == null) {
            failWithMessage("Expecting categories parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getCategories(), categories.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CategoriesResponse has no categories.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual CategoriesResponse's categories is not empty.
     */
    public S hasNoCategories() {
        // check that actual CategoriesResponse we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have categories but had :\n  <%s>";

        // check
        if (actual.getCategories().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getCategories());
        }

        // return the current assertion for method chaining
        return myself;
    }


}
