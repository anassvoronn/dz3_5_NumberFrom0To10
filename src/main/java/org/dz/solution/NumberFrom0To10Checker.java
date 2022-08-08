package org.dz.solution;

public class NumberFrom0To10Checker {
    public boolean check(final int number, final boolean strict) {
        if (strict) {
            if (number >= 0 && number <= 10) {
                return true;
            }
        } else {
            if (number > 0 && number < 10) {
                return true;
            }
        }
        return false;
    }
}
