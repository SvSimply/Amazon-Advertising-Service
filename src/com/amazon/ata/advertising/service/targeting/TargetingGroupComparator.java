package com.amazon.ata.advertising.service.targeting;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class TargetingGroupComparator implements Comparator<TargetingGroup> {

    @Override
    public int compare(TargetingGroup o1, TargetingGroup o2) {
        if (o1.getClickThroughRate() > o2.getClickThroughRate()) {
            return 1;
        } else if (o1.getClickThroughRate() == o2.getClickThroughRate()) {
            return 0;
        } else {
            return -1;
        }
    }
//
//    @Override
//    public Comparator<TargetingGroup> reversed() {
//        return Comparator.super.reversed();
//    }
//
//    @Override
//    public Comparator<TargetingGroup> thenComparing(Comparator<? super TargetingGroup> other) {
//        return Comparator.super.thenComparing(other);
//    }
//
//    @Override
//    public <U> Comparator<TargetingGroup> thenComparing(Function<? super TargetingGroup, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
//        return Comparator.super.thenComparing(keyExtractor, keyComparator);
//    }
//
//    @Override
//    public <U extends Comparable<? super U>> Comparator<TargetingGroup> thenComparing(Function<? super TargetingGroup, ? extends U> keyExtractor) {
//        return Comparator.super.thenComparing(keyExtractor);
//    }
//
//    @Override
//    public Comparator<TargetingGroup> thenComparingInt(ToIntFunction<? super TargetingGroup> keyExtractor) {
//        return Comparator.super.thenComparingInt(keyExtractor);
//    }
//
//    @Override
//    public Comparator<TargetingGroup> thenComparingLong(ToLongFunction<? super TargetingGroup> keyExtractor) {
//        return Comparator.super.thenComparingLong(keyExtractor);
//    }
//
//    @Override
//    public Comparator<TargetingGroup> thenComparingDouble(ToDoubleFunction<? super TargetingGroup> keyExtractor) {
//        return Comparator.super.thenComparingDouble(keyExtractor);
//    }
}
