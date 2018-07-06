package com.pagoda.service.prilimitmanage;

import static com.pagoda.domain.prilimitmanage.sql.PriceLimitCatRecordDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.pagoda.api.*;
import com.pagoda.api.dto.prilimitmanage.*;
import com.pagoda.api.prilimitmanage.*;
import com.pagoda.domain.prilimitmanage.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.repo.prilimitmanage.*;
import com.pagoda.service.prilimitmanage.base.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * 层级商品限价结果表(对层级价格限制最终结果)服务实现类PriceLimitCatRecordServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class PriceLimitCatRecordServiceImpl extends BasePriceLimitCatRecordServiceImpl
    implements PriceLimitCatRecordService {}
