package org.nzbhydra.mapping.newznab.xml;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link NewznabXmlItem} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractNewznabXmlItemAssert<S extends AbstractNewznabXmlItemAssert<S, A>, A extends NewznabXmlItem> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractNewznabXmlItemAssert}</code> to make assertions on actual NewznabXmlItem.
     *
     * @param actual the NewznabXmlItem we want to make assertions on.
     */
    protected AbstractNewznabXmlItemAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual NewznabXmlItem's category is equal to the given one.
     *
     * @param category the given category to compare the actual NewznabXmlItem's category to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabXmlItem's category is not equal to the given one.
     */
    public S hasCategory(String category) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting category of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualCategory = actual.getCategory();
        if (!Objects.areEqual(actualCategory, category)) {
            failWithMessage(assertjErrorMessage, actual, category, actualCategory);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's comments is equal to the given one.
     *
     * @param comments the given comments to compare the actual NewznabXmlItem's comments to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabXmlItem's comments is not equal to the given one.
     */
    public S hasComments(String comments) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting comments of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualComments = actual.getComments();
        if (!Objects.areEqual(actualComments, comments)) {
            failWithMessage(assertjErrorMessage, actual, comments, actualComments);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's description is equal to the given one.
     *
     * @param description the given description to compare the actual NewznabXmlItem's description to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabXmlItem's description is not equal to the given one.
     */
    public S hasDescription(String description) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting description of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualDescription = actual.getDescription();
        if (!Objects.areEqual(actualDescription, description)) {
            failWithMessage(assertjErrorMessage, actual, description, actualDescription);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's enclosure is equal to the given one.
     *
     * @param enclosure the given enclosure to compare the actual NewznabXmlItem's enclosure to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabXmlItem's enclosure is not equal to the given one.
     */
    public S hasEnclosure(NewznabXmlEnclosure enclosure) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting enclosure of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        NewznabXmlEnclosure actualEnclosure = actual.getEnclosure();
        if (!Objects.areEqual(actualEnclosure, enclosure)) {
            failWithMessage(assertjErrorMessage, actual, enclosure, actualEnclosure);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's enclosures contains the given NewznabXmlEnclosure elements.
     *
     * @param enclosures the given elements that should be contained in actual NewznabXmlItem's enclosures.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's enclosures does not contain all given NewznabXmlEnclosure elements.
     */
    public S hasEnclosures(NewznabXmlEnclosure... enclosures) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabXmlEnclosure varargs is not null.
        if (enclosures == null) {
            failWithMessage("Expecting enclosures parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getEnclosures(), enclosures);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's enclosures contains the given NewznabXmlEnclosure elements in Collection.
     *
     * @param enclosures the given elements that should be contained in actual NewznabXmlItem's enclosures.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's enclosures does not contain all given NewznabXmlEnclosure elements.
     */
    public S hasEnclosures(java.util.Collection<? extends NewznabXmlEnclosure> enclosures) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabXmlEnclosure collection is not null.
        if (enclosures == null) {
            failWithMessage("Expecting enclosures parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getEnclosures(), enclosures.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's enclosures contains <b>only</b> the given NewznabXmlEnclosure elements and nothing else in whatever order.
     *
     * @param enclosures the given elements that should be contained in actual NewznabXmlItem's enclosures.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's enclosures does not contain all given NewznabXmlEnclosure elements.
     */
    public S hasOnlyEnclosures(NewznabXmlEnclosure... enclosures) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabXmlEnclosure varargs is not null.
        if (enclosures == null) {
            failWithMessage("Expecting enclosures parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getEnclosures(), enclosures);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's enclosures contains <b>only</b> the given NewznabXmlEnclosure elements in Collection and nothing else in whatever order.
     *
     * @param enclosures the given elements that should be contained in actual NewznabXmlItem's enclosures.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's enclosures does not contain all given NewznabXmlEnclosure elements.
     */
    public S hasOnlyEnclosures(java.util.Collection<? extends NewznabXmlEnclosure> enclosures) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabXmlEnclosure collection is not null.
        if (enclosures == null) {
            failWithMessage("Expecting enclosures parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getEnclosures(), enclosures.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's enclosures does not contain the given NewznabXmlEnclosure elements.
     *
     * @param enclosures the given elements that should not be in actual NewznabXmlItem's enclosures.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's enclosures contains any given NewznabXmlEnclosure elements.
     */
    public S doesNotHaveEnclosures(NewznabXmlEnclosure... enclosures) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabXmlEnclosure varargs is not null.
        if (enclosures == null) {
            failWithMessage("Expecting enclosures parameter not to be null.");
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getEnclosures(), enclosures);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's enclosures does not contain the given NewznabXmlEnclosure elements in Collection.
     *
     * @param enclosures the given elements that should not be in actual NewznabXmlItem's enclosures.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's enclosures contains any given NewznabXmlEnclosure elements.
     */
    public S doesNotHaveEnclosures(java.util.Collection<? extends NewznabXmlEnclosure> enclosures) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabXmlEnclosure collection is not null.
        if (enclosures == null) {
            failWithMessage("Expecting enclosures parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getEnclosures(), enclosures.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem has no enclosures.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's enclosures is not empty.
     */
    public S hasNoEnclosures() {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have enclosures but had :\n  <%s>";

        // check
        if (actual.getEnclosures().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getEnclosures());
        }

        // return the current assertion for method chaining
        return myself;
    }


    /**
     * Verifies that the actual NewznabXmlItem's grabs is equal to the given one.
     *
     * @param grabs the given grabs to compare the actual NewznabXmlItem's grabs to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabXmlItem's grabs is not equal to the given one.
     */
    public S hasGrabs(Integer grabs) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting grabs of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualGrabs = actual.getGrabs();
        if (!Objects.areEqual(actualGrabs, grabs)) {
            failWithMessage(assertjErrorMessage, actual, grabs, actualGrabs);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's link is equal to the given one.
     *
     * @param link the given link to compare the actual NewznabXmlItem's link to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabXmlItem's link is not equal to the given one.
     */
    public S hasLink(String link) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting link of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualLink = actual.getLink();
        if (!Objects.areEqual(actualLink, link)) {
            failWithMessage(assertjErrorMessage, actual, link, actualLink);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's newznabAttributes contains the given NewznabAttribute elements.
     *
     * @param newznabAttributes the given elements that should be contained in actual NewznabXmlItem's newznabAttributes.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's newznabAttributes does not contain all given NewznabAttribute elements.
     */
    public S hasNewznabAttributes(NewznabAttribute... newznabAttributes) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabAttribute varargs is not null.
        if (newznabAttributes == null) {
            failWithMessage("Expecting newznabAttributes parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getNewznabAttributes(), newznabAttributes);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's newznabAttributes contains the given NewznabAttribute elements in Collection.
     *
     * @param newznabAttributes the given elements that should be contained in actual NewznabXmlItem's newznabAttributes.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's newznabAttributes does not contain all given NewznabAttribute elements.
     */
    public S hasNewznabAttributes(java.util.Collection<? extends NewznabAttribute> newznabAttributes) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabAttribute collection is not null.
        if (newznabAttributes == null) {
            failWithMessage("Expecting newznabAttributes parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getNewznabAttributes(), newznabAttributes.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's newznabAttributes contains <b>only</b> the given NewznabAttribute elements and nothing else in whatever order.
     *
     * @param newznabAttributes the given elements that should be contained in actual NewznabXmlItem's newznabAttributes.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's newznabAttributes does not contain all given NewznabAttribute elements.
     */
    public S hasOnlyNewznabAttributes(NewznabAttribute... newznabAttributes) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabAttribute varargs is not null.
        if (newznabAttributes == null) {
            failWithMessage("Expecting newznabAttributes parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getNewznabAttributes(), newznabAttributes);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's newznabAttributes contains <b>only</b> the given NewznabAttribute elements in Collection and nothing else in whatever order.
     *
     * @param newznabAttributes the given elements that should be contained in actual NewznabXmlItem's newznabAttributes.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's newznabAttributes does not contain all given NewznabAttribute elements.
     */
    public S hasOnlyNewznabAttributes(java.util.Collection<? extends NewznabAttribute> newznabAttributes) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabAttribute collection is not null.
        if (newznabAttributes == null) {
            failWithMessage("Expecting newznabAttributes parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getNewznabAttributes(), newznabAttributes.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's newznabAttributes does not contain the given NewznabAttribute elements.
     *
     * @param newznabAttributes the given elements that should not be in actual NewznabXmlItem's newznabAttributes.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's newznabAttributes contains any given NewznabAttribute elements.
     */
    public S doesNotHaveNewznabAttributes(NewznabAttribute... newznabAttributes) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabAttribute varargs is not null.
        if (newznabAttributes == null) {
            failWithMessage("Expecting newznabAttributes parameter not to be null.");
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getNewznabAttributes(), newznabAttributes);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's newznabAttributes does not contain the given NewznabAttribute elements in Collection.
     *
     * @param newznabAttributes the given elements that should not be in actual NewznabXmlItem's newznabAttributes.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's newznabAttributes contains any given NewznabAttribute elements.
     */
    public S doesNotHaveNewznabAttributes(java.util.Collection<? extends NewznabAttribute> newznabAttributes) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabAttribute collection is not null.
        if (newznabAttributes == null) {
            failWithMessage("Expecting newznabAttributes parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getNewznabAttributes(), newznabAttributes.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem has no newznabAttributes.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's newznabAttributes is not empty.
     */
    public S hasNoNewznabAttributes() {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have newznabAttributes but had :\n  <%s>";

        // check
        if (actual.getNewznabAttributes().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getNewznabAttributes());
        }

        // return the current assertion for method chaining
        return myself;
    }


    /**
     * Verifies that the actual NewznabXmlItem's pubDate is equal to the given one.
     *
     * @param pubDate the given pubDate to compare the actual NewznabXmlItem's pubDate to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabXmlItem's pubDate is not equal to the given one.
     */
    public S hasPubDate(java.time.Instant pubDate) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting pubDate of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        java.time.Instant actualPubDate = actual.getPubDate();
        if (!Objects.areEqual(actualPubDate, pubDate)) {
            failWithMessage(assertjErrorMessage, actual, pubDate, actualPubDate);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's rssGuid is equal to the given one.
     *
     * @param rssGuid the given rssGuid to compare the actual NewznabXmlItem's rssGuid to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabXmlItem's rssGuid is not equal to the given one.
     */
    public S hasRssGuid(NewznabXmlGuid rssGuid) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting rssGuid of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        NewznabXmlGuid actualRssGuid = actual.getRssGuid();
        if (!Objects.areEqual(actualRssGuid, rssGuid)) {
            failWithMessage(assertjErrorMessage, actual, rssGuid, actualRssGuid);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's size is equal to the given one.
     *
     * @param size the given size to compare the actual NewznabXmlItem's size to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabXmlItem's size is not equal to the given one.
     */
    public S hasSize(Long size) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting size of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Long actualSize = actual.getSize();
        if (!Objects.areEqual(actualSize, size)) {
            failWithMessage(assertjErrorMessage, actual, size, actualSize);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's title is equal to the given one.
     *
     * @param title the given title to compare the actual NewznabXmlItem's title to.
     * @return this assertion object.
     * @throws AssertionError - if the actual NewznabXmlItem's title is not equal to the given one.
     */
    public S hasTitle(String title) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting title of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualTitle = actual.getTitle();
        if (!Objects.areEqual(actualTitle, title)) {
            failWithMessage(assertjErrorMessage, actual, title, actualTitle);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's torznabAttributes contains the given NewznabAttribute elements.
     *
     * @param torznabAttributes the given elements that should be contained in actual NewznabXmlItem's torznabAttributes.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's torznabAttributes does not contain all given NewznabAttribute elements.
     */
    public S hasTorznabAttributes(NewznabAttribute... torznabAttributes) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabAttribute varargs is not null.
        if (torznabAttributes == null) {
            failWithMessage("Expecting torznabAttributes parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getTorznabAttributes(), torznabAttributes);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's torznabAttributes contains the given NewznabAttribute elements in Collection.
     *
     * @param torznabAttributes the given elements that should be contained in actual NewznabXmlItem's torznabAttributes.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's torznabAttributes does not contain all given NewznabAttribute elements.
     */
    public S hasTorznabAttributes(java.util.Collection<? extends NewznabAttribute> torznabAttributes) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabAttribute collection is not null.
        if (torznabAttributes == null) {
            failWithMessage("Expecting torznabAttributes parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getTorznabAttributes(), torznabAttributes.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's torznabAttributes contains <b>only</b> the given NewznabAttribute elements and nothing else in whatever order.
     *
     * @param torznabAttributes the given elements that should be contained in actual NewznabXmlItem's torznabAttributes.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's torznabAttributes does not contain all given NewznabAttribute elements.
     */
    public S hasOnlyTorznabAttributes(NewznabAttribute... torznabAttributes) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabAttribute varargs is not null.
        if (torznabAttributes == null) {
            failWithMessage("Expecting torznabAttributes parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getTorznabAttributes(), torznabAttributes);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's torznabAttributes contains <b>only</b> the given NewznabAttribute elements in Collection and nothing else in whatever order.
     *
     * @param torznabAttributes the given elements that should be contained in actual NewznabXmlItem's torznabAttributes.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's torznabAttributes does not contain all given NewznabAttribute elements.
     */
    public S hasOnlyTorznabAttributes(java.util.Collection<? extends NewznabAttribute> torznabAttributes) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabAttribute collection is not null.
        if (torznabAttributes == null) {
            failWithMessage("Expecting torznabAttributes parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getTorznabAttributes(), torznabAttributes.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's torznabAttributes does not contain the given NewznabAttribute elements.
     *
     * @param torznabAttributes the given elements that should not be in actual NewznabXmlItem's torznabAttributes.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's torznabAttributes contains any given NewznabAttribute elements.
     */
    public S doesNotHaveTorznabAttributes(NewznabAttribute... torznabAttributes) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabAttribute varargs is not null.
        if (torznabAttributes == null) {
            failWithMessage("Expecting torznabAttributes parameter not to be null.");
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getTorznabAttributes(), torznabAttributes);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem's torznabAttributes does not contain the given NewznabAttribute elements in Collection.
     *
     * @param torznabAttributes the given elements that should not be in actual NewznabXmlItem's torznabAttributes.
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's torznabAttributes contains any given NewznabAttribute elements.
     */
    public S doesNotHaveTorznabAttributes(java.util.Collection<? extends NewznabAttribute> torznabAttributes) {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // check that given NewznabAttribute collection is not null.
        if (torznabAttributes == null) {
            failWithMessage("Expecting torznabAttributes parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getTorznabAttributes(), torznabAttributes.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual NewznabXmlItem has no torznabAttributes.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual NewznabXmlItem's torznabAttributes is not empty.
     */
    public S hasNoTorznabAttributes() {
        // check that actual NewznabXmlItem we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have torznabAttributes but had :\n  <%s>";

        // check
        if (actual.getTorznabAttributes().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getTorznabAttributes());
        }

        // return the current assertion for method chaining
        return myself;
    }


}
