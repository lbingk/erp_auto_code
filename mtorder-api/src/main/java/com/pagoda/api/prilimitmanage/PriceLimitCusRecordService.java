package com.pagoda.api.prilimitmanage;

import com.pagoda.api.*;
import com.pagoda.api.dto.prilimitmanage.*;
import io.swagger.annotations.*;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 客户商品限价结果表(对客户零售价限制最终结果)服务接口PriceLimitCusRecordService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PriceLimitCusRecord", description = "PriceLimitCusRecord api")
public interface PriceLimitCusRecordService extends Remote, BasePriceLimitCusRecordService {}
