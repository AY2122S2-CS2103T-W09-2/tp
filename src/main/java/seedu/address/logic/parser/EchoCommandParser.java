package seedu.address.logic.parser;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.EchoCommand;
import seedu.address.logic.parser.exceptions.ParseException;


public class EchoCommandParser implements Parser<EchoCommand> {

    @Override
    public EchoCommand parse(String userInput) throws ParseException {
        requireNonNull(userInput);
        return new EchoCommand(userInput.trim());
    }
}
