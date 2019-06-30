package com.hepai.staff.po;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Table(name = "finance_order")
@Data
public class FinanceOrder {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer orderId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 下单数量
     */
    private Integer num;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}