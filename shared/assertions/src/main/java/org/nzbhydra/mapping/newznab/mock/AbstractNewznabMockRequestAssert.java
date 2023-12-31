package org.nzbhydra.mapping.newznab.mock;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link NewznabMockRequest} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractNewznabMockRequestAssert<S extends AbstractNewznabMockRequestAssert<S, A>, A extends NewznabMockRequest> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractNewznabMockRequestAssert}</code> to make assertions on actual NewznabMockRequest.
     *
     * @param actual the NewznabMockRequest we want to make assertions on.
     */
    protected AbstractNewznabMockRequestAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual NewznabMockRequest is generate duplicates.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabMockRequest is not generate duplicates.
     */
    public S isGenerateDuplicates() {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is true
        if (!actual.isGenerateDuplicates()) {
            failWithMessage("\nExpecting that actual NewznabMockRequest is generate duplicates but is not.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest is not generate duplicates.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabMockRequest is generate duplicates.
     */
    public S isNotGenerateDuplicates() {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is false
        if (actual.isGenerateDuplicates()) {
            failWithMessage("\nExpecting that actual NewznabMockRequest is not generate duplicates but is.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest is generate one duplicate.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabMockRequest is not generate one duplicate.
     */
    public S isGenerateOneDuplicate() {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is true
        if (!actual.isGenerateOneDuplicate()) {
            failWithMessage("\nExpecting that actual NewznabMockRequest is generate one duplicate but is not.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest is not generate one duplicate.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabMockRequest is generate one duplicate.
     */
    public S isNotGenerateOneDuplicate() {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is false
        if (actual.isGenerateOneDuplicate()) {
            failWithMessage("\nExpecting that actual NewznabMockRequest is not generate one duplicate but is.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest's indexer is equal to the given one.
     *
     * @param indexer the given indexer to compare the actual NewznabMockRequest's indexer to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabMockRequest's indexer is not equal to the given one.
     */
    public S hasIndexer(String indexer) {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting indexer of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualIndexer = actual.getIndexer();
        if (!Objects.areEqual(actualIndexer, indexer)) {
            failWithMessage(assertjErrorMessage, actual, indexer, actualIndexer);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest's newznabCategory is equal to the given one.
     *
     * @param newznabCategory the given newznabCategory to compare the actual NewznabMockRequest's newznabCategory to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabMockRequest's newznabCategory is not equal to the given one.
     */
    public S hasNewznabCategory(String newznabCategory) {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting newznabCategory of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualNewznabCategory = actual.getNewznabCategory();
        if (!Objects.areEqual(actualNewznabCategory, newznabCategory)) {
            failWithMessage(assertjErrorMessage, actual, newznabCategory, actualNewznabCategory);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest's numberOfResults is equal to the given one.
     *
     * @param numberOfResults the given numberOfResults to compare the actual NewznabMockRequest's numberOfResults to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabMockRequest's numberOfResults is not equal to the given one.
     */
    public S hasNumberOfResults(int numberOfResults) {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting numberOfResults of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // check
        int actualNumberOfResults = actual.getNumberOfResults();
        if (actualNumberOfResults != numberOfResults) {
            failWithMessage(assertjErrorMessage, actual, numberOfResults, actualNumberOfResults);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest's offset is equal to the given one.
     *
     * @param offset the given offset to compare the actual NewznabMockRequest's offset to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabMockRequest's offset is not equal to the given one.
     */
    public S hasOffset(int offset) {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting offset of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // check
        int actualOffset = actual.getOffset();
        if (actualOffset != offset) {
            failWithMessage(assertjErrorMessage, actual, offset, actualOffset);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest's titleBase is equal to the given one.
     *
     * @param titleBase the given titleBase to compare the actual NewznabMockRequest's titleBase to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabMockRequest's titleBase is not equal to the given one.
     */
    public S hasTitleBase(String titleBase) {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting titleBase of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualTitleBase = actual.getTitleBase();
        if (!Objects.areEqual(actualTitleBase, titleBase)) {
            failWithMessage(assertjErrorMessage, actual, titleBase, actualTitleBase);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest's titleWords contains the given String elements.
     *
     * @param titleWords the given elements that should be contained in actual NewznabMockRequest's titleWords.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabMockRequest's titleWords does not contain all given String elements.
     */
    public S hasTitleWords(String... titleWords) {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // check that given String varargs is not null.
        if (titleWords == null) {
            failWithMessage("Expecting titleWords parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getTitleWords(), titleWords);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest's titleWords contains the given String elements in Collection.
     *
     * @param titleWords the given elements that should be contained in actual NewznabMockRequest's titleWords.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabMockRequest's titleWords does not contain all given String elements.
     */
    public S hasTitleWords(java.util.Collection<? extends String> titleWords) {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // check that given String collection is not null.
        if (titleWords == null) {
            failWithMessage("Expecting titleWords parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getTitleWords(), titleWords.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest's titleWords contains <b>only</b> the given String elements and nothing else in whatever order.
     *
     * @param titleWords the given elements that should be contained in actual NewznabMockRequest's titleWords.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabMockRequest's titleWords does not contain all given String elements.
     */
    public S hasOnlyTitleWords(String... titleWords) {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // check that given String varargs is not null.
        if (titleWords == null) {
            failWithMessage("Expecting titleWords parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getTitleWords(), titleWords);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest's titleWords contains <b>only</b> the given String elements in Collection and nothing else in whatever order.
     *
     * @param titleWords the given elements that should be contained in actual NewznabMockRequest's titleWords.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabMockRequest's titleWords does not contain all given String elements.
     */
    public S hasOnlyTitleWords(java.util.Collection<? extends String> titleWords) {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // check that given String collection is not null.
        if (titleWords == null) {
            failWithMessage("Expecting titleWords parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getTitleWords(), titleWords.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest's titleWords does not contain the given String elements.
     *
     * @param titleWords the given elements that should not be in actual NewznabMockRequest's titleWords.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabMockRequest's titleWords contains any given String elements.
     */
    public S doesNotHaveTitleWords(String... titleWords) {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // check that given String varargs is not null.
        if (titleWords == null) {
            failWithMessage("Expecting titleWords parameter not to be null.");
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getTitleWords(), titleWords);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest's titleWords does not contain the given String elements in Collection.
     *
     * @param titleWords the given elements that should not be in actual NewznabMockRequest's titleWords.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabMockRequest's titleWords contains any given String elements.
     */
    public S doesNotHaveTitleWords(java.util.Collection<? extends String> titleWords) {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // check that given String collection is not null.
        if (titleWords == null) {
            failWithMessage("Expecting titleWords parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getTitleWords(), titleWords.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest has no titleWords.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabMockRequest's titleWords is not empty.
     */
    public S hasNoTitleWords() {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have titleWords but had :\n  <%s>";

        // check
        if (actual.getTitleWords().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getTitleWords());
        }

        // return the current assertion for method chaining
        return myself;
    }


    /**
     * Verifies that the actual NewznabMockRequest is torznab.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabMockRequest is not torznab.
     */
    public S isTorznab() {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is true
        if (!actual.isTorznab()) {
            failWithMessage("\nExpecting that actual NewznabMockRequest is torznab but is not.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest is not torznab.
     *
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabMockRequest is torznab.
     */
    public S isNotTorznab() {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // check that property call/field access is false
        if (actual.isTorznab()) {
            failWithMessage("\nExpecting that actual NewznabMockRequest is not torznab but is.");
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabMockRequest's total is equal to the given one.
     *
     * @param total the given total to compare the actual NewznabMockRequest's total to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabMockRequest's total is not equal to the given one.
     */
    public S hasTotal(int total) {
        // check that actual NewznabMockRequest we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting total of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // check
        int actualTotal = actual.getTotal();
        if (actualTotal != total) {
            failWithMessage(assertjErrorMessage, actual, total, actualTotal);
        }

        // return the current assertion for method chaining
        return myself;
    }

}
