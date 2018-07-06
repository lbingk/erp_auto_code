package com.pagoda.api.purorgven;

import com.pagoda.api.*;
import com.pagoda.api.dto.purorgven.*;
import io.swagger.annotations.*;
import java.rmi.Remote;
import org.springframework.validation.annotation.Validated;

/**
 * 供应商机构服务接口PurOrgVenService，可以添加自定义的业务接口。
 *
 * @author ???
 */
@Validated
@Api(value = "PurOrgVen", description = "PurOrgVen api")
public interface PurOrgVenService extends Remote, BasePurOrgVenService {}
