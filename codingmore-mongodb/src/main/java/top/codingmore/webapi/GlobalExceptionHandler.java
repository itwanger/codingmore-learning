package top.codingmore.webapi;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理类，对异常信息进行解析，并封装到统一的返回对象 ResultObject 中
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * `@ExceptionHandler` 注解的作用就是标识统一异常处理，它可以指定要统一处理的异常类型，比如说我们自定义的 ApiException。
     *
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = ApiException.class)
    public ResultObject handle(ApiException e) {
        if (e.getErrorCode() != null) {
            return ResultObject.failed(e.getErrorCode());
        }
        return ResultObject.failed(e.getMessage());
    }
}
