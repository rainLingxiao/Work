package com.cn.rain.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by rain on 2018/1/16.
 */
@Getter
@Setter
public class TeUserParam implements Serializable{

    private static final long serialVersionUID = -5012849841717712407L;

    private String id;

    private String rname;

    private String telno;

    private String memo;

    private String address;
}
