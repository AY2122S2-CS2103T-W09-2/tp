package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/", true);
    public static final Prefix PREFIX_PHONE = new Prefix("p/", true);
    public static final Prefix PREFIX_EMAIL = new Prefix("e/", true);
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/", true);
    public static final Prefix PREFIX_TAG = new Prefix("t/", false);

}
