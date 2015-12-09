package org.sayem.converters;

import org.sayem.objectcache.OneKeyLFUPolicy;
import org.sayem.objectcache.SelfPopulatingCache;
import org.sayem.selenium.Locator;

import java.time.Month;

import static org.sayem.converters.StringToMonth.MonthMapper.MONTH_MAPPER;

public enum StringToMonth implements Locator<String, Month> {

    TO_MONTH;

    private static final SelfPopulatingCache<String, Month> maps = new SelfPopulatingCache<>(48, new OneKeyLFUPolicy<>(), MONTH_MAPPER);

    @Override
    public Month locate(String element) {
        return maps.valueOf(element.toUpperCase());
    }

    enum MonthMapper implements SelfPopulatingCache.Creator<String, Month> {
        MONTH_MAPPER;

        @Override
        public Month create(String key) {

            Month month = null;
            try {
                month = Month.valueOf(key);
            } catch (IllegalArgumentException e) {
                String newKey;
                if (key.contains(".")) {
                    newKey = key.replace(".", "");
                } else {
                    newKey = key;
                }
                for (Month m : Month.values()) {
                    if (m.name().contains(newKey)) {
                        return m;
                    }
                }
            }
            return month;
        }
    }

}
