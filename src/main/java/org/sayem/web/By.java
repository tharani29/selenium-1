/*
 Copyright 2014 Red Hat, Inc. and/or its affiliates.

 This file is part of darcy-web.

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.sayem.web;

import org.sayem.ui.LocatorNotSupportedException;
import org.sayem.ui.api.Context;
import org.sayem.ui.api.Locator;
import org.sayem.ui.api.elements.Findable;
import org.sayem.web.internal.FindsByClassName;
import org.sayem.web.internal.FindsByCss;
import org.sayem.web.internal.FindsByHtmlTag;
import org.sayem.web.internal.FindsByUrl;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Objects;

/**
 * Adds some web-specific {@link Locator}s to the default {@link org.sayem.ui.By} options.
 */
public abstract class By extends org.sayem.ui.By {
    public static Locator css(String css) {
        return new ByCss(css);
    }
    
    public static Locator htmlTag(String tag) {
        return new ByHtmlTag(tag);
    }

    public static Locator className(String className) {
        return new ByClassName(className);
    }

    public static Locator value(String value) {
        return new ByAttribute("value", value);
    }

    public static Locator labelFor(String inputId) {
        return new ByAttribute("for", inputId);
    }

    public static ByUrl url(String url) {
        return new ByUrl(Matchers.equalTo(url));
    }

    public static ByUrl url(Matcher<? super String> url) {
        return new ByUrl(url);
    }

    public static class ByCss implements Locator {
        private final String css;
        
        public ByCss(String css) {
            this.css = css;
        }

        @Override
        public <T extends Findable> List<T> findAll(Class<T> type, Context context) {
            return ((FindsByCss) context).findAllByCss(type, css);
        }

        @Override
        public <T extends Findable> T find(Class<T> type, Context context) {
            return ((FindsByCss) context).findByCss(type, css);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ByCss byCss = (ByCss) o;

            return css.equals(byCss.css);

        }

        @Override
        public int hashCode() {
            return css.hashCode();
        }

        @Override
        public String toString() {
            return "ByCss{" +
                    "css='" + css + '\'' +
                    '}';
        }
    }
    
    public static class ByHtmlTag implements Locator {
        private final String tag;
        
        public ByHtmlTag(String tag) {
            this.tag = Objects.requireNonNull(tag, "tag");
        }

        @Override
        public <T extends Findable> List<T> findAll(Class<T> type, Context context) {
            return ((FindsByHtmlTag) context).findAllByHtmlTag(type, tag);
        }

        @Override
        public <T extends Findable> T find(Class<T> type, Context context) {
            return ((FindsByHtmlTag) context).findByHtmlTag(type, tag);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ByHtmlTag byHtmlTag = (ByHtmlTag) o;

            return tag.equals(byHtmlTag.tag);

        }

        @Override
        public int hashCode() {
            return tag.hashCode();
        }
    }

    private static class ByClassName implements Locator {
        private final String className;

        public ByClassName(String className) {
            this.className = Objects.requireNonNull(className, "className");
        }

        @Override
        public <T extends Findable> List<T> findAll(Class<T> type, Context context) {
            return ((FindsByClassName) context).findAllByClassName(type, className);
        }

        @Override
        public <T extends Findable> T find(Class<T> type, Context context) {
            return ((FindsByClassName) context).findByClassName(type, className);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ByClassName that = (ByClassName) o;

            return className.equals(that.className);

        }

        @Override
        public int hashCode() {
            return className.hashCode();
        }

        @Override
        public String toString() {
            return "ByClassName{" +
                    "className='" + className + '\'' +
                    '}';
        }
    }

    public static class ByUrl implements Locator {
        private final Matcher<? super String> urlMatcher;

        public ByUrl(Matcher<? super String> urlMatcher) {
            this.urlMatcher = Objects.requireNonNull(urlMatcher, "url");
        }

        @Override
        public <T extends Findable> List<T> findAll(Class<T> type, Context context) {
            try {
                return ((FindsByUrl) context).findAllByUrl(type, urlMatcher);
            } catch (ClassCastException e) {
                throw new LocatorNotSupportedException(this);
            }
        }

        @Override
        public <T extends Findable> T find(Class<T> type, Context context) {
            try {
                return ((FindsByUrl) context).findByUrl(type, urlMatcher);
            } catch (ClassCastException e) {
                throw new LocatorNotSupportedException(this);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ByUrl byUrl = (ByUrl) o;
            // Known issue: most matchers do not properly implement equals
            return Objects.equals(urlMatcher, byUrl.urlMatcher);
        }

        @Override
        public int hashCode() {
            return Objects.hash(urlMatcher);
        }

        @Override
        public String toString() {
            return "ByUrl{" +
                    "urlMatcher='" + urlMatcher + '\'' +
                    '}';
        }
    }
}
