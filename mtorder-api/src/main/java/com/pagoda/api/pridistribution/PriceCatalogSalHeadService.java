package com.pagoda.api.pridistribution;

import com.pagoda.api.*;
import com.pagoda.api.dto.pridistribution.*;
import io.swagger.annotations.*;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 价格目录头表(配送价格)服务接口PriceCatalogSalHeadService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PriceCatalogSalHead", description = "PriceCatalogSalHead api")
public interface PriceCatalogSalHeadService extends Remote, BasePriceCatalogSalHeadService {}
