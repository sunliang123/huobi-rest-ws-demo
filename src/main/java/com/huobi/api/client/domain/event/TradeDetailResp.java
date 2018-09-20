package com.huobi.api.client.domain.event;

import lombok.Getter;
import lombok.Setter;

/**
 * created by jacky. 2018/7/26 6:08 PM
 */
@Getter
@Setter
public class TradeDetailResp {
    private String id;
    private String status;
    private String subbed;
    private String ch;
    private long ts;
    private TradeTick tick;
}

