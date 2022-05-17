package top.codingmore.mpg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author 沉默王二
 * @since 2022-05-17
 */
@ApiModel(value="Users对象", description="用户表")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "users_id")
    @TableId(value = "users_id", type = IdType.AUTO)
    private Long users_id;

    @ApiModelProperty(value = "登录名")
    private String user_login;

    @ApiModelProperty(value = "密码")
    private String user_pass;

    @ApiModelProperty(value = "昵称")
    private String user_nicename;

    @ApiModelProperty(value = "Email")
    private String user_email;

    @ApiModelProperty(value = "网址")
    private String user_url;

    @ApiModelProperty(value = "注册时间")
    private Date user_registered;

    @ApiModelProperty(value = "激活码")
    private String user_activation_key;

    @ApiModelProperty(value = "用户状态")
    private Integer user_status;

    @ApiModelProperty(value = "图像")
    private String display_name;

    @ApiModelProperty(value = "用户类型 0 :后台 1：前端")
    private Integer user_type;

    @ApiModelProperty(value = "open_id")
    private String open_id;

    @ApiModelProperty(value = "属性")
    private String attribute;


    public Long getUsers_id() {
        return users_id;
    }

    public void setUsers_id(Long users_id) {
        this.users_id = users_id;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public String getUser_nicename() {
        return user_nicename;
    }

    public void setUser_nicename(String user_nicename) {
        this.user_nicename = user_nicename;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_url() {
        return user_url;
    }

    public void setUser_url(String user_url) {
        this.user_url = user_url;
    }

    public Date getUser_registered() {
        return user_registered;
    }

    public void setUser_registered(Date user_registered) {
        this.user_registered = user_registered;
    }

    public String getUser_activation_key() {
        return user_activation_key;
    }

    public void setUser_activation_key(String user_activation_key) {
        this.user_activation_key = user_activation_key;
    }

    public Integer getUser_status() {
        return user_status;
    }

    public void setUser_status(Integer user_status) {
        this.user_status = user_status;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public Integer getUser_type() {
        return user_type;
    }

    public void setUser_type(Integer user_type) {
        this.user_type = user_type;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "Users{" +
        "users_id=" + users_id +
        ", user_login=" + user_login +
        ", user_pass=" + user_pass +
        ", user_nicename=" + user_nicename +
        ", user_email=" + user_email +
        ", user_url=" + user_url +
        ", user_registered=" + user_registered +
        ", user_activation_key=" + user_activation_key +
        ", user_status=" + user_status +
        ", display_name=" + display_name +
        ", user_type=" + user_type +
        ", open_id=" + open_id +
        ", attribute=" + attribute +
        "}";
    }
}
