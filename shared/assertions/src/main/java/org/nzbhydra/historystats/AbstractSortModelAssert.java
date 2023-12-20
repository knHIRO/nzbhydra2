package org.nzbhydra.historystats;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link SortModel} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractSortModelAssert<S extends AbstractSortModelAssert<S, A>, A extends SortModel> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractSortModelAssert}</code> to make assertions on actual SortModel.
     *
     * @param actual the SortModel we want to make assertions on.
     */
    protected AbstractSortModelAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual SortModel's column is equal to the given one.
     *
     * @param column the given column to compare the actual SortModel's column to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SortModel's column is not equal to the given one.
     */
    public S hasColumn(String column) {
        // check that actual SortModel we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting column of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        String actualColumn = actual.getColumn();
        if (!Objects.areEqual(actualColumn, column)) {
            failWithMessage(assertjErrorMessage, actual, column, actualColumn);
        }

        // return the current assertion for method chaining
        return myself;
    }

    /**
     * Verifies that the actual SortModel's sortMode is equal to the given one.
     *
     * @param sortMode the given sortMode to compare the actual SortModel's sortMode to.
     * @return this assertion object.
     * @throws AssertionError - if the actual SortModel's sortMode is not equal to the given one.
     */
    public S hasSortMode(int sortMode) {
        // check that actual SortModel we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting sortMode of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // check
        int actualSortMode = actual.getSortMode();
        if (actualSortMode != sortMode) {
            failWithMessage(assertjErrorMessage, actual, sortMode, actualSortMode);
        }

        // return the current assertion for method chaining
        return myself;
    }

}
