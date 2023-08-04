/**
 * 统一返回类 R
 */
@Data
@NoArgsConstructor
public class R<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 数据
     */
    private T data;
    /**
     * 信息
     */
    private String message;

    /**
     * 静态码常量
     */
    public static Integer CODE_SUCCESS = 200;
    public static Integer CODE_FAILED = 0;
    public static Integer CODE_REDIRECT = 302;
    public static Integer CODE_NO_ACCESS = 403;
    public static Integer CODE_NOT_FOUND = 404;
    public static Integer CODE_ERROR = 500;
    /**
     * 信息常量
     */
    public static String MESSAGE_SUCCESS = "请求成功";
    public static String MESSAGE_FAILED = "请求失败";

    /**
     * 有参构造
     *
     * @param code    状态码
     * @param message 信息
     */
    public R(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 有参构造
     *
     * @param code    状态码
     * @param message 信息
     * @param data    数据
     */
    protected R(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     */
    public static <T> R<T> success() {
        return new R<>(CODE_SUCCESS, MESSAGE_SUCCESS);
    }

    /**
     * 成功返回结果
     *
     * @param message 返回的信息
     */
    public static <T> R<T> success(String message) {
        return new R<T>(CODE_SUCCESS, message);
    }

    /**
     * 成功返回结果
     *
     * @param data 返回的数据
     */
    public static <T> R<T> success(T data) {
        return new R<T>(CODE_SUCCESS, MESSAGE_SUCCESS, data);
    }

    /**
     * 成功返回结果
     *
     * @param data    返回的数据
     * @param message 返回的信息
     */
    public static <T> R<T> success(T data, String message) {
        return new R<>(CODE_SUCCESS, message, data);
    }

    /**
     * 成功返回结果
     *
     * @param code    返回的状态码
     * @param data    返回的数据
     * @param message 返回的信息
     */
    public static <T> R<T> success(Integer code, T data, String message) {
        return new R<>(code, message, data);
    }

    /**
     * 失败返回结果
     */
    public static <T> R<T> failed() {
        return new R<>(CODE_FAILED, MESSAGE_FAILED);
    }

    /**
     * 失败返回结果
     *
     * @param message 返回的信息
     */
    public static <T> R<T> failed(String message) {
        return new R<>(CODE_FAILED, message);
    }

    /**
     * 失败返回结果
     *
     * @param code    返回的状态码
     * @param message 返回的信息
     */
    public static <T> R<T> failed(Integer code, String message) {
        return new R<>(code, message);
    }
}
