package com.pagoda.api.purorgven;

import com.pagoda.api.*;
import com.pagoda.api.dto.purorgven.*;
import io.swagger.annotations.*;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 供应商机构商品 服务接口PurOrgVenGoodsService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PurOrgVenGoods", description = "PurOrgVenGoods api")
public interface PurOrgVenGoodsService extends Remote, BasePurOrgVenGoodsService {}
