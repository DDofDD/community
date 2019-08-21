package life.majiang.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND("你找的问题不存在了，要不要换个试试？");

    CustomizeErrorCode(String message) {
        message = message;
    }
    private String message;
    @Override
    public String getMessage() {
        return message;
    }
}
