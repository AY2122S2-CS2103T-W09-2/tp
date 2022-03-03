package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Tells a joke.
 */
public class JokeCommand extends Command {

    public static final String COMMAND_WORD = "joke";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Tells a joke.\n"
            + "Example: " + COMMAND_WORD;

    public static final String SHOWING_JOKE_MESSAGE = "Airplane food amirite";

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(SHOWING_JOKE_MESSAGE, true, false);
    }
}
