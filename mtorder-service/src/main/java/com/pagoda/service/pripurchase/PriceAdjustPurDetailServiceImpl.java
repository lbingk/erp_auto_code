package com.pagoda.service.pripurchase;

import static com.pagoda.domain.pripurchase.sql.PriceAdjustPurDetailDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.pagoda.api.*;
import com.pagoda.api.dto.pripurchase.*;
import com.pagoda.api.pripurchase.*;
import com.pagoda.domain.pripurchase.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.repo.pripurchase.*;
import com.pagoda.service.pripurchase.base.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * 采购调价单明细服务实现类PriceAdjustPurDetailServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class PriceAdjustPurDetailServiceImpl extends BasePriceAdjustPurDetailServiceImpl
    implements PriceAdjustPurDetailService {}
