package org.nzbhydra.mapping.newznab.json.caps;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;

/**
 * Abstract base class for {@link CapsJsonCategoriesHolder} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractCapsJsonCategoriesHolderAssert<S extends AbstractCapsJsonCategoriesHolderAssert<S, A>, A extends CapsJsonCategoriesHolder> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractCapsJsonCategoriesHolderAssert}</code> to make assertions on actual CapsJsonCategoriesHolder.
     *
     * @param actual the CapsJsonCategoriesHolder we want to make assertions on.
     */
    protected AbstractCapsJsonCategoriesHolderAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual CapsJsonCategoriesHolder's category contains the given CapsJsonCategory elements.
     *
     * @param category the given elements that should be contained in actual CapsJsonCategoriesHolder's category.
     * @return this assertion object.
     * @throws AssertionError if the actual CapsJsonCategoriesHolder's category does not contain all given CapsJsonCategory elements.
     */
    public S hasCategory(CapsJsonCategory... category) {
        // check that actual CapsJsonCategoriesHolder we want to make assertions on is not null.
        isNotNull();

        // check that given CapsJsonCategory varargs is not null.
        if (category == null) {
            failWithMessage("Expecting category parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getCategory(), category);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CapsJsonCategoriesHolder's category contains the given CapsJsonCategory elements in Collection.
     *
     * @param category the given elements that should be contained in actual CapsJsonCategoriesHolder's category.
     * @return this assertion object.
     * @throws AssertionError if the actual CapsJsonCategoriesHolder's category does not contain all given CapsJsonCategory elements.
     */
    public S hasCategory(java.util.Collection<? extends CapsJsonCategory> category) {
        // check that actual CapsJsonCategoriesHolder we want to make assertions on is not null.
        isNotNull();

        // check that given CapsJsonCategory collection is not null.
        if (category == null) {
            failWithMessage("Expecting category parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getCategory(), category.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CapsJsonCategoriesHolder's category contains <b>only</b> the given CapsJsonCategory elements and nothing else in whatever order.
     *
     * @param category the given elements that should be contained in actual CapsJsonCategoriesHolder's category.
     * @return this assertion object.
     * @throws AssertionError if the actual CapsJsonCategoriesHolder's category does not contain all given CapsJsonCategory elements.
     */
    public S hasOnlyCategory(CapsJsonCategory... category) {
        // check that actual CapsJsonCategoriesHolder we want to make assertions on is not null.
        isNotNull();

        // check that given CapsJsonCategory varargs is not null.
        if (category == null) {
            failWithMessage("Expecting category parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getCategory(), category);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CapsJsonCategoriesHolder's category contains <b>only</b> the given CapsJsonCategory elements in Collection and nothing else in whatever order.
     *
     * @param category the given elements that should be contained in actual CapsJsonCategoriesHolder's category.
     * @return this assertion object.
     * @throws AssertionError if the actual CapsJsonCategoriesHolder's category does not contain all given CapsJsonCategory elements.
     */
    public S hasOnlyCategory(java.util.Collection<? extends CapsJsonCategory> category) {
        // check that actual CapsJsonCategoriesHolder we want to make assertions on is not null.
        isNotNull();

        // check that given CapsJsonCategory collection is not null.
        if (category == null) {
            failWithMessage("Expecting category parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getCategory(), category.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CapsJsonCategoriesHolder's category does not contain the given CapsJsonCategory elements.
     *
     * @param category the given elements that should not be in actual CapsJsonCategoriesHolder's category.
     * @return this assertion object.
     * @throws AssertionError if the actual CapsJsonCategoriesHolder's category contains any given CapsJsonCategory elements.
     */
    public S doesNotHaveCategory(CapsJsonCategory... category) {
        // check that actual CapsJsonCategoriesHolder we want to make assertions on is not null.
        isNotNull();

        // check that given CapsJsonCategory varargs is not null.
        if (category == null) {
            failWithMessage("Expecting category parameter not to be null.");
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getCategory(), category);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CapsJsonCategoriesHolder's category does not contain the given CapsJsonCategory elements in Collection.
     *
     * @param category the given elements that should not be in actual CapsJsonCategoriesHolder's category.
     * @return this assertion object.
     * @throws AssertionError if the actual CapsJsonCategoriesHolder's category contains any given CapsJsonCategory elements.
     */
    public S doesNotHaveCategory(java.util.Collection<? extends CapsJsonCategory> category) {
        // check that actual CapsJsonCategoriesHolder we want to make assertions on is not null.
        isNotNull();

        // check that given CapsJsonCategory collection is not null.
        if (category == null) {
            failWithMessage("Expecting category parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getCategory(), category.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual CapsJsonCategoriesHolder has no category.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual CapsJsonCategoriesHolder's category is not empty.
     */
    public S hasNoCategory() {
        // check that actual CapsJsonCategoriesHolder we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have category but had :\n  <%s>";

        // check
        if (actual.getCategory().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getCategory());
        }

        // return the current assertion for method chaining
        return myself;
    }


}
