package com.pagoda.api.prilimitmanage;

import com.pagoda.api.*;
import com.pagoda.api.dto.prilimitmanage.*;
import io.swagger.annotations.*;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 限价单商品明细表服务接口PriceLimitGoodsDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PriceLimitGoodsDetail", description = "PriceLimitGoodsDetail api")
public interface PriceLimitGoodsDetailService extends Remote, BasePriceLimitGoodsDetailService {}
