/*
 Copyright 2014 Red Hat, Inc. and/or its affiliates.

 This file is part of darcy-ui.

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

package org.sayem.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Supplier;

public class LazyList<T> implements List<T>, Caching {
    private final Supplier<List<T>> list;
    private List<T> cachedList;

    public LazyList(Supplier<List<T>> list) {
        this.list = list;
    }

    @Override
    public void invalidateCache() {
        cachedList = null;
    }

    @Override
    public int size() {
        return list().size();
    }

    @Override
    public boolean isEmpty() {
        return list().isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list().contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return list().iterator();
    }

    @Override
    public Object[] toArray() {
        return list().toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return list().toArray(a);
    }

    @Override
    public boolean add(T t) {
        return list().add(t);
    }

    @Override
    public boolean remove(Object o) {
        return list().remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return list().addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return list().addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list().removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list().retainAll(c);
    }

    @Override
    public void clear() {
        list().clear();
    }

    @Override
    public T get(int index) {
        return list().get(index);
    }

    @Override
    public T set(int index, T element) {
        return list().set(index, element);
    }

    @Override
    public void add(int index, T element) {
        list().add(index, element);
    }

    @Override
    public T remove(int index) {
        return list().remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return list().indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return list().lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return list().listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return list().listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return list().subList(fromIndex, toIndex);
    }

    private List<T> list() {
        if (cachedList == null) {
            cachedList = list.get();
        }

        return cachedList;
    }
}
