package com.pagoda.service.purapply;

import static com.pagoda.domain.purapply.sql.PurApplyHeadDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.pagoda.api.*;
import com.pagoda.api.dto.purapply.*;
import com.pagoda.api.purapply.*;
import com.pagoda.domain.purapply.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.repo.purapply.*;
import com.pagoda.service.purapply.base.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * 采购请购单头表服务实现类PurApplyHeadServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class PurApplyHeadServiceImpl extends BasePurApplyHeadServiceImpl
    implements PurApplyHeadService {}
