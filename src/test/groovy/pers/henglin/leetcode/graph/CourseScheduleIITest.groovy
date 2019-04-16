package pers.henglin.leetcode.graph

import pers.henglin.leetcode.Verification
import spock.lang.Specification

class CourseScheduleIITest extends Specification {
    def "test CourseScheduleII"(){
        setup: "setup CourseScheduleII"
        Verification verification = new CourseScheduleII()

        expect: "verify result"
        verification.verify(input) == output as int[]

        where: "input data set"
        input                                                                           || output
        [numCourses: 2, prerequisites:  [[0, 1]]                          as int[][]]   || [1, 0]
        [numCourses: 4, prerequisites:  [[1, 0], [2, 0], [3, 1], [3, 2]]  as int[][]]   || [0, 1, 2, 3]
    }
}
