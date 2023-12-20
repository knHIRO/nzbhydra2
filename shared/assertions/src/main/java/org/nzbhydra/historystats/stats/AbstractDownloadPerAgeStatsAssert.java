package org.nzbhydra.historystats.stats;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link DownloadPerAgeStats} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractDownloadPerAgeStatsAssert<S extends AbstractDownloadPerAgeStatsAssert<S, A>, A extends DownloadPerAgeStats> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractDownloadPerAgeStatsAssert}</code> to make assertions on actual DownloadPerAgeStats.
     *
     * @param actual the DownloadPerAgeStats we want to make assertions on.
     */
    protected AbstractDownloadPerAgeStatsAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual DownloadPerAgeStats's averageAge is equal to the given one.
     *
     * @param averageAge the given averageAge to compare the actual DownloadPerAgeStats's averageAge to.
     * @return this assertion object.
     * @throws AssertionError - if the actual DownloadPerAgeStats's averageAge is not equal to the given one.
     */
    public S hasAverageAge(Integer averageAge) {
        // check that actual DownloadPerAgeStats we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting averageAge of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualAverageAge = actual.getAverageAge();
        if (!Objects.areEqual(actualAverageAge, averageAge)) {
            failWithMessage(assertjErrorMessage, actual, averageAge, actualAverageAge);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual DownloadPerAgeStats's downloadsPerAge contains the given DownloadPerAge elements.
     *
     * @param downloadsPerAge the given elements that should be contained in actual DownloadPerAgeStats's downloadsPerAge.
     * @return this assertion object.
     * @throws AssertionError if the actual DownloadPerAgeStats's downloadsPerAge does not contain all given DownloadPerAge elements.
     */
    public S hasDownloadsPerAge(DownloadPerAge... downloadsPerAge) {
        // check that actual DownloadPerAgeStats we want to make assertions on is not null.
        isNotNull();

        // check that given DownloadPerAge varargs is not null.
        if (downloadsPerAge == null) {
            failWithMessage("Expecting downloadsPerAge parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getDownloadsPerAge(), downloadsPerAge);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual DownloadPerAgeStats's downloadsPerAge contains the given DownloadPerAge elements in Collection.
     *
     * @param downloadsPerAge the given elements that should be contained in actual DownloadPerAgeStats's downloadsPerAge.
     * @return this assertion object.
     * @throws AssertionError if the actual DownloadPerAgeStats's downloadsPerAge does not contain all given DownloadPerAge elements.
     */
    public S hasDownloadsPerAge(java.util.Collection<? extends DownloadPerAge> downloadsPerAge) {
        // check that actual DownloadPerAgeStats we want to make assertions on is not null.
        isNotNull();

        // check that given DownloadPerAge collection is not null.
        if (downloadsPerAge == null) {
            failWithMessage("Expecting downloadsPerAge parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContains(info, actual.getDownloadsPerAge(), downloadsPerAge.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual DownloadPerAgeStats's downloadsPerAge contains <b>only</b> the given DownloadPerAge elements and nothing else in whatever order.
     *
     * @param downloadsPerAge the given elements that should be contained in actual DownloadPerAgeStats's downloadsPerAge.
     * @return this assertion object.
     * @throws AssertionError if the actual DownloadPerAgeStats's downloadsPerAge does not contain all given DownloadPerAge elements.
     */
    public S hasOnlyDownloadsPerAge(DownloadPerAge... downloadsPerAge) {
        // check that actual DownloadPerAgeStats we want to make assertions on is not null.
        isNotNull();

        // check that given DownloadPerAge varargs is not null.
        if (downloadsPerAge == null) {
            failWithMessage("Expecting downloadsPerAge parameter not to be null.");
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getDownloadsPerAge(), downloadsPerAge);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual DownloadPerAgeStats's downloadsPerAge contains <b>only</b> the given DownloadPerAge elements in Collection and nothing else in whatever order.
     *
     * @param downloadsPerAge the given elements that should be contained in actual DownloadPerAgeStats's downloadsPerAge.
     * @return this assertion object.
     * @throws AssertionError if the actual DownloadPerAgeStats's downloadsPerAge does not contain all given DownloadPerAge elements.
     */
    public S hasOnlyDownloadsPerAge(java.util.Collection<? extends DownloadPerAge> downloadsPerAge) {
        // check that actual DownloadPerAgeStats we want to make assertions on is not null.
        isNotNull();

        // check that given DownloadPerAge collection is not null.
        if (downloadsPerAge == null) {
            failWithMessage("Expecting downloadsPerAge parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
        Iterables.instance().assertContainsOnly(info, actual.getDownloadsPerAge(), downloadsPerAge.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual DownloadPerAgeStats's downloadsPerAge does not contain the given DownloadPerAge elements.
     *
     * @param downloadsPerAge the given elements that should not be in actual DownloadPerAgeStats's downloadsPerAge.
     * @return this assertion object.
     * @throws AssertionError if the actual DownloadPerAgeStats's downloadsPerAge contains any given DownloadPerAge elements.
     */
    public S doesNotHaveDownloadsPerAge(DownloadPerAge... downloadsPerAge) {
        // check that actual DownloadPerAgeStats we want to make assertions on is not null.
        isNotNull();

        // check that given DownloadPerAge varargs is not null.
        if (downloadsPerAge == null) {
            failWithMessage("Expecting downloadsPerAge parameter not to be null.");
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getDownloadsPerAge(), downloadsPerAge);

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual DownloadPerAgeStats's downloadsPerAge does not contain the given DownloadPerAge elements in Collection.
     *
     * @param downloadsPerAge the given elements that should not be in actual DownloadPerAgeStats's downloadsPerAge.
     * @return this assertion object.
     * @throws AssertionError if the actual DownloadPerAgeStats's downloadsPerAge contains any given DownloadPerAge elements.
     */
    public S doesNotHaveDownloadsPerAge(java.util.Collection<? extends DownloadPerAge> downloadsPerAge) {
        // check that actual DownloadPerAgeStats we want to make assertions on is not null.
        isNotNull();

        // check that given DownloadPerAge collection is not null.
        if (downloadsPerAge == null) {
            failWithMessage("Expecting downloadsPerAge parameter not to be null.");
            return myself; // to fool Eclipse "Null pointer access" warning on toArray.
        }

        // check with standard error message (use overridingErrorMessage before contains to set your own message).
        Iterables.instance().assertDoesNotContain(info, actual.getDownloadsPerAge(), downloadsPerAge.toArray());

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual DownloadPerAgeStats has no downloadsPerAge.
     *
     * @return this assertion object.
     * @throws AssertionError if the actual DownloadPerAgeStats's downloadsPerAge is not empty.
     */
    public S hasNoDownloadsPerAge() {
        // check that actual DownloadPerAgeStats we want to make assertions on is not null.
        isNotNull();

        // we override the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have downloadsPerAge but had :\n  <%s>";

        // check
        if (actual.getDownloadsPerAge().iterator().hasNext()) {
            failWithMessage(assertjErrorMessage, actual, actual.getDownloadsPerAge());
        }

        // return the current assertion for method chaining
        return myself;
    }


    /**
     * Verifies that the actual DownloadPerAgeStats's percentOlder1000 is equal to the given one.
     *
     * @param percentOlder1000 the given percentOlder1000 to compare the actual DownloadPerAgeStats's percentOlder1000 to.
     * @return this assertion object.
     * @throws AssertionError - if the actual DownloadPerAgeStats's percentOlder1000 is not equal to the given one.
     */
    public S hasPercentOlder1000(Integer percentOlder1000) {
        // check that actual DownloadPerAgeStats we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting percentOlder1000 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualPercentOlder1000 = actual.getPercentOlder1000();
        if (!Objects.areEqual(actualPercentOlder1000, percentOlder1000)) {
            failWithMessage(assertjErrorMessage, actual, percentOlder1000, actualPercentOlder1000);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual DownloadPerAgeStats's percentOlder2000 is equal to the given one.
     *
     * @param percentOlder2000 the given percentOlder2000 to compare the actual DownloadPerAgeStats's percentOlder2000 to.
     * @return this assertion object.
     * @throws AssertionError - if the actual DownloadPerAgeStats's percentOlder2000 is not equal to the given one.
     */
    public S hasPercentOlder2000(Integer percentOlder2000) {
        // check that actual DownloadPerAgeStats we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting percentOlder2000 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualPercentOlder2000 = actual.getPercentOlder2000();
        if (!Objects.areEqual(actualPercentOlder2000, percentOlder2000)) {
            failWithMessage(assertjErrorMessage, actual, percentOlder2000, actualPercentOlder2000);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual DownloadPerAgeStats's percentOlder3000 is equal to the given one.
     *
     * @param percentOlder3000 the given percentOlder3000 to compare the actual DownloadPerAgeStats's percentOlder3000 to.
     * @return this assertion object.
     * @throws AssertionError - if the actual DownloadPerAgeStats's percentOlder3000 is not equal to the given one.
     */
    public S hasPercentOlder3000(Integer percentOlder3000) {
        // check that actual DownloadPerAgeStats we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting percentOlder3000 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        Integer actualPercentOlder3000 = actual.getPercentOlder3000();
        if (!Objects.areEqual(actualPercentOlder3000, percentOlder3000)) {
            failWithMessage(assertjErrorMessage, actual, percentOlder3000, actualPercentOlder3000);
        }

        // return the current assertion for method chaining
        return myself;
    }

}
