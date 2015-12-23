package org.sayem.api;

import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

/**
 * Created by sayem on 12/7/15.
 */
public enum RestFactory {

    GET(GetAdapter::new),
    POST(PostAdapter::new),
    PUT(PostAdapter::new),
    DELETE(DeleteAdapter::new);

    public final RestAdapter adapter;

    private RestFactory(Supplier<RestAdapter> adapter) {
        this.adapter = requireNonNull(adapter).get();
    }
}