public enum ErrorCode {
    INVALID_INPUT(100, "The input given is invalid. Please change it."),
    NOT_FOUND(0, "The item was not founded"),
    SERVER_ERROR(303, "Server is unreachable");

    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static ErrorCode fromCode(int code) {
        for (ErrorCode error : ErrorCode.values()) {
            if (error.getCode() == code) {
                return error;
            }
        }
        return null;
    }

    public String getUserMessage() {
        return switch (this) {
            case INVALID_INPUT -> "Oops, an error appeared! Please check the data you entered.";
            case NOT_FOUND -> "There is an issue on our end. Please search later.";
            case SERVER_ERROR -> "The server can't be reached right now. Please return to the page in a few minutes.";
            default -> "An unknown error occured.";

        };
    }

    public boolean isFatal() {
        return this == SERVER_ERROR;
    }
}
