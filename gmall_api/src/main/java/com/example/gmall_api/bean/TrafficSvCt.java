package com.example.gmall_api.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class TrafficSvCt {

    // 渠道
    String ch;
    // 会话数
    Integer svCt;
}
