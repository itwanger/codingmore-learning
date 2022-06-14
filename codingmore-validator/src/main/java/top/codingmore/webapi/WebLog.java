package top.codingmore.webapi;

import lombok.Data;

/**
 * 记录日志的对象
 */
@Data
public class WebLog {
    private String description;
    private String username;
    private Long startTime;
    private Integer spendTime;
    private String basePath;
    private String uri;
    private String url;
    private String method;
    private String ip;
    private Object parameter;
    private Object result;
}
