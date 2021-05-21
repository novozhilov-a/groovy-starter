package com.dmdev.lesson15

class RangeRunner {

    static void main(String[] args) {
        def range = 2..<8
        assert range.getClass() == IntRange

        assert range.get(3) == 5
        assert !range.contains(8)

        range.each { print "$it " }
        println()
        ('a'..'d').each { print "$it " }
        println()
        (WeekDay.WE..WeekDay.MO).each { print "$it " }
    }
}
