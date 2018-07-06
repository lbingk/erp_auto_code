package com.pagoda.service.pridistribution;

import static com.pagoda.domain.pridistribution.sql.PriceAdjustSalHeadDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.pagoda.api.*;
import com.pagoda.api.dto.pridistribution.*;
import com.pagoda.api.pridistribution.*;
import com.pagoda.domain.pridistribution.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.repo.pridistribution.*;
import com.pagoda.service.pridistribution.base.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * 配送价调价单头表服务实现类PriceAdjustSalHeadServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class PriceAdjustSalHeadServiceImpl extends BasePriceAdjustSalHeadServiceImpl
    implements PriceAdjustSalHeadService {}
