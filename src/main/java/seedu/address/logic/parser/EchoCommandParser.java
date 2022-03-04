package seedu.address.logic.parser;

import seedu.address.logic.commands.EchoCommand;
import seedu.address.logic.parser.exceptions.ParseException;

import static java.util.Objects.requireNonNull;

public class EchoCommandParser implements Parser<EchoCommand> {

    @Override
    public EchoCommand parse(String userInput) throws ParseException {
        requireNonNull(userInput);
        return new EchoCommand(userInput.trim());
    }
}
