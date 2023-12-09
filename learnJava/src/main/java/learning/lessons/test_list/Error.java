package main.java.learning.lessons.test_list;

import lombok.Getter;

@Getter
public class Error {

    private final String code;

    private final int priority;

    Error(final String code, final int priority) {
        this.code = code;
        this.priority = priority;
    }

    public String toString() {
        return "Error{ " +
                "code = " + code +
                ", priority = " + priority +
                "}";
    }
}
