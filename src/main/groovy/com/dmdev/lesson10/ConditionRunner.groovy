package com.dmdev.lesson10

class ConditionRunner {

    /**
     * boolean          is true
     * Collection/Map   is not empty
     * Matcher          has match
     * String/GString   is not empty
     * Number/Char      != 0
     * reference        != null
     *
     * asBoolean
     */
    static void main(String[] args) {
        int x = 10
//        boolean booleanResult = x > 0
        if (x) {
            println "x=$x"
        }

        def person = new Person(19)
        if (person) {
            println "person.getId()=${person.getId()}"
        }

//        if (person != null) {
//            person.getId()
//        }
//        person?.getId()
        Person nullPerson = null
        def id = nullPerson?.getId()
        if (!id) println('id is null')

        if (x) {
            println x
        } else {
            println 1
        }

//        def result = x ? x : 1
        def result = x ?: 1
        println result
    }
}
