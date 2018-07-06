package com.pagoda.api.pridistribution;

import com.pagoda.api.*;
import com.pagoda.api.dto.pridistribution.*;
import io.swagger.annotations.*;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 配送价调价单明细表服务接口PriceAdjustSalDetailService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PriceAdjustSalDetail", description = "PriceAdjustSalDetail api")
public interface PriceAdjustSalDetailService extends Remote, BasePriceAdjustSalDetailService {}
