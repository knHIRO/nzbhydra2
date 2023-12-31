package org.nzbhydra.mapping.newznab.json.caps;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link CapsJsonSearchIdAttributesHolder} specific assertions - Generated by CustomAssertionGenerator.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public abstract class AbstractCapsJsonSearchIdAttributesHolderAssert<S extends AbstractCapsJsonSearchIdAttributesHolderAssert<S, A>, A extends CapsJsonSearchIdAttributesHolder> extends AbstractObjectAssert<S, A> {

    /**
     * Creates a new <code>{@link AbstractCapsJsonSearchIdAttributesHolderAssert}</code> to make assertions on actual CapsJsonSearchIdAttributesHolder.
     *
     * @param actual the CapsJsonSearchIdAttributesHolder we want to make assertions on.
     */
    protected AbstractCapsJsonSearchIdAttributesHolderAssert(A actual, Class<S> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual CapsJsonSearchIdAttributesHolder's attributes is equal to the given one.
     *
     * @param attributes the given attributes to compare the actual CapsJsonSearchIdAttributesHolder's attributes to.
     * @return this assertion object.
     * @throws AssertionError - if the actual CapsJsonSearchIdAttributesHolder's attributes is not equal to the given one.
     */
    public S hasAttributes(CapsJsonIdAttributes attributes) {
        // check that actual CapsJsonSearchIdAttributesHolder we want to make assertions on is not null.
        isNotNull();

        // overrides the default error message with a more explicit one
        String assertjErrorMessage = "\nExpecting attributes of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

        // null safe check
        CapsJsonIdAttributes actualAttributes = actual.getAttributes();
        if (!Objects.areEqual(actualAttributes, attributes)) {
            failWithMessage(assertjErrorMessage, actual, attributes, actualAttributes);
        }

        // return the current assertion for method chaining
        return myself;
    }

}
