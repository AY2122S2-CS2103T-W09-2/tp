package seedu.address.logic.commands;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

public class EchoCommand extends Command {
    public static final String COMMAND_WORD = "echo";
    public static final String MESSAGE_SUCCESS = "Echo'ed!";
    private final String echoMessage;

    public EchoCommand(String echoMessage) {
        this.echoMessage = echoMessage;
    }

    public CommandResult execute(Model model) throws CommandException {
        return new CommandResult(MESSAGE_SUCCESS + this.echoMessage);
    }
}
