package cn.hewei.task.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by hewei on 2020/3/15.
 */
@Data
public class R<T> implements Serializable {

    /**
     * 服务端数据
     */
    private T data;

    /**
     * 状态码 0：失败 1：成功
     */
    private int code;

    /**
     * 描述信息
     */
    private String msg = "";


    public static R ok() {
        return new R<>().code(1).msg("成功");
    }

    public static R fail() {
        return new R<>().code(0).msg("失败");
    }

    public R<T> data(T data) {
        this.setData(data);
        return this;
    }

    public R<T> code(int code) {
        this.setCode(code);
        return this;
    }

    public R<T> msg(String msg) {
        this.setMsg(msg);
        return this;
    }


}
