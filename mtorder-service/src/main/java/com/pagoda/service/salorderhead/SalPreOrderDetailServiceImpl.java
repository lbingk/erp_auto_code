package com.pagoda.service.salorderhead;

import static com.pagoda.domain.salorderhead.sql.SalPreOrderDetailDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.pagoda.api.*;
import com.pagoda.api.dto.salorderhead.*;
import com.pagoda.api.salorderhead.*;
import com.pagoda.domain.salorderhead.*;
import com.pagoda.platform.jms.jpa.*;
import com.pagoda.repo.salorderhead.*;
import com.pagoda.service.salorderhead.base.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * 销售预订单明细表服务实现类SalPreOrderDetailServiceImpl，可以添加自定义的业务实现。
 *
 * @author ???
 */
@Service
@Validated
public class SalPreOrderDetailServiceImpl extends BaseSalPreOrderDetailServiceImpl {}
