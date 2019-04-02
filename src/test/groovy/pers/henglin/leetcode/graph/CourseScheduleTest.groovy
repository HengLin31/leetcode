package pers.henglin.leetcode.graph

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class CourseScheduleTest extends Specification {
    def "test CourseSchedule"(){
        setup: "setup CourseSchedule"
        Verification verification = new CourseSchedule()

        expect: "verify result"
        verification.verify(input) == output

        where: "input data set"
        input                                                                || output
        [numCourses: 2, prerequisites:  [[0, 1]]          as int[][]]        || true
        [numCourses: 2, prerequisites:  [[1, 0], [0, 1]]  as int[][]]        || false
    }
}
