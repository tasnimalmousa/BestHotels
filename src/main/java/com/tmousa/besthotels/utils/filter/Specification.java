package com.tmousa.besthotels.utils.filter;

interface Specification<T> {
    boolean isSatisfied(T item);
}