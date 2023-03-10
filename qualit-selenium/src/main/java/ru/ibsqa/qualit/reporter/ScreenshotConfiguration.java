package ru.ibsqa.qualit.reporter;

public enum  ScreenshotConfiguration {

    FOR_EACH_STEP("FOR_EACH_STEP"),
    DISABLED("DISABLED"),
    BEFORE_AND_AFTER_EACH_STEP("BEFORE_AND_AFTER_EACH_STEP"),
    FOR_FAILURES("FOR_FAILURES");


    private String value;

    ScreenshotConfiguration(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
