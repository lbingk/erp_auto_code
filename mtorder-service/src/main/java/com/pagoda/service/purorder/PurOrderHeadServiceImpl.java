package com.pagoda.service.purorder;

import static com.pagoda.domain.purorder.sql.PurOrderHeadDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.pagoda.api.*;
import com.pagoda.api.dto.purorder.*;
import com.pagoda.api.purorder.*;
import com.pagoda.domain.purorder.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.repo.purorder.*;
import com.pagoda.service.purorder.base.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * 采购订单头表服务实现类PurOrderHeadServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class PurOrderHeadServiceImpl extends BasePurOrderHeadServiceImpl
    implements PurOrderHeadService {}
