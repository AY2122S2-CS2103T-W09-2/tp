package seedu.address.model.person;

import java.util.List;
import java.util.function.Predicate;

import seedu.address.commons.util.StringUtil;

/**
 * Tests that a {@code Person}'s {@code Name}, {@code Phone}, {@code Email}, {@code Address} and
 * {@code Tag} matches any of the keywords given.
 */
public class PersonContainsKeywordsPredicate implements Predicate<Person> {
    private final List<String> keywords;

    public PersonContainsKeywordsPredicate(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean test(Person person) {
        return keywords.stream()
                .anyMatch(keyword -> {
                    return StringUtil.containsWordIgnoreCase(person.getName().getValue(), keyword)
                            || StringUtil.containsWordIgnoreCase(person.getPhone().getValue(), keyword)
                            || StringUtil.containsWordIgnoreCase(person.getEmail().getValue(), keyword)
                            || StringUtil.containsWordIgnoreCase(person.getAddress().getValue(), keyword)
                            || person.getTags().stream().map(tag -> tag.value).anyMatch(keyword::equalsIgnoreCase);
                });
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof PersonContainsKeywordsPredicate // instanceof handles nulls
                && keywords.equals(((PersonContainsKeywordsPredicate) other).keywords)); // state check
    }

}
