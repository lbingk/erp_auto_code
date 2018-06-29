package com.pagoda.service.salconsign;

import static com.pagoda.domain.salconsign.sql.SalConsignHeadDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.pagoda.api.*;
import com.pagoda.api.dto.salconsign.*;
import com.pagoda.api.salconsign.*;
import com.pagoda.domain.salconsign.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.repo.salconsign.*;
import com.pagoda.service.salconsign.base.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * 发货单头表服务实现类SalConsignHeadServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class SalConsignHeadServiceImpl extends BaseSalConsignHeadServiceImpl {}
