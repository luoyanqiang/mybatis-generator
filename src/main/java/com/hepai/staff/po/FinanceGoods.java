package com.hepai.staff.po;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Table(name = "finance_goods")
@Data
public class FinanceGoods {
    @Id
    @Column(name = "goods_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer goodsId;

    /**
     * 产品名称
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 产品数量
     */
    @Column(name = "goods_num")
    private Integer goodsNum;

    /**
     * 产品数量，单位分
     */
    @Column(name = "goods_price")
    private Integer goodsPrice;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}