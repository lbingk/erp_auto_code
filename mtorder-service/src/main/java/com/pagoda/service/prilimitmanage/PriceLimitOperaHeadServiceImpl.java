package com.pagoda.service.prilimitmanage;

import static com.pagoda.domain.prilimitmanage.sql.PriceLimitOperaHeadDynamicSqlSupport.*;
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
 * 运营限价单头表服务实现类PriceLimitOperaHeadServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class PriceLimitOperaHeadServiceImpl extends BasePriceLimitOperaHeadServiceImpl
    implements PriceLimitOperaHeadService {}
