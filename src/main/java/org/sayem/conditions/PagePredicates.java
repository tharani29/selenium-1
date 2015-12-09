package org.sayem.conditions;

import org.sayem.converters.GetText;
import org.sayem.converters.OptionalGetter;
import org.sayem.locators.Locators;
import org.sayem.pages.Page;
import org.sayem.selectors.Id;
import org.sayem.selectors.TagName;

import java.util.function.Predicate;

public enum PagePredicates implements Predicate<Page> {
    REACHED_CALENDAR_PAGE(
            Locators.<Page>element(Id.CONTENT)
                    .andThen(Locators.element(TagName.H1))
                    .andThen(GetText.TEXT)
                    .and(StringEquals.DATEPICKER)
    ),
    EXTJS_CALENDAR_NOT_DISPLAYED(
            Locators.<Page>optionalElement(Id.EXTJS_CALENDAR)
                    .and(OptionalPresents.PRESENT.negate().or(OptionalGetter.GET.and(ElementPredicates.DISPLAYED.negate())))),
    JQUERY_CALENDAR_NOT_DISPLAYED(
            Locators.<Page>optionalElement(Id.UI_DATEPICKER_DIV)
                    .and(OptionalPresents.PRESENT.negate().or(OptionalGetter.GET.and(ElementPredicates.DISPLAYED.negate())))
    );
    private final Predicate<Page> predicate;

    PagePredicates(Predicate<Page> predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean test(Page page) {
        return predicate.test(page);
    }

}
