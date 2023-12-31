package org.nzbhydra.config;

/**
 * {@link NotificationConfigEntry} specific assertions - Generated by CustomAssertionGenerator.
 * <p>
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it,
 * extend {@link AbstractNotificationConfigEntryAssert} instead.
 */
@jakarta.annotation.Generated(value = "assertj-assertions-generator")
public class NotificationConfigEntryAssert extends AbstractNotificationConfigEntryAssert<NotificationConfigEntryAssert, NotificationConfigEntry> {

    /**
     * Creates a new <code>{@link NotificationConfigEntryAssert}</code> to make assertions on actual NotificationConfigEntry.
     *
     * @param actual the NotificationConfigEntry we want to make assertions on.
     */
    public NotificationConfigEntryAssert(NotificationConfigEntry actual) {
        super(actual, NotificationConfigEntryAssert.class);
    }

    /**
     * An entry point for NotificationConfigEntryAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
     * With a static import, one can write directly: <code>assertThat(myNotificationConfigEntry)</code> and get specific assertion with code completion.
     *
     * @param actual the NotificationConfigEntry we want to make assertions on.
     * @return a new <code>{@link NotificationConfigEntryAssert}</code>
     */
    @org.assertj.core.util.CheckReturnValue
    public static NotificationConfigEntryAssert assertThat(NotificationConfigEntry actual) {
        return new NotificationConfigEntryAssert(actual);
    }
}
