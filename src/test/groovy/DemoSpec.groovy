import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class DemoSpec extends Specification {
    def "maximum of two numbers again"() {
        when:
        def results = Math.max(a, b)

        then:
        results == c

        where:
        a  | b | c
        3  | 7 | 7
        5  | 4 | 5
        9  | 9 | 9
        -1 | 0 | 0
    }

    def "minimum of #a and #b is #c"() {
        expect:
        Math.min(a, b) == c

        where:
        a | b || c
        3 | 7 || 3
        5 | 4 || 4
        9 | 9 || 9
    }

    def "#person.name is a #sex.toLowerCase() person"() {
        expect:
        person.getSex() == sex

        where:
        person                    || sex
        new Person(name: "Fred")  || "Male"
        new Person(name: "Wilma") || "Female"
    }

    static class Person {
        String name

        String getSex() {
            name == "Fred" ? "Male" : "Female"
        }
    }
}